package Basic;

public class Exception_Demo {

	public static void  checkAge(int a) {
		
		if(a>18) {
			
			System.out.println("you r able to vote");
			
		}else {
			throw new NullPointerException("\"U r not able to vote");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		checkAge(12);
		
		
	}
	
}
