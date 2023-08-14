package VowelsWordsCharaterFrequencyInString;

public class vowelWordsCharacterFrequencyInString {
    // public class Main {
    public static void main(String[] args) {
        String str = "Hello, World! This is a sample string.";
        int vowels = 0;
        int words = 0;
        int[] freq = new int[256];
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            System.out.println("str  " + str);
            char c = str.charAt(i);
            if (isLetter(c)) {
                System.out.println("toLawercheck:->  " + c);
                toLower(c);
                // freq[toLower(c)]++;
                freq[c]++;
                // freq[toLower(c)]++;

                if (isVowel(c)) {
                    vowels++;
                }
                if (!inWord) {
                    words++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of words: " + words);
        System.out.println("Character frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " - " + freq[i]);
            }
        }
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static int toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            // the expression ('a' - 'A') computes the difference between the ASCII codes of
            // 'a' and 'A', which is 32.
            return c + ('a' - 'A');
            // In the line return c + ('a' - 'A');, the expression ('a' - 'A') computes the
            // difference between the ASCII codes of 'a' and 'A',
            // which is 32. This value is added to the ASCII code of the uppercase letter c,
            // which shifts it by 32 positions in the ASCII table,
            // giving the ASCII code of the corresponding lowercase letter.
            // -------------------------------------
            // For example, suppose c is the uppercase letter 'H', whose ASCII code is 72.
            // Adding 32 to this value gives 104, which is the ASCII code
            // for the lowercase letter 'h'. Therefore, the method would return 'h' in this
            // case.
            // ---------------------------
            // This technique works because the ASCII codes for the uppercase letters 'A' to
            // 'Z' are contiguous and come before the codes
            // for the lowercase letters 'a' to 'z'.
        } else {
            return c;
        }
    }
}

//         public static void main(String[] args) {
//             String str = "Hello, World! This is a sample string.";
//             int vowels = 0;
//             int words = 0;
//             int[] freq = new int[256];
//             boolean inWord = false;
//             for (int i = 0; i < str.length(); i++) {
//                 System.out.println("str  "+ str);
//                 char c = str.charAt(i);
//                 if (isLetter(c)) {
//                 System.out.println("toLawercheck:->  " + c);
//                 toLower(c);
//                     // freq[toLower(c)]++;
//                     freq[c]++;
//                     // freq[toLower(c)]++;

//                     if (isVowel(c)) {
//                         vowels++;
//                     }
//                     if (!inWord) {
//                         words++;
//                         inWord = true;
//                     }
//                 } else {
//                     inWord = false;
//                 }
//             }
//             System.out.println("Number of vowels: " + vowels);
//             System.out.println("Number of words: " + words);
//             System.out.println("Character frequency:");
//             for (int i = 0; i < freq.length; i++) {
//                 if (freq[i] > 0) {
//                     System.out.println((char) i + " - " + freq[i]);
//                 }
//             }
//         }
        
//         public static boolean isLetter(char c) {
//             return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
//         }
        
//         public static boolean isVowel(char c) {
//             return "AEIOUaeiou".indexOf(c) != -1;
//         }
        
//         public static int toLower(char c) {
//             if (c >= 'A' && c <= 'Z') {
//  // the expression ('a' - 'A') computes the difference between the ASCII codes of 'a' and 'A', which is 32. 
//                return c + ('a' - 'A');
// //In the line return c + ('a' - 'A');, the expression ('a' - 'A') computes the difference between the ASCII codes of 'a' and 'A', 
// // which is 32. This value is added to the ASCII code of the uppercase letter c, which shifts it by 32 positions in the ASCII table, 
// // giving the ASCII code of the corresponding lowercase letter.
// // -------------------------------------
// // For example, suppose c is the uppercase letter 'H', whose ASCII code is 72. Adding 32 to this value gives 104, which is the ASCII code
// //  for the lowercase letter 'h'. Therefore, the method would return 'h' in this case.
// // ---------------------------
// // This technique works because the ASCII codes for the uppercase letters 'A' to 'Z' are contiguous and come before the codes 
// // for the lowercase letters 'a' to 'z'.
//             } else {
//                 return c;
//             }
//         }
    // }
    
// }
