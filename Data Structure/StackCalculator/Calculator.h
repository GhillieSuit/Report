#pragma once
#ifndef CALCULATOR_H
#define CALCULATOR_H

typedef enum			//연산자 열거
{
	LEFT_PARENTHESIS = '(',
	RIGHT_PARENTHESIS = ')',
	PLUS = '+',
	MINUS = '-',
	MULTIPLY = '*',
	DIVIDE = '/',
	//PERCENT = '%',		// 소수를 구현하여 나머지 연산이 불필요
	SPACE = ' ',
	OPERAND
} SYMBOL;

char NUMBER[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.' };		//숫자 & 소숫점(피연산자)

int IsNumber(char Cipher)			//숫자인지 확인 (GetNextToken함수에서 사용)
{
	int i = 0;
	int ArrayLength = sizeof(NUMBER);	//배열의 길이

	for (i = 0; i < ArrayLength; i++)	//Cipher와 NUMBER배열을 하나하나 비교하여 숫자인지 파악
	{
		if (Cipher == NUMBER[i])
			return 1;					//숫자면 1반환
	}

	return 0;							//숫자가 아니면 0반환
}

unsigned int GetNextToken(char* Expression, char* Token, int* TYPE)
{
	unsigned int i = 0;

	for (i = 0; 0 != Expression[i]; i++)
	{
		Token[i] = Expression[i];			//중위식 배열을 토큰에 저장

		if (IsNumber(Expression[i]) == 1)	//피연산자라면
		{
			*TYPE = OPERAND;				//타입은 오퍼랜드

			if (IsNumber(Expression[i + 1]) != 1)	//두자리이상의 숫자 파악하기 위함
				break;
		}
		else								//연산자라면
		{
			*TYPE = Expression[i];			//타입은 각 연산자기호
			break;
		}
	}

	Token[++i] = '\0';	//토큰배열의 마지막 표기
	return i;			//자릿수 반환
}

int GetPriority(char Operator, int InStack)		//연산자 우선순위 확인 함수
{
	int Priority = -1;

	switch (Operator)
	{
	case LEFT_PARENTHESIS:		// "(" 0순위 혹은 3순위
		if (InStack)			//스택
			Priority = 3;
		else					//토큰
			Priority = 0;
		break;

	case MULTIPLY:				// "*"	1순위
	case DIVIDE:				// "/"
		Priority = 1;
		break;

	case PLUS:					// "+"	2순위
	case MINUS:					// "-"
		Priority = 2;
		break;
	}

	return Priority;			//우선순위 반환
}

int IsPrior(char OperatorInStack, char OperatorInToken)		//(GetPriority함수와 GetPostfix함수에서 사용)
{
	return (GetPriority(OperatorInStack, 1) > GetPriority(OperatorInToken, 0));	//스택이면 1, 토큰이면 0 반환
}

void GetPostfix(char* Infix, char* Postfix)		//중위식을 후위식으로 변환하는 함수
{
	char Token[32];							//토큰을 저장할 배열
	int  Type = -1;							//토큰 타입
	unsigned int Position = 0;				//중위식 위치
	unsigned int Length = strlen(Infix);	//중위식의 길이

	LinkedListStack* Stack;					//스택 생성
	LLS_CreateStack(&Stack);

	while (Position < Length)				
	{
		Position += GetNextToken(&Infix[Position], Token, &Type);	//GetNextToken함수는 토큰의 길이 반환한다

		if (Type == OPERAND)					//피연산자라면
		{
			strcat(Postfix, Token);				//Postfix배열에 토큰을 이어 저장
			strcat(Postfix, " ");
			printf("%s\n", Postfix);
		}
		else if (Type == RIGHT_PARENTHESIS)		// ")"라면
		{
			while (!LLS_IsEmpty(Stack))			// 스택이 빌때까지
			{
				Node* Popped = LLS_Pop(Stack);	//Pop연산하여 Popped에 저장

				if (Popped->Data[0] == LEFT_PARENTHESIS)	// "("라면
				{
					LLS_DestroyNode(Popped);				//노드 삭제
					break;
				}
				else										// "("아니라면
				{
					strcat(Postfix, Popped->Data);			//Postfix변수에 노드값 저장
					strcat(Postfix, " ");
					printf("%s\n", Postfix);
					LLS_DestroyNode(Popped);				//노드 삭제
				}
			}
		}
		else			//연산자라면
		{
					/*Stack값이 토큰이 아니고 비어있지 않다면*/
			while (!LLS_IsEmpty(Stack) && !IsPrior(LLS_Top(Stack)->Data[0], Token[0])) 
			{
				Node* Popped = LLS_Pop(Stack);	//Pop연산하여 Popped에 저장

				if (Popped->Data[0] != LEFT_PARENTHESIS)	// "("아니라면
				{
					strcat(Postfix, Popped->Data);			//Postfix변수에 노드값 저장
					strcat(Postfix, " ");
					printf("%s\n", Postfix);
				}
				LLS_DestroyNode(Popped);					//노드 삭제
			}
			LLS_Push(Stack, LLS_CreateNode(Token));			//Stack에 토큰을 Push
		}
	}

	while (!LLS_IsEmpty(Stack))			
	{
		Node* Popped = LLS_Pop(Stack);

		if (Popped->Data[0] != LEFT_PARENTHESIS)
			strcat(Postfix, Popped->Data);					//Postfix배열에 Popped를 이어 저장
			strcat(Postfix, " ");
			printf("%s\n", Postfix);

		LLS_DestroyNode(Popped);
	}

	LLS_DestroyStack(Stack);
}

double Calculate(char* Postfix)		//후위식 계산
{
	double Result;				//결과
	char Token[32];				//토큰을 저장할 배열
	int  Type = -1;				//토큰의 타입
	unsigned int Read = 0;		//후위식 배열의 인덱스
	unsigned int Length = strlen(Postfix);	//후위식 배열의 길이

	LinkedListStack* Stack;		//스택 생성
	LLS_CreateStack(&Stack);
	Node*  ResultNode;

	while (Read < Length)
	{
		Read += GetNextToken(&Postfix[Read], Token, &Type);	//토큰의 크기만큼

		if (Type == SPACE)		//공백이면 스킵
			continue;

		if (Type == OPERAND)		//피연산자라면
		{
			Node* NewNode = LLS_CreateNode(Token);	//NewNode생성하여 토큰저장
			LLS_Push(Stack, NewNode);				//NewNode를 Stack에 Push
		}
		else										//연산자라면
		{
			char   ResultString[32];				//
			double Operator1, Operator2, TempResult;//피연산자1, 피연산자2, 연산값
			Node* OperatorNode;						//

			OperatorNode = LLS_Pop(Stack);			//Pop연산하여 Oper에 저장
			Operator2 = atof(OperatorNode->Data);	//문자열을 실수로 변환하여 저장
			LLS_DestroyNode(OperatorNode);			//노드 삭제

			OperatorNode = LLS_Pop(Stack);			//위와 같음
			Operator1 = atof(OperatorNode->Data);
			LLS_DestroyNode(OperatorNode);

			switch (Type)	//연산자에 따른 연산
			{
			case PLUS:     
				TempResult = Operator1 + Operator2;
				printf("연산 : %f + %f = %f\n", Operator1, Operator2, TempResult);
				break;
			case MINUS:    
				TempResult = Operator1 - Operator2; 
				printf("연산 : %f - %f = %f\n", Operator1, Operator2, TempResult);
				break;
			case MULTIPLY: 
				TempResult = Operator1 * Operator2; 
				printf("연산 : %f * %f = %f\n", Operator1, Operator2, TempResult);
				break;
			case DIVIDE:   
				TempResult = Operator1 / Operator2; 
				printf("연산 : %f / %f = %f\n", Operator1, Operator2, TempResult);
				break;
			}
			_gcvt(TempResult, 10, ResultString);			//소수로 되어 있는 계산 결과를 문자열로 변환
			LLS_Push(Stack, LLS_CreateNode(ResultString));	//저장된 문자열을 Stack에 저장
		}
	}

	ResultNode = LLS_Pop(Stack);			//Pop연산으로 결과값을 꺼냄
	Result = atof(ResultNode->Data);		//문자열로 되어 있는 계산 결과를 소수를 변환
	LLS_DestroyNode(ResultNode);			//노드 삭제

	LLS_DestroyStack(Stack);				//노드 삭제

	return Result;							//결과값 반환
}

#endif