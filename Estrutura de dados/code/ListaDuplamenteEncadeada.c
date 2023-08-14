#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int value;
    struct Node *next;
    struct Node *prev;
} Node;

typedef struct LinkedList
{
    Node *head;
    Node *tail;
} LinkedList;

LinkedList *createLinkedList()
{
    LinkedList *list = (LinkedList *)malloc(sizeof(LinkedList));
    list->head = NULL;
    list->tail = NULL;
    return list;
}

Node *createNode(int value)
{
    Node *node = (Node *)malloc(sizeof(Node));
    node->value = value;
    node->next = NULL;
    node->prev = NULL;
    return node;
}

void insertNode(LinkedList *list, int value)
{
    Node *node = createNode(value);

    if (list->head == NULL)
    {
        list->head = node;
        list->tail = node;
    }
    else
    {
        list->tail->next = node;
        node->prev = list->tail;
        list->tail = node;
    }
}

void removeNode(LinkedList *list, int value)
{
    Node *node = list->head;

    while (node != NULL)
    {
        if (node->value == value)
        {
            if (node == list->head && node == list->tail)
            {
                list->head = NULL;
                list->tail = NULL;
            }
            else if (node == list->head)
            {
                list->head = node->next;
                list->head->prev = NULL;
            }
            else if (node == list->tail)
            {
                list->tail = node->prev;
                list->tail->next = NULL;
            }
            else
            {
                node->prev->next = node->next;
                node->next->prev = node->prev;
            }
            free(node);
            return;
        }
        node = node->next;
    }
}

void updateNode(LinkedList *list, int oldValue, int newValue)
{
    Node *node = list->head;

    while (node != NULL)
    {
        if (node->value == oldValue)
        {
            node->value = newValue;
            return;
        }
        node = node->next;
    }
}

void printList(LinkedList *list)
{
    Node *node = list->head;

    while (node != NULL)
    {
        printf("%d ", node->value);
        node = node->next;
    }
    printf("\n");
}

int main()
{
    LinkedList *list = createLinkedList();
    insertNode(list, 10);
    insertNode(list, 20);
    insertNode(list, 30);
    insertNode(list, 40);

    printf("Lista original: ");
    printList(list);

    removeNode(list, 20);

    printf("Lista após remoção: ");
    printList(list);

    updateNode(list, 30, 35);

    printf("Lista após atualização: ");
    printList(list);

    return 0;
}
