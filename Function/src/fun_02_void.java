
public class fun_02_void {
	
	static void fun(int a, float f, String s)	// void function will not return anything
	{
		System.out.println("The integer value is: "+ a);
		System.out.println("The float value is: "+ f);
		System.out.println("The String is: "+ s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3546;
		float b=6544.544f;
		String s="deepak kumar";
		fun(a,b,s);

	}

}
