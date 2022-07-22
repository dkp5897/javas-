
public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Sachin";  
		s.concat(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(s);//will print Sachin because strings are immutable objects 
		
		
		
		
			   String Str="Sachin";  
			   Str=s.concat(" Tendulkar");  
			   System.out.println(Str); 
			   System.out.println(Str); 
	}
}
