package firstprojectpracrice;
import java.util.Scanner;
public class reversenumber {
public static void main(String args[]) {
int num = 3456, reversed=0;
System.out.println("Original Number are:"+ num);
while(num!=0) {
	int digit = num%10;
	reversed = num *10 + digit;
	num = num /10;
	
}
System.out.println("Reversed number are:" + reversed);
}
}
