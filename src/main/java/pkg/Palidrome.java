package pkg;

public class Palidrome {

	public static void main(String[] args) {
		int num=126, rev,sum=0;
		int temp=num;
		while(num>0) {
			
		
		rev=num%10;
		sum=sum*10+rev;
		num=num/10;
	}

	
	if(temp==sum) {
		System.out.println("number is palidrome");
	}
	else {
		System.out.println("number is not palidrome");
	}
	}
}



