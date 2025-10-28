import java.util.Scanner;

public class Array1{
	
	public static void main(String[] args) {
		
		String x="011011";
		String y="1010111";
		
		System.out.println(addBinaryStrings(x,y));
		
	}
	
	public static String addBinaryStrings(String x,String y) {
		
		int n1=Integer.parseInt(x,2);
		int n2=Integer.parseInt(y,2);
		
		int sum=n1+n2;
		
		String s=Integer.toBinaryString(sum);
		
		return s;
		
	}
	
	
	
	
	
	
	
}