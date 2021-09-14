package pkg;

public class Reverse {

	public static void main(String[] args) {
		String s="anjanA";
		String p="";
		for(int i=length()-1;i>=0;i--) {
			p=p+s.charAt(i);
			//System.out.println(i +" ---i---p--"+ p);
		}
		System.out.println(p);
	}

}
