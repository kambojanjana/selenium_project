package pkg;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //anju -> ujna
		String name = "anju rani"; // a = 0 index ; u - 3 index
		
		int len = name.length();
		
		String revOutput = "";
		
		for(int i = len-1; i >=0; i--) {
			revOutput = revOutput + name.charAt(i);
		}
		System.out.println(revOutput);
	}

}
