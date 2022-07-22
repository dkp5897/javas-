
class A 
{
    void show()
    {
        System.out.println("Hello dear..");
    }
}
class B extends A
{
    void show()
    {
        super.show();
        System.out.println("Hello world..");
    }
}

public class super_cl_method {
    public static void main(String[] args) {
        B ref= new B();
        ref.show();
        
    }
    
}
