import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Introdução
        System.out.println("\nBem-vindo(a) ao Santuário das Palavras Encantadas!");
        System.out.println("Eu sou o Guardião das Letras, um mago poderoso em decifrar a verdadeira essência dos nomes.\n");

        // Entrada do nome do jogador
        System.out.print("Diga-me, jovem aventureiro(a), qual é o nome que carregas? ");
        String originalName = scanner.nextLine().trim();
        
        // Transformações mágicas
        System.out.println("\nAh, " + originalName + ", um nome com grande potencial! Vamos ver do que ele é capaz...\n");

        // 1. Nome em Letras Maiúsculas
        String upperCaseName = originalName.toUpperCase();
        System.out.println("✨ Transmutação para letras maiúsculas: " + upperCaseName);
        
        // 2. Nome em Letras Minúsculas
        String lowerCaseName = originalName.toLowerCase();
        System.out.println("🔮 Encantamento para letras minúsculas: " + lowerCaseName);

        // 3. Nome ao Contrário
        String reversedName = new StringBuilder(originalName).reverse().toString();
        System.out.println("🌀 Espelho da alma (nome invertido): " + reversedName);

        // 4. Substituição de Vogais por Asteriscos
        String vowelMaskedName = originalName.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("🌙 Camuflagem de vogais: " + vowelMaskedName);

        // 5. Metade Esquerda do Nome
        String leftHalfName = originalName.substring(0, originalName.length() / 2);
        System.out.println("🔗 Divisão de poder (metade esquerda): " + leftHalfName);

        // 6. Nome com Consoantes Dobradas
        String doubledConsonantsName = originalName.replaceAll("([bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ])", "$1$1");
        System.out.println("💥 Consoantes fortalecidas: " + doubledConsonantsName);

        // 7. Nome sem as Primeiras e Últimas Letras
        if (originalName.length() > 2) {
            String innerName = originalName.substring(1, originalName.length() - 1);
            System.out.println("🔓 Nome interior (sem a primeira e última letras): " + innerName);
        } else {
            System.out.println("🔒 O nome é muito curto para esta magia.");
        }

        // 8. Nome em Código Morse (simplificado)
        String morseCodeName = toMorseCode(originalName);
        System.out.println("📡 Nome em código Morse: " + morseCodeName);

        // 9. Numerologia do Nome
        int numerologyNumber = calculateNumerology(originalName);
        System.out.println("🔢 Numerologia do nome: " + numerologyNumber);

        // Encerramento
        System.out.println("\nO seu nome, " + originalName + ", possui uma magia única! Use seu poder com sabedoria.");
        
        scanner.close();
    }

    // Função auxiliar para converter uma String para Código Morse
    public static String toMorseCode(String text) {
        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('A', ".-");    morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");  morseMap.put('D', "-..");
        morseMap.put('E', ".");     morseMap.put('F', "..-.");
        morseMap.put('G', "--.");   morseMap.put('H', "....");
        morseMap.put('I', "..");    morseMap.put('J', ".---");
        morseMap.put('K', "-.-");   morseMap.put('L', ".-..");
        morseMap.put('M', "--");    morseMap.put('N', "-.");
        morseMap.put('O', "---");   morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");  morseMap.put('R', ".-.");
        morseMap.put('S', "...");   morseMap.put('T', "-");
        morseMap.put('U', "..-");   morseMap.put('V', "...-");
        morseMap.put('W', ".--");   morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");  morseMap.put('Z', "--..");
        morseMap.put('1', ".----"); morseMap.put('2', "..---");
        morseMap.put('3', "...--"); morseMap.put('4', "....-");
        morseMap.put('5', "....."); morseMap.put('6', "-....");
        morseMap.put('7', "--..."); morseMap.put('8', "---..");
        morseMap.put('9', "----."); morseMap.put('0', "-----");
        morseMap.put(' ', "   ");

        StringBuilder morseCode = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            morseCode.append(morseMap.getOrDefault(c, "")).append(" ");
        }
        return morseCode.toString().trim();
    }

    // Função auxiliar para calcular o número da numerologia de um nome
    public static int calculateNumerology(String text) {
        int sum = 0;
        for (char c : text.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sum += c - 'A' + 1;
            }
        }
        return reduceToSingleDigit(sum);
    }

    // Função para reduzir um número a um único dígito, com exceções para números mestres
    public static int reduceToSingleDigit(int number) {
        while (number > 9 && number != 11 && number != 22 && number != 33) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}
