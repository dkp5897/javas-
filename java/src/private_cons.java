/* In java we can make a private constructor but according to the rule
    we can't access the private member outside of constructor*/


public class private_cons {
    int a; double b; String c;
    private private_cons()
    {
        a=10; b=30.5;c="Aman";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String []agrs) {
        private_cons r=new private_cons();          // we have to generate object in same class not other class
    }
    
}
