// A constructor through which we can pass one or more parameters is called parametrized constructor
// 

class A
{
    int x,y;
    A(int a, int b)
    {
        x=a;   y=b;
    }
    A(int a, String b)              // we can make more than one construction in a class bue we have to use different 
                                                        // data types are different size
    {
        System.out.println(a+" "+b);    // we can also print without void show
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
public class parametrized_cons {
    public static void main(String[] args) {
        A r=new A(100,200);
        r.show();
        A ref=new A(250,"deepak");
    }
}
