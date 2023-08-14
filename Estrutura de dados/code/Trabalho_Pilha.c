#include <stdio.h>
#include <stdlib.h>

#define MAX 100

// Definição da estrutura de dados pilha
typedef struct {
    int topo;/*Posição do elemento*/
    int elementos[MAX];
} Pilha;

// Função para cria a pilha
void criaPilha(Pilha *p) {
    p->topo = -1;
}

// Função para verificar se a pilha está vazia
int estaVazia(Pilha *p) {
    return (p->topo == -1);
}

// Função para verificar se a pilha está cheia
int estaCheia(Pilha *p) {
    return (p->topo == MAX - 1);
}

// Função para empilhar um elemento na pilha
void empilhar(Pilha *p, int valor) {
    if (estaCheia(p)) {
        printf("A pilha está cheia!\n");
    } else {
        p->topo++;
        p->elementos[p->topo] = valor;
    }
}

// Função para desempilhar um elemento da pilha
int desempilhar(Pilha *p) {
    int valor;
    if (estaVazia(p)) {
        printf("A pilha está vazia!\n");
        return -1; 
    } else {
        valor = p->elementos[p->topo];
        p->topo--;
        return valor;
    }
}

// Função para consultar o elemento do topo da pilha
int topo(Pilha *p) {
    if (estaVazia(p)) {
        printf("A pilha está vazia!\n");
        return -1;
    } else {
        return p->elementos[p->topo];
    }
}

// Função para exibir todos os elementos da pilha
void exibir(Pilha *p) {
    int i;
    if (estaVazia(p)) {
        printf("A pilha está vazia!\n");
    } else {
        printf("Pilha: ");
        for (i = p->topo; i >= 0; i--) {
            printf("%d ", p->elementos[i]);
        }
        printf("\n");
    }
}

// Função para remover todos os elementos da pilha
void esvaziar(Pilha *p) {
    if (estaVazia(p)) {
        printf("A pilha está vazia!\n"); /*true*/
    } else {
        p->topo = -1;
        printf("Pilha esvaziada com sucesso!\n");/*False*/
    }
}

// Função principal para interagir com a pilha
int main() {
    Pilha minha_pilha;
    criaPilha(&minha_pilha);

    int opcao = 0;
    int valor;

    while (opcao != 6) {
        printf("\nEscolha uma opção:\n");
        printf("1 - Empilhar um elemento\n");
        printf("2 - Desempilhar o elemento do topo\n");
        printf("3 - Consultar o elemento do topo\n");
        printf("4 - Exibir todos os elementos da pilha\n");
        printf("5 - Remover todos os elementos da pilha\n");
        printf("6 - Sair do programa\n");

        scanf("%d", &opcao);

        switch(opcao){
                
            case 1:
                printf("Digite o valor a ser empilhado: ");
                scanf("%d", &valor);
                empilhar(&minha_pilha, valor);
                break;
            case 2:
                valor = desempilhar(&minha_pilha);
                if (valor != -1) {
                    printf("Elemento desempilhado: %d\n", valor);
                }
                break;
            case 3:
                valor = topo(&minha_pilha);
                if (valor != -1) {
                    printf("Elemento do topo: %d\n", valor);
                }
                break;
            case 4:
                exibir(&minha_pilha);
                break;
            case 5:
                esvaziar(&minha_pilha);
                break;
            case 6:
                printf("Programa encerrado!\n");
                break;
            default:
                printf("Opção inválida!\n");
                break;
        }
    }

    return 0;
}

