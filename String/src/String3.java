
public class String3 {

	public static void main(String[] args) {
		
		char ch[]= { 'J','A','V','A'};
		String s1= new String(ch);
		
		byte b[]= {65,66,67,68,69,85};// ASCI kod za velika slova
		String s2= new String(b);
		
		System.out.println("String =" +s1);
		System.out.println("String =" +s2);
	}

}
