//in this a function is called in another function and we have to call only one function


public class fun_inside_function {
	
	static void fun_01()
	{
		System.out.println("Good Mornig");
		fun_02();
	}
	static void fun_02()
	{
		System.out.println("Good Afternoon");
		fun_03();
	}
	static void fun_03()
	{
		System.out.println("Good Evening");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun_01();		// calling only one function

	}

}
