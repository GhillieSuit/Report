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

void LLS_CreateStack(LinkedListStack** Stack)		//스택 생성 함수
{
	/*  스택을 자유저장소에 생성 */
	(*Stack) = (LinkedListStack*)malloc(sizeof(LinkedListStack));
	(*Stack)->List = NULL;
	(*Stack)->Top = NULL;
}

int LLS_IsEmpty(LinkedListStack* Stack)		//공백 스택인지 확인
{
	return (Stack->List == NULL);
}

Node* LLS_Pop(LinkedListStack* Stack)		//Pop연산
{
	/*  LLS_Pop() 함수가 반환할 최상위 노드 */
	Node* TopNode = Stack->Top;

	if (Stack->List == Stack->Top)
	{
		Stack->List = NULL;
		Stack->Top = NULL;
	}
	else
	{
		/*  새로운 최상위 노드를 스택의 Top 필드에 등록한다. */
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

void LLS_DestroyStack(LinkedListStack* Stack)		//스택 삭제 함수
{
	while (!LLS_IsEmpty(Stack))
	{
		Node* Popped = LLS_Pop(Stack);
		free(Popped->Data);
		free(Popped);
	}

	free(Stack);	//스택을 자유 저장소에서 해제
}

Node* LLS_CreateNode(char* NewData)		//노드 생성 함수
{
	Node* NewNode = (Node*)malloc(sizeof(Node));	//메모리 할당
	NewNode->Data = (char*)malloc(strlen(NewData) + 1);

	strcpy(NewNode->Data, NewData); //데이터를 저장한다.

	NewNode->NextNode = NULL;		//다음 노드에 대한 포인터는 NULL로 초기화 한다.

	return NewNode;					//노드의 주소를 반환한다.
}

void  LLS_DestroyNode(Node* _Node)		//노드 삭제 함수
{
	free(_Node->Data);
	free(_Node);
}

void LLS_Push(LinkedListStack* Stack, Node* NewNode)		//Push연산
{
	if (Stack->List == NULL)
	{
		Stack->List = NewNode;
	}
	else
	{
		/*  최상위 노드를 찾아 NewNode를 연결한다(쌓는다). */
		Node* OldTop = Stack->List;
		while (OldTop->NextNode != NULL)
		{
			OldTop = OldTop->NextNode;
		}

		OldTop->NextNode = NewNode;
	}

	/*  스택의 Top 필드에 새 노드의 주소를 등록한다. */
	Stack->Top = NewNode;
}

Node* LLS_Top(LinkedListStack* Stack)		//Top 반환
{
	return Stack->Top;
}

#endif