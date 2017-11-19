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
	    
	    //split the input
	    String userInput[] = input1.split(",");
	    //looping on input
	    for(String strdigit:userInput){
	    	int iDigit =Integer.parseInt(strdigit);
	    	
	    	if(iDigit%2==0){
	    		System.out.println("user input:"+iDigit+ " is even");
	    	}else{
	    		System.out.println("user input:"+iDigit+ " is odd");
	    	}
	    	
	    }
	    
	    	    
	    				
		
	}
	
		
	
}
