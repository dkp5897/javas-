import java.net.PortUnreachableException;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        int a,b,sum;
        System.out.println("Enter any two number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        sum=a+b;
        System.out.print("Sum of two number: "+sum);

    }

    
}
