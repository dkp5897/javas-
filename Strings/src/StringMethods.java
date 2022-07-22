import java.util.StringJoiner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char [] ch= {'D','e','e','p','a','k'};
		String str1= new String(ch);
		String str2="Pradeep";
		String str3=new String("Priyansh");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1.length());
		System.out.println(str2.charAt(2));
		System.out.println(String.format("%s%s",str1,str2));		// make it right
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(1, 4));
		System.out.println(str1.contains("ee"));
		System.out.println(String.join("", str2,str3));
		
		StringJoiner s=new StringJoiner(",");
		s.add(str3);
		s.add(str2);
		System.out.println(s.toString());
		

	}

}
