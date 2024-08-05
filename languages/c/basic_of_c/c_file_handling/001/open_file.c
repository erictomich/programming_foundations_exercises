#include <stdio.h>

int main() {
    char buffer[100];
    FILE *file = fopen("example.txt", "r");
    
    if (file) {
        while (fgets(buffer, sizeof(buffer), file) != NULL) {
            printf("%s", buffer);
        }
        fclose(file);
    } else {
        printf("Error opening file.\n");
    }
    
    printf("\n\nDigite qualquer tecla para finalizar...");
    getchar();

    return 0;
}
