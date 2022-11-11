package firstprojectpracrice;
import java.util.Scanner;
public class starrprintingpyramid {
public static void main(String args[]) {
	int n, num=1;
	System.out.println("Enter Number");

	Scanner sc = new Scanner(System.in);
	n= sc.nextInt();
	for(int i = n; i >= 1; i--) {
		for(int j = 1; j <= i; j++) 
		{
			System.out.print(num);
		}
		num++;
		System.out.println();
	}
}

}
// Enter Number
// 5
// 11111
// 2222
// 333
// 44
// 5
package firstprojectpracrice;
import java.util.Scanner;
public class starrprintingpyramid {
public static void main(String args[]) {
	int n, num=1;
	System.out.println("Enter Number");

	Scanner sc = new Scanner(System.in);
	n= sc.nextInt();
	for(int i = n; i >= 1; i--) {
		for(int j = 1; j <= i; j++) 
		{
			System.out.print(num+j);
		}
		num++;
		System.out.println();
	}
}

}
// Enter Number
// 5
// 23456
// 3456
// 456
// 56
// 6
