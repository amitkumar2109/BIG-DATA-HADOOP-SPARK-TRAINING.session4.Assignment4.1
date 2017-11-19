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
		String strInput = scanner1.nextLine();
	    System.out.println("User Input:"+strInput);
	    
	    String inputs[]= strInput.split(",");
	    int input1 = Integer.parseInt(inputs[0]);
	    int input2 = Integer.parseInt(inputs[1]);
	    int input3 = Integer.parseInt(inputs[2]);
        
	    //calling sum method which takes two arg	    
	    System.out.println("Sum of two input:"+sum(input1,input2));
	    //calling sum method  which takes three arg
	    System.out.println("Sum of three input:"+sum(input1,input2,input3));	    
	}
	
	//Sum method for two argument
	private static int sum(int var1, int var2){
		int var3 = var1+var2;
		return var3;
	}
	
	//Sum method for two argument
    private static int sum(int var1, int var2,int var3){
		int var4 = var1+var2+var3;
		return var4;
    }
		
	
}
