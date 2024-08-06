import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {
        // 1. For Loop - Iterando sobre um array de inteiros
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("For Loop - Array de inteiros:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Elemento " + i + ": " + intArray[i]);
        }

        // 2. For Loop - Iterando sobre uma lista de strings
        java.util.List<String> strList = java.util.Arrays.asList("Java", "Python", "C++", "JavaScript");
        System.out.println("\nFor Loop - Lista de strings:");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("Elemento " + i + ": " + strList.get(i));
        }

        // 3. Enhanced For Loop - Iterando sobre um array de inteiros
        System.out.println("\nEnhanced For Loop - Array de inteiros:");
        for (int value : intArray) {
            System.out.println("Valor: " + value);
        }

        // 4. Enhanced For Loop - Iterando sobre uma lista de strings
        System.out.println("\nEnhanced For Loop - Lista de strings:");
        for (String s : strList) {
            System.out.println("String: " + s);
        }

        // 5. While Loop - Somando elementos de um array de inteiros
        System.out.println("\nWhile Loop - Somando elementos de um array:");
        int sum = 0;
        int index = 0;
        while (index < intArray.length) {
            sum += intArray[index];
            index++;
        }
        System.out.println("Soma dos elementos: " + sum);

        // 6. Do-While Loop - Lendo input do usuário até que ele digite "sair"
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("\nDigite um comando (digite 'sair' para finalizar):");
            input = scanner.nextLine();
            System.out.println("Você digitou: " + input);
        } while (!input.equalsIgnoreCase("sair"));
        
        // 7. For Loop com break e continue
        System.out.println("\nFor Loop com break e continue:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Pular o loop na iteração 5");
                continue; // Pular o resto do código e ir para a próxima iteração
            }
            if (i == 8) {
                System.out.println("Parar o loop na iteração 8");
                break; // Sair do loop
            }
            System.out.println("Iteração " + i);
        }

        // 8. Loop Aninhado - Multiplicação de Matriz
        System.out.println("\nLoop Aninhado - Multiplicação de Matriz:");
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{2, 0}, {1, 2}};
        int[][] resultMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.println("Resultado [" + i + "][" + j + "]: " + resultMatrix[i][j]);
            }
        }

        // 9. Loop com Condição Complexa - Encontrar números primos
        System.out.println("\nLoop com Condição Complexa - Números primos até 20:");
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " é primo");
            }
        }

        // 10. Loop com Continue - Pular números ímpares
        System.out.println("\nLoop com Continue - Pular números ímpares:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue; // Pular números ímpares
            }
            System.out.println("Número par: " + i);
        }

        // 11. Usando rótulos com loops aninhados
        System.out.println("\nUsando rótulos com loops aninhados:");
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("Saindo do loop aninhado");
                    break outerLoop; // Sair do loop externo
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
