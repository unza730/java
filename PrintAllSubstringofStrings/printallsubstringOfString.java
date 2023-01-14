package PrintAllSubstringofStrings;

public class printallsubstringOfString {
    // Java program to print all possible
    // substrings of a given string

    // Function to print all sub strings
    static void subString(char str[], int n) {
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // System.out.println("Len:  " + len + " n:" + n);
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                // System.out.println("i: " + i + " len  " + len + " " + "n-len: " + (n - len));
                // System.out.println(n-len);
                // Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                // System.out.println("i: " + i + "  len: " + len + "  len-1:  " + (len - 1));
                for (int k = i; k <= j; k++) {
                    // System.out.println("k: " + k + "j:  " + j);
                    System.out.print(str[k]);

                }
                System.out.println("-------Ending of K Loop ----------");

                System.out.println();
            }
            System.out.println("-------Ending of i Loop ----------");

        }
        System.out.println("-------Ending of len Loop ----------");

    }

    // Driver program to test above function
    public static void main(String[] args) {
        char str[] = { 'a', 'b', 'c' };
        subString(str, str.length);

    }
}
// This code is contributed by PrinciRaj1992

// Time complexity: O( n3 )
// Auxiliary Space: O(1)

// Method 2 (Using substr() function): s.substr(i, len) prints substring of length ‘len’ starting from index i in string s.

// Implementation: