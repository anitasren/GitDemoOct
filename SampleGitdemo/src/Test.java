import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String s = "abcd";

		List<String> m = largeSubseq(s);

		
		for(int i=0;i<m.size();i++) {
			System.out.println(m.get(i));
		}
		

	}

	public static List<String> largeSubseq(String s) {

		// Length of the string
		int n = s.length();
		
		//Count of characters to be returned
		int count=1;

		//Initialising the 'c' with the first letter in string
		char c = s.charAt(0);

		//Loop through the string to find the largest alphabet
		for (int i = 1; i < n; i++) {

			 c = (char) Math.max(c, s.charAt(i));

		}
		
		String value=Character.toString(c);
		
		//Array list to hold the count and string
		ArrayList<String> str=new ArrayList<>();
		
		//Return the largest alphabet and count  
	str.add(0,value.length()+ " " +value);
	return str;
		

	}

}