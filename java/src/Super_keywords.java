// Super keywords refer to the object of super class
// It is used when we want to call the super class variable, method,& constructor through sub-class object
// whenever the super class and sub class variable and method name both are same than it can be used only
/* to avoid the confusion between super class and sub classes variable and methods that
    have same name we should use super keyword.*/

class A             // super class
{
    int a=15;
}
class B extends A   // sub-class
{
    int a=20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class Super_keywords {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
    
}
