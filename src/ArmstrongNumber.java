

public class ArmstrongNumber {

	//153=1+125+25; additon of cube of numbers
	public static void main(String[] args) {
		
		int rem=0;
		int sum=0;
		int no=153 ;
		int temp=no;
		//int temp=no;
		while(no!=0) {
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;	
		}
		System.out.println("sum="+sum);
		if(sum==temp) {
			System.out.println("it is armstrong number");
		}else {
		System.out.println("it is not armstrong");
		}
		}	
}
