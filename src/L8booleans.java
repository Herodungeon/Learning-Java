import java.util.Scanner;

public class L8booleans {
    public static void main(String[] args) {

        boolean likedThisVideo =  true;
        boolean commented = false;

        System.out.println("You liked this video: " + likedThisVideo);
        System.out.println("You commented on this video: " + commented);

        //comparison operators
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int yourScore = input.nextInt();

        boolean passedClass = yourScore >= 50;
        System.out.println("You passed: " + passedClass + " with a score of " + yourScore);

        boolean hasPerfectScore = yourScore == 100;
        System.out.println("You have a perfect score? " + hasPerfectScore);

        boolean failedClass = !passedClass;
    }
}
