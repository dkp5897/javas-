
public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= new String("Deepak");
		String s2=s.intern();		// it insert the content of s into s2
		System.out.println(s);
		System.out.println(s2);
		//System.out.println(s.concat(s2));
	}
}
