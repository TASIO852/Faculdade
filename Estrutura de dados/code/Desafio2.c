#include <stdio.h>
#include <stdlib.h>

#define TAM_MAX 10

typedef struct {
    int elementos[TAM_MAX];
    int topo;
} Pilha;

void inicializar(Pilha *pilha) {
    pilha->topo = -1;
}

void empilhar(Pilha *pilha, int valor) {
    if (pilha->topo == TAM_MAX - 1) {
        printf("Erro: pilha cheia!\n");
        return;
    }

    pilha->topo++;
    pilha->elementos[pilha->topo] = valor;
}

int desempilhar(Pilha *pilha) {
    if (pilha->topo == -1) {
        printf("Erro: pilha vazia!\n");
        return -1;
    }

    int valor = pilha->elementos[pilha->topo];
    pilha->topo--;
    return valor;
}

int topo(Pilha *pilha) {
    if (pilha->topo == -1) {
        printf("Erro: pilha vazia!\n");
        return -1;
    }

    return pilha->elementos[pilha->topo];
}

void exibir(Pilha *pilha) {
    if (pilha->topo == -1) {
        printf("Pilha vazia!\n");
        return;
    }

    printf("Elementos da pilha: ");
    for (int i = 0; i <= pilha->topo; i++) {
        printf("%d ", pilha->elementos[i]);
    }
    printf("\n");
}

void esvaziar(Pilha *pilha) {
    while (pilha->topo != -1) {
        desempilhar(pilha);
    }
}

int main() {
    Pilha minha_pilha;
    inicializar(&minha_pilha);

    int opcao = 0;

    while (opcao != 6) {
        printf("\n");
        printf("Escolha uma opção:\n");
        printf("1. Empilhar\n");
        printf("2. Desempilhar\n");
        printf("3. Consultar elemento do topo\n");
        printf("4. Exibir a pilha\n");
        printf("5. Esvaziar a pilha\n");
        printf("6. Sair\n");
        printf("Opção escolhida: ");
        scanf("%d", &opcao);

        switch (opcao) {
        case 1:
            printf("Digite o valor a ser empilhado: ");
            int valor;
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

   
