package CountTheFrequecnyOfCharacterinString;

// public class countTheFrequecnyofCharacterInString {

// }
/*Java Program to find the frequency of characters in a string*/
public class countTheFrequecnyofCharacterInString {
    public static void main(String[] args) {
        String str = "Unza Unza";
        int[] freq = new int[str.length()];
        System.out.println("The entered string is " + str);
        // Convert the given string into character array
        char str1[] = str.toLowerCase().toCharArray();
        System.out.println("Str111" + str1[0]);
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str1[i] == str1[j]) {
                    freq[i]++;

                    // Set str1[j] to 0 to avoid printing visited character
                    str1[j] = '0';
                    // ------------------
                    // To Avoid Below We nedd to implement above   str1[j] = '0';
                    // u 2
                    // n 2
                    // z 2
                    // a 2
                    // u 1
                    // n 1
                    // z 1
                    // a 1
                    // -----------------------
                }
            }
        }
        // Displays the characters and their corresponding frequency
        System.out.println("Frequencies of the characters in the string are as below: ");
        System.out.println("Characters  frequencies");
        for (int i = 0; i < freq.length; i++) {
            if (str1[i] != ' ' && str1[i] != '0')
                System.out.println(str1[i] + "              " + freq[i]);
        }
    }
}
