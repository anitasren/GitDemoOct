import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args) {
		
		//Declare variables
		int a,b,c,d;
		
		System.out.println("Enter the 3 numbers:");
		
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		
		d=LargestOfThree(a,b,c);
		
		System.out.println("The largest of three numbers is :" + d);
		
	}
	
	static int LargestOfThree(int a,int b,int c) {
		
		return c>(a>b?a:b)?c:(a>b?a:b);
	}
	
	
	
	
	
	
	

}
