public class StringExamples {

    public static void main(String[] args) {
        // 1. Criação de Strings
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Hello, World!";

        // 2. Concatenção de Strings
        String concat = str1 + " " + str2;
        System.out.println("Concatenação: " + concat);

        // 3. Comprimento de uma String
        int length = str3.length();
        System.out.println("Comprimento: " + length);

        // 4. Comparação de Strings
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello");
        System.out.println("Igual: " + isEqual);
        System.out.println("Igual (ignorar case): " + isEqualIgnoreCase);

        // 5. Busca de Substrings
        int index = str3.indexOf("World");
        int lastIndex = str3.lastIndexOf("o");
        boolean contains = str3.contains("World");
        System.out.println("Índice de 'World': " + index);
        System.out.println("Último índice de 'o': " + lastIndex);
        System.out.println("Contém 'World': " + contains);

        // 6. Substring
        String sub = str3.substring(7, 12);
        System.out.println("Substring: " + sub);

        // 7. Substituição de Substrings
        String replaced = str3.replace("World", "Java");
        System.out.println("Substituição: " + replaced);

        // 8. Divisão de Strings
        String[] split = str3.split(", ");
        System.out.println("Dividido: ");
        for (String s : split) {
            System.out.println(s);
        }

        // 9. Alteração de Case
        String upper = str1.toUpperCase();
        String lower = str2.toLowerCase();
        System.out.println("Maiúsculas: " + upper);
        System.out.println("Minúsculas: " + lower);

        // 10. Remoção de Espaços
        String withSpaces = "  Java   ";
        String trimmed = withSpaces.trim();
        System.out.println("Com espaços: '" + withSpaces + "'");
        System.out.println("Sem espaços: '" + trimmed + "'");

        // 11. StringBuilder para Mutabilidade
        StringBuilder sb = new StringBuilder("StringBuilder ");
        sb.append("é eficiente para ");
        sb.append("concatenar múltiplas ");
        sb.append("strings.");
        System.out.println(sb.toString());

        // 12. Formatação de Strings
        String formatted = String.format("Nome: %s, Idade: %d", "João", 25);
        System.out.println("Formatação: " + formatted);

        // 13. Conversão de Tipos para String
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("Número para String: " + numStr);

        // 14. Comparação Lexicográfica
        int comparison = str1.compareTo(str2);
        int comparisonIgnoreCase = str1.compareToIgnoreCase("HELLO");
        System.out.println("Comparação lexicográfica: " + comparison);
        System.out.println("Comparação lexicográfica (ignorar case): " + comparisonIgnoreCase);

        // 15. Verificação de Início e Fim
        boolean startsWith = str3.startsWith("Hello");
        boolean endsWith = str3.endsWith("World!");
        System.out.println("Começa com 'Hello': " + startsWith);
        System.out.println("Termina com 'World!': " + endsWith);

        // 16. Conversão de String para Caracteres
        char[] charArray = str1.toCharArray();
        System.out.println("Array de caracteres: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 17. Unicode e Códigos de Caracteres
        char unicodeChar = '\u0041'; // Representa 'A'
        int codePoint = str1.codePointAt(1); // Código do caracter na posição 1
        System.out.println("Caractere Unicode: " + unicodeChar);
        System.out.println("Código do ponto: " + codePoint);

        // 18. Combinação de Strings e Inteiros
        String combined = str1 + " " + 123;
        System.out.println("Combinado com inteiro: " + combined);

        // 19. Verificação de Em Branco ou Vazio
        String empty = "";
        String blank = "   ";
        boolean isEmpty = empty.isEmpty();
        boolean isBlank = blank.isBlank();
        System.out.println("Está vazio: " + isEmpty);
        System.out.println("Está em branco: " + isBlank);

        // 20. Join de Strings
        String joined = String.join(", ", "Java", "Python", "C++");
        System.out.println("Join de strings: " + joined);
    }
}
