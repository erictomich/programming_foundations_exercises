public class ArrayExamples {

    public static void main(String[] args) {
        // 1. Criação de Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = new String[]{"Java", "Python", "C++"};
        double[] doubleArray = new double[5]; // Array de tamanho 5

        // 2. Acessando Elementos do Array
        System.out.println("Primeiro elemento de intArray: " + intArray[0]);
        System.out.println("Segundo elemento de strArray: " + strArray[1]);

        // 3. Modificando Elementos do Array
        intArray[2] = 10;
        strArray[0] = "JavaScript";
        System.out.println("Novo valor no intArray[2]: " + intArray[2]);
        System.out.println("Novo valor no strArray[0]: " + strArray[0]);

        // 4. Iterando sobre um Array
        System.out.println("Iterando sobre intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        System.out.println("Iterando sobre strArray (foreach):");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 5. Encontrando o Tamanho do Array
        int length = doubleArray.length;
        System.out.println("Tamanho de doubleArray: " + length);

        // 6. Inicializando Arrays com Valores Padrão
        System.out.println("Valores padrão de doubleArray:");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }
        System.out.println();

        // 7. Array de Arrays (Matriz)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Acessando elementos da matriz:");
        System.out.println(matrix[1][1]); // 5

        // 8. Iterando sobre uma Matriz
        System.out.println("Iterando sobre matriz:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 9. Buscando em um Array
        int searchValue = 10;
        boolean found = false;
        for (int value : intArray) {
            if (value == searchValue) {
                found = true;
                break;
            }
        }
        System.out.println("Valor " + searchValue + " encontrado: " + found);

        // 10. Ordenando um Array
        int[] unsortedArray = {5, 3, 8, 1, 2};
        java.util.Arrays.sort(unsortedArray);
        System.out.println("Array ordenado: " + java.util.Arrays.toString(unsortedArray));

        // 11. Cópia de Arrays
        int[] copiedArray = java.util.Arrays.copyOf(intArray, intArray.length);
        System.out.println("Array copiado: " + java.util.Arrays.toString(copiedArray));

        // 12. Preenchendo um Array
        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 42);
        System.out.println("Array preenchido: " + java.util.Arrays.toString(filledArray));

        // 13. Comparando Arrays
        boolean arraysEqual = java.util.Arrays.equals(intArray, copiedArray);
        System.out.println("intArray é igual a copiedArray: " + arraysEqual);

        // 14. Convertendo Array para String
        String arrayString = java.util.Arrays.toString(strArray);
        System.out.println("Array como string: " + arrayString);

        // 15. Convertendo Array para Lista
        java.util.List<String> list = java.util.Arrays.asList(strArray);
        System.out.println("Array como lista: " + list);

        // 16. Verificando se o Array está Vazio
        boolean isEmpty = intArray.length == 0;
        System.out.println("intArray está vazio: " + isEmpty);

        // 17. Redimensionando um Array
        int[] resizedArray = java.util.Arrays.copyOf(intArray, 7);
        System.out.println("Array redimensionado: " + java.util.Arrays.toString(resizedArray));

        // 18. Somando Elementos de um Array
        int sum = 0;
        for (int value : intArray) {
            sum += value;
        }
        System.out.println("Soma dos elementos de intArray: " + sum);

        // 19. Encontrando o Maior e Menor Valor de um Array
        int max = intArray[0];
        int min = intArray[0];
        for (int value : intArray) {
            if (value > max) max = value;
            if (value < min) min = value;
        }
        System.out.println("Maior valor de intArray: " + max);
        System.out.println("Menor valor de intArray: " + min);

        // 20. Revertendo um Array
        int[] reverseArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            reverseArray[i] = intArray[intArray.length - 1 - i];
        }
        System.out.println("Array reverso: " + java.util.Arrays.toString(reverseArray));
    }
}
