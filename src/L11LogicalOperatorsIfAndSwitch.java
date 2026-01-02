import java.util.Scanner;

public class L11LogicalOperatorsIfAndSwitch {
    public static void main(String[] args) {

        boolean lifeScout = true;
        boolean eagleProject = false;
        int yearsSinceLifeScout = 3;
        boolean isTurkey = lifeScout && !eagleProject && yearsSinceLifeScout >= 2;

        boolean validInput = false;
        int yesOrNo = 2;

        Scanner input = new Scanner(System.in);

        while (!validInput) {
            System.out.print("Are you a Life Scout? (1 for yes, 0 for no): ");
            yesOrNo = input.nextInt();
            if (yesOrNo == 1) {
                lifeScout = true;
                validInput = true;
            } else if (yesOrNo == 0) {
                lifeScout = false;
                validInput = true;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }


    }
}
