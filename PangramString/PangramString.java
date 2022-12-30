package PangramString;

public class PangramString {
    // function to check if a string contains all the letters (a to z)
    public static void containAllLetters(String string) {
        // converts the given string to lowercase
        string = string.toLowerCase();
        boolean allLetterPresent = true;
        // loop iterate over each character of the given string
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // checks if the string does not contains all the letters
            if (!string.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        // checks if all the letters are presented or not
        if (allLetterPresent)
            // if present, prints pangram
            System.out.println("Pangram String");
        else
            // if present, prints not pangram
            System.out.println("Not a Pangram String");
    }

    // driver code
    public static void main(String args[]) {
        // string to check
        String string = "Abcdefghijklmnopqrstuvwxyz12";
        // function calling
        containAllLetters(string);
    }
}
