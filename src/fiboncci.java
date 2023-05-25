
public class fiboncci {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int fibonasum=0;
		for(int i=0;i<=5;i++) {
			fibonasum=a+b;
			a=b;
			b=fibonasum;
			System.out.println(fibonasum);
			}
		System.out.println(fibonasum);
		
	}

}
