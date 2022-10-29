 package firstprojectpracrice;
 import java.util.Scanner;
public class factorialnumber {
public static void main(String args[]) {
	int n, i, fact = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number for factorial");
	n= sc.nextInt();
	for(i=1; i<=n; i++) {
		fact = fact*i;
	}
	System.out.println("Your Factorial is:"+fact);
}
}
