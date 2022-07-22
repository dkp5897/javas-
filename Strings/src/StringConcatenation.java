
public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// method-01 By using + Operator
		String str1="Deepak";
		String str2=" Kumar";
		String str3 =str1+str2;
		System.out.println(str3);
		System.out.println(str1+str2);
		System.out.println(str3+str1);
		System.out.println("Pradeep"+" Kumar");
		String s="Sachin"+" Tendulkar";  
		System.out.println(s);//Sachin Tendulkar  
		
		
		
		
		// method-02 By using concat()
		String s1="Deepak";
		String s2=" Kumar";
		System.out.println(s1.concat(s2));

	}
}
