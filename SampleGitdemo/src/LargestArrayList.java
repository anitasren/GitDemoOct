import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestArrayList {
	
	public static void main(String[] args) {
		
		//Declare ArrayList
		ArrayList<Integer> arr=new ArrayList<>();
		
		//Size of array
		int size=4;
		
		//Read the inputs
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		arr.add(a);
		int b=s.nextInt();
		arr.add(b);
		int c=s.nextInt();
		arr.add(c);
		
		System.out.println("The largest is: " + Collections.max(arr));
		
		
		
	}

}
