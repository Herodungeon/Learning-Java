public class L14casting {
    public static void main(String[] args) {

        int loan = 120000;
        float interest = 0.0525f;

        float total = loan * interest;
        System.out.println("Total interest is: " + total);

        // Showing what's happening to the integer data type explicitly
        loan = 150;
        interest = (float)loan * interest;

        // What happens if we cast the other way? float -> int
        total = loan * (int)interest;
        System.out.println("Total interest is: " + total);

        //Multiplying 150 * 525 to see if I get the same result
        int test = 150 * 525;
        System.out.println("Test is: " + test);

    }
}
