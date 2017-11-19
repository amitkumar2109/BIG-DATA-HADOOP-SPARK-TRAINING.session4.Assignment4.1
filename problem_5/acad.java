/*
 *  Sum  of two int
 */
package acadGild_Project;

import java.util.Scanner;

public class acad {
	
	public static void main(String args[]){
		// the two int value
		
		//Taking user input
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter  Input:");
		String input1 = scanner1.nextLine();
	    System.out.println("User Input:"+input1);
	    System.out.println("first 10 Multiple of user input");
	    //looping on input
	    int iInput = Integer.parseInt(input1);
	    for(int i=1;i<=10;i++){
	    	
	    	System.out.println(input1+" * "+i+" = "+iInput*i);
	    }
	}
	
		
	
}
