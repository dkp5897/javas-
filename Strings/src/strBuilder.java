
public class strBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1= new StringBuilder("Deepak");
		StringBuilder s2= new StringBuilder(" Kumar");
		
		StringBuilder s= s1.append(s2);
		System.out.println(s.toString());
	}
}
