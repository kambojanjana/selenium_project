package pkg;

public class PalidromeNumber {

	public static void main(String[] args) {
		int num=454, sum=0,rev;
	int	temp=num;
		while(num>0) {
		rev=num%10;
		sum=sum*10+rev;
		num=num/10;
		}
		if(temp==sum) 
		{
			System.out.println(" palidrome");
		}
		else
		{
			System.out.println(" not[palidrome");
		}
	}
}

	


