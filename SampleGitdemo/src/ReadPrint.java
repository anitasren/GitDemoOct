import java.util.Scanner;

public class ReadPrint {
	
	public static void main(String[] args) {
		
		//Declare the variables
		int input_var;
		
		//Input the integer
		System.out.println("Enter an integer: ");
		
		//Create a Scanner object
		Scanner s=new Scanner(System.in);
		
		//Read the next integer from screen
		input_var=s.nextInt();
		
		//Print the integer
		System.out.println("Entered integer is: " + input_var);
		
		//Close the scanner object
		s.close();
		
		
		
	}

}
