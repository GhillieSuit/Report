#pragma once
#ifndef LINKEDLIST_STACK_H
#define LINKEDLIST_STACK_H

typedef struct tagNode
{
	char* Data;
	struct tagNode* NextNode;
} Node;

typedef struct tagLinkedListStack
{
	Node* List;
	Node* Top;
}LinkedListStack;

void LLS_CreateStack(LinkedListStack** Stack)		//���� ���� �Լ�
{
	/*  ������ ��������ҿ� ���� */
	(*Stack) = (LinkedListStack*)malloc(sizeof(LinkedListStack));
	(*Stack)->List = NULL;
	(*Stack)->Top = NULL;
}

int LLS_IsEmpty(LinkedListStack* Stack)		//���� �������� Ȯ��
{
	return (Stack->List == NULL);
}

Node* LLS_Pop(LinkedListStack* Stack)		//Pop����
{
	/*  LLS_Pop() �Լ��� ��ȯ�� �ֻ��� ��� */
	Node* TopNode = Stack->Top;

	if (Stack->List == Stack->Top)
	{
		Stack->List = NULL;
		Stack->Top = NULL;
	}
	else
	{
		/*  ���ο� �ֻ��� ��带 ������ Top �ʵ忡 ����Ѵ�. */
		Node* CurrentTop = Stack->List;
		while (CurrentTop != NULL && CurrentTop->NextNode != Stack->Top)
		{
			CurrentTop = CurrentTop->NextNode;
		}
		Stack->Top = CurrentTop;
		CurrentTop->NextNode = NULL;
	}

	return TopNode;
}

void LLS_DestroyStack(LinkedListStack* Stack)		//���� ���� �Լ�
{
	while (!LLS_IsEmpty(Stack))
	{
		Node* Popped = LLS_Pop(Stack);
		free(Popped->Data);
		free(Popped);
	}

	free(Stack);	//������ ���� ����ҿ��� ����
}

Node* LLS_CreateNode(char* NewData)		//��� ���� �Լ�
{
	Node* NewNode = (Node*)malloc(sizeof(Node));	//�޸� �Ҵ�
	NewNode->Data = (char*)malloc(strlen(NewData) + 1);

	strcpy(NewNode->Data, NewData); //�����͸� �����Ѵ�.

	NewNode->NextNode = NULL;		//���� ��忡 ���� �����ʹ� NULL�� �ʱ�ȭ �Ѵ�.

	return NewNode;					//����� �ּҸ� ��ȯ�Ѵ�.
}

void  LLS_DestroyNode(Node* _Node)		//��� ���� �Լ�
{
	free(_Node->Data);
	free(_Node);
}

void LLS_Push(LinkedListStack* Stack, Node* NewNode)		//Push����
{
	if (Stack->List == NULL)
	{
		Stack->List = NewNode;
	}
	else
	{
		/*  �ֻ��� ��带 ã�� NewNode�� �����Ѵ�(�״´�). */
		Node* OldTop = Stack->List;
		while (OldTop->NextNode != NULL)
		{
			OldTop = OldTop->NextNode;
		}

		OldTop->NextNode = NewNode;
	}

	/*  ������ Top �ʵ忡 �� ����� �ּҸ� ����Ѵ�. */
	Stack->Top = NewNode;
}

Node* LLS_Top(LinkedListStack* Stack)		//Top ��ȯ
{
	return Stack->Top;
}

#endif