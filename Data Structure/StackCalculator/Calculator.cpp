#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "LinkedListStack.h"
#include "Calculator.h"

int main(void)
{
	char Infix[100];							//�������� ������ �迭
	char Postfix[100];							//�������� ������ �迭

	double Result = 0.0;						//����� ������ ����

	memset(Infix, 0, sizeof(Infix));			//0���� �ʱ�ȭ
	memset(Postfix, 0, sizeof(Postfix));		//0���� �ʱ�ȭ

	printf("Enter Infix : ");
	scanf("%s", Infix);							//���� �Է� ����

	GetPostfix(Infix, Postfix);					//�������� ���������� ��ȯ

	printf("Infix : %s\nPostfix : %s\n", Infix, Postfix);	//��ȯ�� ���

	Result = Calculate(Postfix);				//��� �� Result�� ����

	printf("Calculation Result : %f\n", Result);			//��� ��� ���

	scanf("%lf", &Result);		//���α׷� ���� ����

	return 0;
}