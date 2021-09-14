package pkg;

public class Fibonaci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a+" "+b);
		
		for (int i = 1; i <= 10; ++i) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(" "+c);
		

		}

	}

}
