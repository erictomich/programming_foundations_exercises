import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String secondName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World!");

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your second name: ");
        secondName = scanner.nextLine();


        System.out.println("Your complete name is: " + name + " " + secondName + "!");

        scanner.close();
    }
}
