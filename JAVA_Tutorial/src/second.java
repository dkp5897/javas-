public class second
{
	int a=10; 		// intance variable
	static double b=20.5;		//static variable
    public static void main(String dk[])
    {
        boolean c=true;		//Local Variable
        
        second s=new second();		// object to print local variable
        // System.out.println(s.a);
        // System.out.println(b);
        // System.out.println(c);
        System.out.println(s.a+" "+b+" "+c);       // to print in same line or with one print
    }
}