
public class Prime {
	
	public static void main(String[] args) {
	//Enter the maximum number till which prime numbers should be displayed
	
	int num=20;
	
	for(int i=0;i<=num;i++) {
		
		if(i==0 || i==1)
			
		continue;
		
		int flg=1;
		
		for (int x=2;x<i;x++) {
			if (i%x==0)
				flg=0;
			break;
		}
		if (flg==1)
			System.out.println(i);
		
	}
	
	}

}
