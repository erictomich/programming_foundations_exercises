import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        String name;
        String favoriteColor;
        String favoriteHobby;
        String favoriteFood;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World!\n");

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.println("What is your favorite color? \n");
        System.out.println("(blue - red - green - white - yellow - orange - black - pink) \n");
        System.out.println("Examples: ");
        System.out.println("My favorite color is [...]");
        System.out.println("I really like the color [...] ");
        System.out.println("[...] is my favorite color.");
        System.out.println("[...] is the color I like most.");
        System.out.print("Enter your favorite color: ");

        favoriteColor = scanner.nextLine();

        System.out.print("What is your favorite hobby? ");
        favoriteHobby = scanner.nextLine();
        
        System.out.print("What is your favorite food? ");
        favoriteFood = scanner.nextLine();
        
        System.out.println("Your name is: " + name);
        System.out.println("Color: " + favoriteColor);
        System.out.println("Hobby: " + favoriteHobby);
        System.out.println("Food: " + favoriteFood);

        scanner.close();
    }
}
