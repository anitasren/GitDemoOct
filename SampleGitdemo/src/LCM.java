
public class LCM {

	public static void main(String[] args) {

		// Declaring the variables and values
		int a = 25;
		int b = 15;

		// Finding the largest among the inputs
		int largenum = (a > b) ? a : b;

		// Finding the value

		while (true) {
			if (largenum % a == 0 && largenum % b == 0)
				break;

			else
				largenum++;
		}

		System.out.println("LCM of " + a + "and" + b + "is" + largenum);

	}

}
