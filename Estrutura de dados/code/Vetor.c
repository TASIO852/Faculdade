#include <stdio.h>

#define NUM_PRODUTOS 3 // Define o número de produtos

int main() {
    float precos[NUM_PRODUTOS] = {12.50, 10.00, 100.00}; // Define os preços dos produtos
    float media[NUM_PRODUTOS]; // Define o vetor de médias

    // Calcula a média de cada produto
    for (int i = 0; i < NUM_PRODUTOS; i++) {
        media[i] = precos[i] / NUM_PRODUTOS;
    }

    // Imprime o vetor de médias
    for (int i = 0; i < NUM_PRODUTOS; i++) {
        printf("%.2f", media[i]);

        // Se não for o último elemento, imprime uma vírgula
        if (i < NUM_PRODUTOS - 1) {
            printf(", ");
        }
    }

    return 0;
}
