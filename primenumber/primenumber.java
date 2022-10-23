package firstprojectpracrice;
import java.util.Scanner;
public class primenumber {
public static void main(String args[]) {
	int n, i=1, count =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number To check PRime number or not:");
	n = sc.nextInt();
while(i<=n) {
	if(n%i==0) {
		count= count +1;
		
	}
	i = i+1;
	

}
if(count ==2) {
	System.out.println("Prime Number"+ count);
	
} else {
	System.out.println("Not Prime Number"+ count);
}
}
}
