
public class FactorialNo {

	public static void main(String[] args) {
		double i, fact = 1;
		double number = 100;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + number + "is " + fact);
	}
}
