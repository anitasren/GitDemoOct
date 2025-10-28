import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		//Declare variable
		int num;
		
		//Read input
		System.out.println("Enter input: ");
		System.out.println("Git test2");
		
		//Take input
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		
		//Calculate if it is odd or even
		
		if(num%2==0) {
			
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
		
		
		
		
	}
}
