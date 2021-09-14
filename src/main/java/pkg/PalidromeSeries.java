package pkg;

public class PalidromeSeries {

	public static void main(String[] args) {
		int r,sum=0, temp;
		int number=121;
		temp=number;
	

		
		while(number>0) {
			
		
		r=number%10;
		sum=sum*10+r;
		number=number/10;
	}
		if(temp==sum) {
			System.out.println("number is palidrome");
		}else {
			
		
System.out.println("number is not palidrome");
}
}
}
