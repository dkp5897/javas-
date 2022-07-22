// whenever we pass object referec to the cinstructor then it is called copy constructor
// copy constructor copy one constructor object to another

class A
{
    int a; String b;
    A()
    {
        a=10; b="Deepak kumar";
        System.out.println(a+" "+b);
    }
    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
    
}

public class copy_cons {
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(r);
        
    }
    
}
