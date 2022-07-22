class age
{
    int a; String b;
    age(int x, String y)
    {
        a=x; b=y;
        System.out.println(x+" "+y);
    }
    age(age ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }

}

public class para_copy_cons {
    public static void main(String [] args) {

        age r= new age(21,"Deepak kumar");
        age r1=new age(r);
    }
    
}
