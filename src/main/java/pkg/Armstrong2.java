package pkg;


public class Armstrong2 {

	public static void main(String[] args) {
		int c=0, a;
		int num=223;
		int temp=num;
	
		while(num>0) {
			
		
		a=num%10;
		num=num/10;
		c=c+(a*a*a);

	}
if(temp==c) {
	System.out.println("armstrong");
}
else {
	System.out.println("not armstrong");
}
}
}
