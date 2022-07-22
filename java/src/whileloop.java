import java.util.Scanner;

public class whileloop {
    public static void main(String[] agrs) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        num=s.nextInt();
        while(num>=0)
        {
            if(num%2==0)
            {
                System.out.println("The number is even.. ");
                break;
            }
            else
            {
                System.out.println("The number is odd..");
                break;
            }
        }


        
    }
    
}
