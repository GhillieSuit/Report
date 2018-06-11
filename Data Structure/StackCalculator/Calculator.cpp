#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "LinkedListStack.h"
#include "Calculator.h"

int main(void)
{
	char Infix[100];							//중위식을 저장할 배열
	char Postfix[100];							//후위식을 저장할 배열

	double Result = 0.0;						//결과를 저장할 변수

	memset(Infix, 0, sizeof(Infix));			//0으로 초기화
	memset(Postfix, 0, sizeof(Postfix));		//0으로 초기화

	printf("Enter Infix : ");
	scanf("%s", Infix);							//계산식 입력 받음

	GetPostfix(Infix, Postfix);					//중위식을 후위식으로 변환

	printf("Infix : %s\nPostfix : %s\n", Infix, Postfix);	//변환값 출력

	Result = Calculate(Postfix);				//계산 후 Result에 저장

	printf("Calculation Result : %f\n", Result);			//계산 결과 출력

	scanf("%lf", &Result);		//프로그램 종료 방지

	return 0;
}