package intersectionnumber;

// package java;

public class intersectionnumber {
  public static void main(String[] args) {
	  int arr1[]= {3,10,7,8,9};
	  int arr2[]= {3,9,10};
 for(int i=0; i<arr1.length; i++ ) {
	       for(int j=0; j<arr2.length; j++) {
	          if(arr1[i]==arr2[j]) {
	              System.out.println(arr2[j]);
	            }
	        }
	    }	
  }
}
