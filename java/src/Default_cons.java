//  A constructor which doesn't have any parameter is called default constructor
// tytpes of constructor:-
// 1. private
// 2. default
// 3. parametrized
// 4. copy


class A
{
    int a;  String b; boolean c;
    // A()
    // {
    //     a=125; b="Deepak";  c=true;
    // }
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class b{
    public static void main(String[] args) {
        A r=new A();
        r.Disp();
    }
}

// public class Default_cons {
//     public static void main(String[] args) {
//         A r=new A();
//         r.Disp();
//     }
    
// }
