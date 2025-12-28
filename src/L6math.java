import java.util.Scanner;

public class L6math {
    public static void main(String[] args) {

        int x = 100;
        int y = 20;
        int result = 0;

        //Addition
        result = x + y;
        System.out.println(result);

        //Subtraction
        result = x - y;
        System.out.println(result);

        //Multiplication
        result = x * y;
        System.out.println(result);

        //Division
        result = x / y;
        System.out.println(result);

        //Remainder
        y = 13;
        result = x % y;
        System.out.println(result);

        //Math methods
        System.out.println("----------");
        System.out.println(Math.max(x, y));

        y = -13;
        System.out.println(Math.abs(y));

        //Doing my own thing
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        int i = scanner.nextInt();

        System.out.println("This is your current number: " + i);
        System.out.println("Now I will multiply " + i + " with x and y!");

        i = i * x * y;
        System.out.println("This is the new number: "+ i);

    }
}
