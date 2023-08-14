#include <stdio.h>
#include <stdlib.h>
#define TAM 100000

void bubble(int *, int);
void selection(int *, int);
void insertion(int *, int);
void geraNumeros(int *, int);

void bubble(int *vetor, int total)
{
    int i, j, tmp;

    for (i = 0; i < total; i++)
    {
        for (j = i + 1; j < total; j++)
        {
            if (vetor[i] > vetor[j])
            {
                tmp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = tmp;
            }
        }
    }
}

void selection(int *vetor, int total)
{
    int i, j, posMin, min, troca;

    for (i = 0; i < total - 1; i++)
    {
        troca = 0;
        posMin = i;
        min = vetor[i];
        for (j = i + 1; j < total; j++)
        {
            if (vetor[j] < min)
            {
                posMin = j;
                min = vetor[j];
                troca = 1;
            }
        }
        if (troca)
        {
            vetor[posMin] = vetor[i];
            vetor[i] = min;
        }
    }
}

void insertion(int *vetor, int total)
{
    int i, j, tmp;

    for (i = 1; i < total; i++)
    {
        tmp = vetor[i];
        for (j = i - 1; j >= 0 && tmp < vetor[j]; j--)
        {
            vetor[j + 1] = vetor[j];
        }
        vetor[j + 1] = tmp;
    }
}

void geraNumeros(int *vetor, int total)
{
    int i;
    for (i = 0; i < total; i++)
    {
        vetor[i] = 1 + rand() % 32000;
    }
}

main()
{
    int vetor[TAM] = {};
    geraNumeros(vetor, TAM);

    bubble(vetor, TAM);
    // selection(vetor, TAM);
    // insertion(vetor, TAM);
}