package mergetwosortedarray;
  // Java program to merge two sorted arrays
  import java.util.*;
  import java.lang.*;
  import java.io.*;
public class MergeTwoSortedArrayMethod2 {
  

	// Merge arr1[0..n1-1] and arr2[0..n2-1]
	// into arr3[0..n1+n2-1]
	public static void mergeArrays(int[] arr1, int[] arr2, int n1,
								int n2, int[] arr3)
	{
		int i = 0, j = 0, k = 0, l=1; 
	int h = n1 -1;
	System.out.print("hhhhhhhhhh"+ h);
		// Traverse both array
		System.out.println("-------------------------------------------  i  j"+ i + " "+ j);
			
		while (i< n1 && j < n2)
		{
			System.out.println("-------------------------------------------  i  j"+ i + " "+ j);
			System.out.println(l+ " iteration ");
			
			System.out.println("While loop body is running");
			System.out.println("-----------------------------------------");
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
            // System.out.println("arr1: before of if body  "+ arr1[i] + " ----->>> i:" + i+ "  k: "+ k);
            // System.out.println("arr2 before of if body  "+ arr2[j] + " ----->>> j:" + j+ "  k: "+ k);
			
			// System.out.println("----------------------------------------");
			// System.out.println("arr1[i] < arr2[j]  "+ arr1[i] + " < " + arr2[j]);
             
			if (arr1[i] < arr2[j]){
            //   System.out.println("arr1[i] < arr2[j]  "+ arr1[i] + " < " + arr2[j]);
                System.out.println("if Body is running");

            System.out.println("arr1: in the body of oif  "+ arr1[i]+ " ----->>> j:" + j+ "  k: "+ k);
            System.out.println("arr2  in the body of if  "+ arr2[j] + " --->>>  i:" + i+ "  k: "+ k);
			System.out.println("----------------------------------------");
            				arr3[k] = arr1[i];
							System.out.println("arr3[k]  in the body of if  "+ arr3[k] + " --->>>  i:" + i+ "  k: "+ k);
		
							k++;
							// if(i < 3) {
							// 	System.out.println("i < n1 arr1[arr1.length-1] " + i + " " + n1);
							i++;
							// }
							l++;
            }else{
                System.out.println("Else Body is running");
                System.out.println("arr3: "+ arr3[k] +" arr2: "+ arr2[j] +" j: "+ j+ "  k: "+ k);
				arr3[k++] = arr2[j++];
				System.out.println("arr3: "+ arr3[k] +" arr2: "+ arr2[j] +" j: "+ j+ "  k: "+ k);
				l++;
            }
		}
	
		// Store remaining elements of first array
		System.out.println("Store remaining elements of first array");
		System.out.println("i < n1  "+ i + " " + n1);
		while (i < n1){
			System.out.println("arr3[k] = arr1[i]  "+ arr3[k]+ arr1[i]);
			arr3[k++] = arr1[i++];
		}
		// Store remaining elements of second array
		System.out.println("Store remaining elements of first array");
		System.out.println("j < n2  "+ j +" "+ n2);
		
		while (j < n2){
			System.out.println("arr3[k] = arr2[j]  "+ arr3[k]+ arr2[j]);
			
			arr3[k++] = arr2[j++];
		}
	}
	
	public static void main (String[] args)
	{
		int[] arr1 = {1, 3, 5,7};
		int n1 = arr1.length;
	
		int[] arr2 = {2, 4, 6, 8};
		int n2 = arr2.length;
	
		int[] arr3 = new int[n1+n2];
		
		mergeArrays(arr1, arr2, n1, n2, arr3);
	
		System.out.println("Array after merging");
		for (int i=0; i < n1+n2; i++)
			System.out.print(arr3[i] + " ");
	}
}

/* This code is contributed by Mr. Somesh Awasthi */


