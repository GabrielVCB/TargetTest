#include <stdio.h>

int main() {
    int indice = 12;
    int soma = 0;
    int k = 1;

    while(k < indice) {
        k++;
        soma += k;
    }
    printf("Soma = %d", soma); //Soma = 77
}

