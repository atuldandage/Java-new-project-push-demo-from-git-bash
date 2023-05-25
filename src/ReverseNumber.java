
public class ReverseNumber {
public static void main(String[] args) {
	
	int rev=0;
	int rem;
	int no=332;
	
	while(no!=0) {
		
		rem=no%10;
		rev=(rev*10)+rem;//210    ,510,
		no=no/10;
				
}
	System.out.println(rev);
}
}


