
public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method -01 By Using equals() Method
		
		String str1="Deepak";
		String str2="Deepak";
		String str3=new String("Deepak");
		String str4="Pradeep";
		System.out.println(str1.equals(str2));	//true
		System.out.println(str2.equals(str3));	//true
		System.out.println(str3.equals(str4));	//false
		
		String s1="Deepak";
		String s2="DEEPAK";
		System.out.println(s1.equals(s2));			// false
		System.out.println(s1.equalsIgnoreCase(s2));// true
		
		
		
		// Method -02 By using == Operator
		
		String s3="Deepak";
		String s4="Deepak";
		String s5=new String("Deepak");
		System.out.println(s3==s4);		//true (because both refer to same instance)
		System.out.println(s4==s5);		//false(because s3 refers to instance created in nonpool)  
		
		
		//(3) By Using compareTo() method
		String st1="Deepak";
		String st2="Deepak";
		String st3=new String("Priyansh");
		String st4="Pradeep";
		System.out.println(st1.compareTo(st2));// 0 Because there is no difference
		System.out.println(st2.compareTo(st3));// -12 Because D is less than 12 times of P
		System.out.println(st3.compareTo(st4));// 8 Because i is greater than 8 times of a
	}
}
