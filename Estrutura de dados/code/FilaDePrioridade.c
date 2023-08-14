#include <stdio.h>
#include <stdlib.h>

typedef struct celula celula;

struct celula
{
    celula *prox;
    char dado;
    int prioridade;
};

celula *inicializa()
{
    return NULL;
}

int vazia(celula *f)
{
    return (f == NULL);
}

void imprime(celula *f)
{
    celula *t = f;
    while (t != NULL)
    {
        printf("%c(%d) - ", t->dado, t->prioridade);
        t = t->prox;
    }
    printf("\n");
}

celula *cria(char v, int prioridade)
{
    celula *p = (celula *)malloc(sizeof(celula));
    p->dado = v;
    p->prioridade = prioridade;
    p->prox = NULL;
    return p;
}

celula *inserir_dado(celula *f, char dado, int prioridade)
{
    celula *novo = cria(dado, prioridade);
    celula *ant = NULL;
    celula *p = f;

    while (p != NULL && p->prioridade > prioridade)
    {
        ant = p;
        p = p->prox;
    }

    if (ant == NULL)
    {
        novo->prox = f;
        f = novo;
    }
    else
    {
        novo->prox = ant->prox;
        ant->prox = novo;
    }

    return f;
}

celula *retira(celula *f, char v)
{
    celula *ant = NULL;
    celula *p = f;

    while (p != NULL && p->dado != v)
    {
        ant = p;
        p = p->prox;
    }

    if (p == NULL)
    {
        return f;
    }

    if (ant == NULL)
    {
        f = p->prox;
    }
    else
    {
        ant->prox = p->prox;
    }

    free(p);
    return f;
}

char prox_da_fila(celula *f)
{
    return f->dado;
}
