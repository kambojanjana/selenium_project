package pkg;

public class Factorial1 {

	public static void main(String[] args) {
		int number = 5, fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(" factorial of " + number + " is " + fact);

	}
}
 