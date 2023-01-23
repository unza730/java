package CountOfDigitsInANumber;

import java.util.Scanner;

public class CountsOfDigitsInNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int copyOfOriginalNumber = n;
        int numOfDigits = 0;
        while(n > 0){
            n = n / 10;
            numOfDigits++;
        }
System.out.println("Num Of Digits in a number "+ copyOfOriginalNumber+"="+ numOfDigits);
    }
}
