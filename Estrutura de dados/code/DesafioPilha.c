#include <stdio.h>

#define TAMANHO_PILHA 30

typedef struct
{
	int codigo;
	char titulo[100];
} Livro;

Livro livro[TAMANHO_PILHA]; // pilha de livros
int tampilha = 0;			// topo da pilha

/* exibe o cabeçalho */
void cabec()
{
	printf("-------------------------------\n");
	printf("Pilha de Livros\n");
	printf("-------------------------------\n");
}

/* insere um novo livro na pilha */
void inserir()
{
	int continuar;
	do
	{
		cabec();
		printf("\nColocar livro no topo da pilha\n");
		printf("\nCodigo do livro: ");
		scanf("%d", &livro[tampilha].codigo);
		printf("\nTitulo do Livro: ");
		fflush(stdin);
		fgets(livro[tampilha].titulo, 100, stdin);

		// inserir livro na pilha
		if (tampilha < TAMANHO_PILHA)
		{ /* se ainda tem vaga na pilha */
			tampilha++;
			printf("\n\nInserido com sucesso!!\n\n");
		}
		else /* pilha cheia */
			printf("\n\nPilha cheia, Livro não foi inserido!!\n\n");

		printf("Continuar inserindo (1-Sim/2-Não)? ");
		scanf("%d", &continuar);
	} while (continuar == 1); // verifica se gostaria de continuar inserindo livros
}

/* remove um livro da pilha */
void retirar()
{
	int confrem, continuar;
	do
	{
		cabec();
		printf("\nRetirar livro do topo da pilha\n");
		if (tampilha != 0)
		{ // verifica se tem elementos na pilha
			printf("\n\nCodigo Titulo\n");
			printf("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -\n");
			printf("%6d %-20s\n", livro[tampilha - 1].codigo, livro[tampilha - 1].titulo);
			printf("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -\n");
			printf("\nConfirma retirada do livro (1-Sim, 2-Não)? ");
			scanf("%d", &confrem);
			if (confrem == 1)
			{ // confirma que quer remover
				tampilha--;
				printf("\n\nRetirado da Pilha com sucesso!!!\n\n");
			}
			else // cancelou a remoção
				printf("\n\nRetirada cancelada\n\n");
		}
		else // pilha vazia
			printf("\n\nPilha vazia!!\n\n");
		printf("Deseja retirar outro livro(1-Sim, 2-Não)? ");
		scanf("%d", &continuar);
	} while (continuar == 1);
}

int main()
{
	cabec();
	printf("\n1 - Inserir livro na pilha\n");
	printf("2 - Retirar livro da pilha\n");
	printf("3 - Sair\n\n");
	printf("Escolha uma opção");
}