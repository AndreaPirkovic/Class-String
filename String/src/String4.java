
public class String4 {

	public static void main(String[] args) {
		char ch;
		String s1= "Zika";
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(3));
char ch2;
String s6 = "Januar";
ch2= s6.charAt(0);

System.out.println("Krakakret na poziciji 0 je: " + ch2);

ch2 = "Java".charAt(3);
System.out.println("Krakakret na poziciji 3 je: " + ch2 + "\n");


char ch3[]= {'J','A','V','A'};
String s7 = new String(ch3);
System.out.println("String =" + s7);
System.out.println("Length =" + s7.length());
System.out.println("Lenght =" + "Java programiranje".length());	

String s8="JAVA";
String s9="JAVA";
String s10="java";
System.out.println(s8 + "equals" + s9+ "="+s8.equals(s9));
System.out.println(s8 + "equals" + s10+ "="+s8.equals(s10));
System.out.println(s8 + "equals" + s10+ "="+s8.equalsIgnoreCase(s10));


boolean b;
String s11="JAVA";
String s12 ="JAVA";
String s13= "Java";
String s14= new String("JAVA");
String s15= new String("JAVA");
System.out.println(s11 + "equals" + s12+ "="+ s11.equals(s12));
System.out.println(s11 + "==" + s12+ "="+ s11==s12);
System.out.println(s11 + "equals" + s14+ "="+ s11.equals(s14));
System.out.println(s11 + " == " + s14+ "=" + s11 == s14);
System.out.println(s14 + "equals" + s15+ "="+ s14.equals(s15));
System.out.println(s14 + " == " + s15+ "="+ s14 == s15);
String s16="JAVA";
String s17 ="JAVA";
String s18= "Java";
System.out.println(s16 + "compared to" + s17+ "="+ s16.compareTo(s17));
System.out.println(s17 + "compared to" + s18+ "="+ s17.compareTo(s18));	
	
	
	}

}
