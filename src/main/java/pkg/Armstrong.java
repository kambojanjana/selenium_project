package pkg;

public class Armstrong {

	public static void main(String[] args) {
		int n;
		int c = 0;
		int a;
		int temp;
		int num = 153;
		int len = String.valueOf(num).length();
		
		temp = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			//c = c + (a*a*a*a);
			c = c + (int) Math.pow(a, len);
		}
		if (temp == c) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");
		}
	}

}
