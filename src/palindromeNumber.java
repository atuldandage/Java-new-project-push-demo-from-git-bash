
public class palindromeNumber {
	public static void main(String[] args) {
		
		int no=122;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0) {
			
		rem=temp%10;
		
		rev=rev*10+rem;
			
		temp=temp/10;	 
		
		}																
		if(rev==no) {
			System.out.println("it is palindrome number");
		}else {
			System.out.println("it is not palindrome");
		}
	}

}
