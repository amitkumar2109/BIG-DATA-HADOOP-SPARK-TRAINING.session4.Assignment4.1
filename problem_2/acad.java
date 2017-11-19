/*
 *  Sum  of two int
 */
package acadGild_Project;

import java.util.Scanner;

public class acad {
	
	public static void main(String args[]){
		// the two int value
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter first Input:");
		String input1 = scanner1.nextLine();
	    System.out.println("First Input:"+input1);
	    System.out.println("Enter second input");
	    String input2 = scanner1.nextLine();
	    System.out.println("Second Input:"+input2);
	    
	    int sum = Integer.parseInt(input1)+Integer.parseInt(input2);
	    
	    System.out.println("Sum of both Input:"+sum);

		
				
		
	}
}
