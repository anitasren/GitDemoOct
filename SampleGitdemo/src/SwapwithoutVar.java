
public class SwapwithoutVar {
	
	public static void main(String[] args) {
		
		//Declare the array of values
		int[] arr= {9,5};
		
		//Function to perform swap with out another variable
		swapvar(arr);
		
		
		System.out.println("Swapped integers in array are: " + arr[0]+ " and " + arr[1]);
		
		
	}
	
	static void swapvar(int[] arr){
		
		arr[0]=arr[0]+arr[1];
		arr[1]=arr[0]-arr[1];
		arr[0]=arr[0]-arr[1];
		
	}

}
//Time complexity-O(1)
//Space complexity-O(1)