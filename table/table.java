package firstprojectpracrice;
import java.util.Scanner;
public class table {
public static void main(String args[]) {
	int n, product=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number for table");
	n = sc.nextInt();
	for(int i=1; i<=10; i++) {
		product = n*i;
		System.out.println(n+"*"+i+"="+product);
	}
	
}
}
