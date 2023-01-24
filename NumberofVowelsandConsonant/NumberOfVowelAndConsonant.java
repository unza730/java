package NumberofVowelsandConsonant;
public class NumberOfVowelAndConsonant {
    public static void main(String[] args){
        String str = "Sandeep";
        countVowels(str);
    }
    private static void countVowels(String str){
         int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i<str.length(); i++){
            System.out.println("i:"+ i + "  str.chartAt(i): "+ str.charAt(i));
            if(isVowel(str.charAt(i))){
                System.out.println("str.charAt(i) of vowel: " + str.charAt(i));
                ++vowelCount;
            }else{
                ++consonantCount;
            }
        }
        System.out.println("Total No of Character of string: "+ str.length());
      
        System.out.println("VowelCount: "+ vowelCount);
        System.out.println("Consonant Count: "+ consonantCount);
    }
    private static boolean isVowel(char ch){
       ch = Character.toUpperCase(ch);
       return (ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U');
    }
}
