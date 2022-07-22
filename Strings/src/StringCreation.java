
public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method-01
		char[] ch= {'D','e','e','p','a','k'};
		String str=new String(ch);				//converting char array to string    
		System.out.println(str);
		
		//Method-02
		
		String str2="Deepak Kumar";
		System.out.println(str2);
		
		String str3=new String("Pradeep");
		System.out.println(str3);
		
		System.out.println(str2.length());
		System.out.println(str2.equals(str3));
		
	}

}
