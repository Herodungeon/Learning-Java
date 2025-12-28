import java.util.Scanner;

public class L4outputInput {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello Github");

        //Testing printing without println
        System.out.print("Hello Java!");
        System.out.println("And hello again");

        //Printing with variables
        int x = 10;
        System.out.println(x + "\n");
        System.out.println("There's a space between this message and the last!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite flavor of pizza: ");
        String favoritePizza = scanner.nextLine();

        System.out.print("Your favorite flavor of pizza is: " +  favoritePizza);

    }
}
