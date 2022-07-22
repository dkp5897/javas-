import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        int a,b;
        float c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any two number:");
        a=s.nextInt();
        b=s.nextInt();
        int ch;
        System.out.println("Enter your choice..");
        ch=s.nextInt();
        switch(ch)
        {
            case 1:c=a+b;
            System.out.println("Summation = "+c);
            break;
            case 2:c=a-b;
            System.out.println("Substraction = "+c);
            break;
            case 3:c=a*b;
            System.out.println("Multiplication = "+c);
            break;
            case 4:c=a/b;
            System.out.println("Division = "+c);
            break;
            case 5:c=a%b;
            System.out.println("Remainder = "+c);
            break;
            default:
            System.out.println("Invalid choice....");
        }

        
    }
}