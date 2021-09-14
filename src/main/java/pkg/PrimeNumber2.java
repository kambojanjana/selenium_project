package pkg;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int no=7;
		int temp=0;
		for(int i=1;i<=no-1;i++) {
			if(no/2==0) {
				temp=temp+1;
			}
			if(temp==0) {
				System.out.println("number is prime");
			}
			else	{
				System.out.println("number is not prime");
			}
		}
		

	}}
	
