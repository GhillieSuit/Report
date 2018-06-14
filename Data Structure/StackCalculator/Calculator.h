#pragma once
#ifndef CALCULATOR_H
#define CALCULATOR_H

typedef enum			//������ ����
{
	LEFT_PARENTHESIS = '(',
	RIGHT_PARENTHESIS = ')',
	PLUS = '+',
	MINUS = '-',
	MULTIPLY = '*',
	DIVIDE = '/',
	//PERCENT = '%',		// �Ҽ��� �����Ͽ� ������ ������ ���ʿ�
	SPACE = ' ',
	OPERAND
} SYMBOL;

char NUMBER[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.' };		//���� & �Ҽ���(�ǿ�����)

int IsNumber(char Cipher)			//�������� Ȯ�� (GetNextToken�Լ����� ���)
{
	int i = 0;
	int ArrayLength = sizeof(NUMBER);	//�迭�� ����

	for (i = 0; i < ArrayLength; i++)	//Cipher�� NUMBER�迭�� �ϳ��ϳ� ���Ͽ� �������� �ľ�
	{
		if (Cipher == NUMBER[i])
			return 1;					//���ڸ� 1��ȯ
	}

	return 0;							//���ڰ� �ƴϸ� 0��ȯ
}

unsigned int GetNextToken(char* Expression, char* Token, int* TYPE)
{
	unsigned int i = 0;

	for (i = 0; 0 != Expression[i]; i++)
	{
		Token[i] = Expression[i];			//������ �迭�� ��ū�� ����

		if (IsNumber(Expression[i]) == 1)	//�ǿ����ڶ��
		{
			*TYPE = OPERAND;				//Ÿ���� ���۷���

			if (IsNumber(Expression[i + 1]) != 1)	//���ڸ��̻��� ���� �ľ��ϱ� ����
				break;
		}
		else								//�����ڶ��
		{
			*TYPE = Expression[i];			//Ÿ���� �� �����ڱ�ȣ
			break;
		}
	}

	Token[++i] = '\0';	//��ū�迭�� ������ ǥ��
	return i;			//�ڸ��� ��ȯ
}

int GetPriority(char Operator, int InStack)		//������ �켱���� Ȯ�� �Լ�
{
	int Priority = -1;

	switch (Operator)
	{
	case LEFT_PARENTHESIS:		// "(" 0���� Ȥ�� 3����
		if (InStack)			//����
			Priority = 3;
		else					//��ū
			Priority = 0;
		break;

	case MULTIPLY:				// "*"	1����
	case DIVIDE:				// "/"
		Priority = 1;
		break;

	case PLUS:					// "+"	2����
	case MINUS:					// "-"
		Priority = 2;
		break;
	}

	return Priority;			//�켱���� ��ȯ
}

int IsPrior(char OperatorInStack, char OperatorInToken)		//(GetPriority�Լ��� GetPostfix�Լ����� ���)
{
	return (GetPriority(OperatorInStack, 1) > GetPriority(OperatorInToken, 0));	//�����̸� 1, ��ū�̸� 0 ��ȯ
}

void GetPostfix(char* Infix, char* Postfix)		//�������� ���������� ��ȯ�ϴ� �Լ�
{
	char Token[32];							//��ū�� ������ �迭
	int  Type = -1;							//��ū Ÿ��
	unsigned int Position = 0;				//������ ��ġ
	unsigned int Length = strlen(Infix);	//�������� ����

	LinkedListStack* Stack;					//���� ����
	LLS_CreateStack(&Stack);

	while (Position < Length)				
	{
		Position += GetNextToken(&Infix[Position], Token, &Type);	//GetNextToken�Լ��� ��ū�� ���� ��ȯ�Ѵ�

		if (Type == OPERAND)					//�ǿ����ڶ��
		{
			strcat(Postfix, Token);				//Postfix�迭�� ��ū�� �̾� ����
			strcat(Postfix, " ");
			printf("%s\n", Postfix);
		}
		else if (Type == RIGHT_PARENTHESIS)		// ")"���
		{
			while (!LLS_IsEmpty(Stack))			// ������ ��������
			{
				Node* Popped = LLS_Pop(Stack);	//Pop�����Ͽ� Popped�� ����

				if (Popped->Data[0] == LEFT_PARENTHESIS)	// "("���
				{
					LLS_DestroyNode(Popped);				//��� ����
					break;
				}
				else										// "("�ƴ϶��
				{
					strcat(Postfix, Popped->Data);			//Postfix������ ��尪 ����
					strcat(Postfix, " ");
					printf("%s\n", Postfix);
					LLS_DestroyNode(Popped);				//��� ����
				}
			}
		}
		else			//�����ڶ��
		{
					/*Stack���� ��ū�� �ƴϰ� ������� �ʴٸ�*/
			while (!LLS_IsEmpty(Stack) && !IsPrior(LLS_Top(Stack)->Data[0], Token[0])) 
			{
				Node* Popped = LLS_Pop(Stack);	//Pop�����Ͽ� Popped�� ����

				if (Popped->Data[0] != LEFT_PARENTHESIS)	// "("�ƴ϶��
				{
					strcat(Postfix, Popped->Data);			//Postfix������ ��尪 ����
					strcat(Postfix, " ");
					printf("%s\n", Postfix);
				}
				LLS_DestroyNode(Popped);					//��� ����
			}
			LLS_Push(Stack, LLS_CreateNode(Token));			//Stack�� ��ū�� Push
		}
	}

	while (!LLS_IsEmpty(Stack))			
	{
		Node* Popped = LLS_Pop(Stack);

		if (Popped->Data[0] != LEFT_PARENTHESIS)
			strcat(Postfix, Popped->Data);					//Postfix�迭�� Popped�� �̾� ����
			strcat(Postfix, " ");
			printf("%s\n", Postfix);

		LLS_DestroyNode(Popped);
	}

	LLS_DestroyStack(Stack);
}

double Calculate(char* Postfix)		//������ ���
{
	double Result;				//���
	char Token[32];				//��ū�� ������ �迭
	int  Type = -1;				//��ū�� Ÿ��
	unsigned int Read = 0;		//������ �迭�� �ε���
	unsigned int Length = strlen(Postfix);	//������ �迭�� ����

	LinkedListStack* Stack;		//���� ����
	LLS_CreateStack(&Stack);
	Node*  ResultNode;

	while (Read < Length)
	{
		Read += GetNextToken(&Postfix[Read], Token, &Type);	//��ū�� ũ�⸸ŭ

		if (Type == SPACE)		//�����̸� ��ŵ
			continue;

		if (Type == OPERAND)		//�ǿ����ڶ��
		{
			Node* NewNode = LLS_CreateNode(Token);	//NewNode�����Ͽ� ��ū����
			LLS_Push(Stack, NewNode);				//NewNode�� Stack�� Push
		}
		else										//�����ڶ��
		{
			char   ResultString[32];				//
			double Operator1, Operator2, TempResult;//�ǿ�����1, �ǿ�����2, ���갪
			Node* OperatorNode;						//

			OperatorNode = LLS_Pop(Stack);			//Pop�����Ͽ� Oper�� ����
			Operator2 = atof(OperatorNode->Data);	//���ڿ��� �Ǽ��� ��ȯ�Ͽ� ����
			LLS_DestroyNode(OperatorNode);			//��� ����

			OperatorNode = LLS_Pop(Stack);			//���� ����
			Operator1 = atof(OperatorNode->Data);
			LLS_DestroyNode(OperatorNode);

			switch (Type)	//�����ڿ� ���� ����
			{
			case PLUS:     
				TempResult = Operator1 + Operator2;
				printf("���� : %f + %f = %f\n", Operator1, Operator2, TempResult);
				break;
			case MINUS:    
				TempResult = Operator1 - Operator2; 
				printf("���� : %f - %f = %f\n", Operator1, Operator2, TempResult);
				break;
			case MULTIPLY: 
				TempResult = Operator1 * Operator2; 
				printf("���� : %f * %f = %f\n", Operator1, Operator2, TempResult);
				break;
			case DIVIDE:   
				TempResult = Operator1 / Operator2; 
				printf("���� : %f / %f = %f\n", Operator1, Operator2, TempResult);
				break;
			}
			_gcvt(TempResult, 10, ResultString);			//�Ҽ��� �Ǿ� �ִ� ��� ����� ���ڿ��� ��ȯ
			LLS_Push(Stack, LLS_CreateNode(ResultString));	//����� ���ڿ��� Stack�� ����
		}
	}

	ResultNode = LLS_Pop(Stack);			//Pop�������� ������� ����
	Result = atof(ResultNode->Data);		//���ڿ��� �Ǿ� �ִ� ��� ����� �Ҽ��� ��ȯ
	LLS_DestroyNode(ResultNode);			//��� ����

	LLS_DestroyStack(Stack);				//��� ����

	return Result;							//����� ��ȯ
}

#endif