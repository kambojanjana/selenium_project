package pkg;

public class Armstrong1 {

	public static void main(String[] args) {
		int num=153,a,c=0;
		int temp;
		temp=num;
		
		while(num>0) {
		a=num%10;
		num=num/10;
		c=c+(a*a*a);

	}

	if (temp==c) {
		System.out.println("number is armstrong");
	}
	else {
		System.out.println("number is not armstrong");
	}

}
}
