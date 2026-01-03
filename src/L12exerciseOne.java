import java.util.Scanner;

public class L12exerciseOne {
    public static void main(String[] args) {

          int score = 0;
          String choice = "a";
          // Initializing all the variables needed for the test

          Scanner input = new Scanner(System.in);

          // Question one
          System.out.println("""
                  4+9= ? (enter the letter for the respective answer)
                  a: 12
                  b: 5
                  c: 13
                  d: 36""");

          choice = input.next();

          // Responses to answers for Question one
        switch (choice) {
            case "a" -> System.out.println("Incorrect answer. Answer is c: 13");
            case "b" -> System.out.println("Incorrect answer. Answer is c: 13");
            case "c" -> {

                System.out.println("Correct answer!");
                score++;
            }
            case "d" -> System.out.println("Incorrect answer. Answer is c: 13");
            default -> System.out.println("Invalid answer.");
        }

        // Question two
        System.out.println("""
                  17-5= ? (enter the letter for the respective answer)
                  a: 12
                  b: 67
                  c: 85
                  d: 11""");

        choice = input.next();

        // Responses to answers for Question two
        switch (choice) {
            case "a" -> {

                System.out.println("Correct answer!");
                score++;

            }
            case "b" -> System.out.println("Incorrect answer. Answer is a: 12");
            case "c" -> System.out.println("Incorrect answer. Answer is a: 12");
            case "d" -> System.out.println("Incorrect answer. Answer is a: 12");
            default -> System.out.println("Invalid answer.");
        }

        // Question three
        System.out.println("""
                  11*4= ? (enter the letter for the respective answer)
                  a: 15
                  b: 7
                  c: 45
                  d: 44""");

        choice = input.next();

        // Responses to answers for Question three
        switch (choice) {
            case "a" -> System.out.println("Incorrect answer. Answer is d: 44");
            case "b" -> System.out.println("Incorrect answer. Answer is d: 44");
            case "c" -> System.out.println("Incorrect answer. Answer is d: 44");
            case "d" -> {

                System.out.println("Correct answer!");
                score++;

            }
            default -> System.out.println("Invalid answer.");
        }

        System.out.println("Congrats! You finished the quiz with a score of " + score + "!");
        if (score == 3) {

            System.out.println("That's a perfect score!");
        }

            System.out.println("Thanks for taking the quiz!");
    }
}
