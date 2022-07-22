class A 
{
    A()
    {
        System.out.println("Hello dear..");
    }
}
class B extends A
{
    B()
    {
                                   
        System.out.println("Hello world..");    // call sub class
    }
}

public class super_cl_constructor {
    public static void main(String[] args) {
        B ref =new B();
        
    }
    
}
