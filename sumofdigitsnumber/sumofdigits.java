package firstprojectpracrice;
import java.util.Scanner;
public class sumofdigitofnumber {
public static void main(String args[]) {
	int num = 245, sum =0;
	System.out.println("Original number:"+num);
	while(num!=0) {
		sum = sum + num%10;
		num = num/10;
		
	}
System.out.println("Sum Of Digits Of Number:" + sum);	
}
}
