import java.util.Scanner;

public class L15ternaryOperators {
    public static void main(String[] args) {

        int myNum = 2;
        int prize = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number I was thinking, between 0 and 10, and you get $100! What's your guess: ");
        int guess = input.nextInt();

        guess = (guess == myNum) ? 100 : 0;

        switch(guess) {

            case 100: System.out.println("You got it! Your prize is $100! Congratulations!"); break;
            case 0: System.out.println("Incorrect, sorry no prize!");
        }


    }
}
