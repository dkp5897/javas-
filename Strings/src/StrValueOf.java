
public class StrValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=15;
		long b=400;
		boolean c=true;
		
		String s1= String.valueOf(a);	// it convert int into string
		System.out.println(s1+10);		// 1510 b/c it is String addition
		
		String s2= String.valueOf(b);
		System.out.println(s2+"avg");	//400avg
		
		String s3= String.valueOf(c);
		System.out.println(s3+21);		//true21
	}
}
