#include <stdio.h>

#define TAMANHO_FILA 30

struct Aluno
{
    int Matricula;
    char Nome[50];
    int Polo;
};

struct Aluno Aluno[TAMANHO_FILA];
int tamfila = 0;

void cabec()
{
    printf("===== Fila de Alunos =====\n");
}

void inserir()
{
    int continuar;
    do
    {
        cabec();
        printf("\nChegada de novo aluno na fila\n");
        printf("\nNumero da Matricula: ");
        scanf("%d", &Al.Matricula);
        printf("\nNome: ");
        fflush(stdin);
        gets(Al.Nome);
        printf("\nPolo do Aluno (1 - Batalha, 2 - Valenca): ");
        scanf("%d", &Al.Polo);
        if (tamfila < TAMANHO_FILA)
        {
            /* Se ainda tem vaga na fila */
            Aluno[tamfila] = Al;
            tamfila++;
            printf("\n\nAluno inserido com sucesso!\n\n");
        }
        else
        {
            /* Fila cheia*/
            printf("\n\nFila cheia, aluno não inserido!\n\n");
        }
        printf("\nContinuar inserindo (1-sim/2-não)? ");
        scanf("%d", &continuar);
    } while (continuar == 1 && tamfila < TAMANHO_FILA);
}

void retirar()
{
    cabec();
    printf("\nRemoção do primeiro aluno da fila\n");
    if (tamfila != 0)
    {
        printf("\nMatricula Nome Polo\n");
        printf("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --\n");
        printf("% 4d % -15s % 2d\n", Aluno[0].Matricula, Aluno[0].Nome, Aluno[0].Polo);
        printf("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -\n");
        for (int i = 1; i < tamfila; i++)
        {
            Aluno[i - 1] = Aluno[i];
        }
        tamfila--;
        printf("\n\nAluno removido com sucesso!\n\n");
    }
    else
    {
        printf("\n\nA fila está vazia!\n\n");
    }
    printf("\n\nTecle enter para voltar para o menu\n");
    getchar();
    getchar();
}

void consultarprimeiro()
{
    cabec();
    printf("\nConsulta primeiro aluno da fila\n");
    if (tamfila != 0)
    {
        printf("\nMatricula Nome Polo\n");
        printf("-- -- -- -- -- -- -- -- -- -- -- --");
    }
}
