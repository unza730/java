package firstprojectpracrice;
import java.util.Scanner;
public class Fibonacciseries {
public static void main(String args[]) {
	int num1=0, num2=1, num3=1, n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number For maximum");
	n = sc.nextInt();
	System.out.println(num1+" "+num2);
	
	for(int i=2; i<=n; ++i) {
		num3 = num1 + num2;
		System.out.println(num3);
		num1 = num2;
		num2 = num3;
	}
}
}
