import java.util.Scanner;

public class L11LogicalOperatorsIfAndSwitch {
    public static void main(String[] args) {

        boolean lifeScout = true;
        boolean eagleProject = false;
        int yearsSinceLifeScout = 3;


        boolean validInput = false;
        int answer = 2;

        Scanner input = new Scanner(System.in);

        while (!validInput) {
            System.out.print("Are you a Life Scout? (1 for yes, 0 for no): ");
            answer = input.nextInt();
            if (answer == 1) {
                lifeScout = true;
                validInput = true;
            } else if (answer == 0) {
                lifeScout = false;
                validInput = true;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.print("Have you done your Eagle Project? (1 for yes, 0 for no): ");
            answer = input.nextInt();
            if (answer == 1) {
                eagleProject = true;
                validInput = true;
            } else if (answer == 0) {
                eagleProject = false;
                validInput = true;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.print("How long has it been since you achieved your Life Scout? (type a single number in years, round to the nearest whole number): ");
            answer = input.nextInt();
            if (answer >= 0 && answer <= 6) {
                yearsSinceLifeScout = answer;
                validInput = true;
            } else if (answer < 0) {
                System.out.println("How could you have a negative amount of time? Try again.");
            } else if (answer > 6) {
                System.out.println("You've already aged out if it's been that long! Try again.");
            } else {
                System.out.println("Invalid input, try again.");
            }
        }
        boolean isTurkey = lifeScout && !eagleProject && (yearsSinceLifeScout >= 2);

        System.out.println(" ");
        System.out.println("Life Scout: " + lifeScout);
        System.out.println("Eagle Project: " + eagleProject);
        System.out.println("Years since life scout: " + yearsSinceLifeScout);
        System.out.println(" ");
        System.out.println("Status, are you a turkey?: " + isTurkey);
    }
}
