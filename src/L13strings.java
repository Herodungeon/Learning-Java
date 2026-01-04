public class L13strings {
    public static void main(String[] args) {

        String mySentence = "I just got my Eagle Scout!";
        System.out.println(mySentence);
        System.out.println(" ");

        // Upper and lowercase methods
        System.out.println("Uppercase: " + mySentence.toUpperCase());
        System.out.println("Lowercase: " + mySentence.toLowerCase());
        System.out.println(" ");

        // indexOf
        System.out.println("'Eagle' is found at character number: " + mySentence.indexOf("Eagle"));
        System.out.println(" ");

        // Replacing
        System.out.println(mySentence.replace("Eagle", "Life"));
        System.out.println(" ");

        // String values
        String test = "";
        boolean empty = test.isEmpty();
        System.out.println(empty);
        System.out.println(" ");

        // Contains
        System.out.println(mySentence.contains("Eagle"));
        System.out.println(" ");

        // charAt
        System.out.println(mySentence.charAt(5));
        System.out.println(" ");
        // What happens if I retrieve a space, instead of a character?
        System.out.println(mySentence.charAt(6));
        System.out.println(" ");
        // It just outputs a space, now I know :)

        // Substring
        test = mySentence.substring(14);
        System.out.println(test);


    }
}
