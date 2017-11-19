/*
 *  sorting of array
 */
package acadGild_Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class acad {
	
	public static void main(String args[]){
		// the two int value
		
		//init array variable
		Integer[] iarray ={15,2,10,85,7,3,90};
		System.out.println("Array element without sorting order:"+Arrays.toString(iarray));	
		Arrays.sort(iarray,Collections.reverseOrder());	
		System.out.println("Array element after sorting order:"+Arrays.toString(iarray));
	        
	}
	
}


