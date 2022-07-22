import java.util.StringJoiner;

public class StrJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. String concatenation using StringJoiner class (Java Version 8+)
		
		StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
		s.add("Hello");    //String 1   
		s.add("Priyansh");    //String 2  
		System.out.println(s.toString());  //Displays result  
	}
}
