package firstprojectpracrice;
import java.util.Scanner;
public class starrprintingpyramid {
public static void main(String args[]) {
	int n;
	System.out.println("Enter Number");

	Scanner sc = new Scanner(System.in);
	n= sc.nextInt();
	for(int i = 1; i <= n; ++i) {
		for(int j = 1; j <= i; ++j) 
		{
			System.out.print(j+i);
		}
		System.out.println();
	}
}

}
// Enter Number
// 2
// 34
// 456
// 5678
// 678910
