package firstprojectpracrice;
//import java.util.Scanner;
public class primenumberbw1to100 {
public static void main(String args[]) {
	int i, j, count;
	
//	Scanner sc = new Scanner(System.in);
	System.out.println(" Number For Prime between 1 to 100");
	for(i=0; i<=100; i++) {
		count=0;
		for(j=1; j<=i; j++) {
			
			
			if(i%j==0){
				count ++;
				
			}
			
		}
		if(count==2) {
			System.out.println("Prime Number"+i);
			}
	}
}
}
