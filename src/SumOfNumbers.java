
public class SumOfNumbers {
	
	
	public static void main(String[] args) {
		int no=667;
		int sum=0;
		
		while (no!=0) {
			
			int digit=no%10;
			sum=sum+digit;
			no=no/10;
			
		}
		
		System.out.println("sum of numbers="+sum+"   ");
		
	}

}
