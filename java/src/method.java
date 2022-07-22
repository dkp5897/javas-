import java.util.Scanner;

/*method is similar to function i c programming*/


public class method {
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        a=obj.nextInt();
        b=obj.nextInt();
        int r=sum(a,b);
        System.out.println("Addition= "+r);             // we can't called a non static method in static main without object//
        
    }
    static int sum(int a,int b)
    {
        return a+b;
    }
    
}
