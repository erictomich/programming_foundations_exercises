#include <stdio.h>
#include <string.h>

int main() {
    char name[50];
    char second_name[70];
    char home_place[100];
    
    printf("Hello, World!\n");
    
    printf("Enter your name: ");
    scanf("%49s", name);

    getchar();

    printf("My name is %s!\n\n", name);

    printf("Enter your second name: ");
    fgets(second_name, sizeof(second_name), stdin); //foi necessário utilizar fgets para permitir digitar espaço entre nomes, pois com scanf() não aceita

    /*
        remover o \n da string second_name: 

        strcspn() está na biblioteca string.h
        strcspn(name, "\n") calcula o índice onde o caractere \n aparece pela primeira vez em name.
        name[...] = '\0' substitui o caractere \n nesse índice por um terminador de string ('\0'), removendo assim o \n da string.
    */
    name[strcspn(name, "\n")] = '\0';

    printf("My name is %s %s\n\n", name, second_name);


    printf("Where do you live? ");
    fgets(home_place, sizeof(home_place), stdin);

    printf("I live on %s \n\n", home_place);


    printf("Digite qualquer tecla para finalizar...");
    getchar();

    return 0;
}