import java.util.Scanner;

public class IOClass {
    public static void main(String[] args) {
        String name;
        String secondName;
        Scanner scanner = new Scanner(System.in); // Usar um único Scanner

        System.out.println("Hello World!");

        name = getResponseFor("Enter your name: ", scanner);

        System.out.println("Hello, " + name + "!");

        secondName = getResponseFor("Enter your second name: ", scanner);

        System.out.println("Your complete name is: " + name + " " + secondName + "!");

        scanner.close(); // Fechar o Scanner apenas no final
    }

    public static String getResponseFor(String question, Scanner scanner) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
