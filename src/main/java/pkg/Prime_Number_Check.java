package pkg;

public class Prime_Number_Check {

	public static void main(String[] args) {
		int temp = 0;
		int no=7; {
			for (int j = 2; j <= no - 1; j++) {
				if (no % j == 0) {
					//System.out.println("---------");
					temp = temp + 1;
				}

			}
			if (temp == 0) {
				System.out.println("number is prime");
			}
			else {
				System.out.println("number is not prime");
				
			}
		}

	}

}
