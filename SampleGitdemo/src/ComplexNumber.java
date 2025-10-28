
public class ComplexNumber {
	
	int real;
	int image;
	
	public ComplexNumber(int r,int i) {
		
		this.real=r;
		this.image=i;
		
	}
	
	public void showC() {

		System.out.println(this.real + "+i" + this.image);
		
	}
	
	public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2) {
		
		ComplexNumber res=new ComplexNumber(0,0);
		res.real=c1.real+c2.real;
		res.image=c1.image+c2.image;
		
		
		return res;
	}
	
	public static void main(String[] args) {
		
		
		ComplexNumber c1=new ComplexNumber(4,8);
		ComplexNumber c2=new ComplexNumber(3,10);
		
		//Construct complex number
		
		System.out.println("First complex number");
		c1.showC();
		System.out.println("Second complex number");
		c2.showC();
		
		ComplexNumber res=add(c1,c2);
		
		System.out.println("Sum of complex numbers: ");
		res.showC();
		
	}
	

	

}
