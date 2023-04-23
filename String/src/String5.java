
public class String5 {

	public static void main(String[] args) {
		
		String str = "13434uyt0908d0)(djkshg";
		System.out.println(str);
		// Kreiranje stringa pomocu kljucne reci new
		String str1= new String("Utorak, 24.januar.");
		//Inicijalizacija stringa postojecim stringom
		String s1 = "Podatak1";
		System.out.println(s1);
		String s2 = new String(s1);
		System.out.println(s2);
		// inicijalizacija nizom char vrednosti
		char s3[]= {'j', 'a','v','a'};
		System.out.println(s3);
		// inicijalizacija podnizom
		String s4= new String(s3,1,3);
		System.out.println(s4);
	}

}
