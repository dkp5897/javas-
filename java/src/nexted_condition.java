import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


public class nexted_condition {
    public static void main(String[] agrs) {
        int num1,num2,num3;
        System.out.println("Enter the Three numbers :");
        Scanner obj=new Scanner(System.in);
        num1=obj.nextInt();
        num2=obj.nextInt();
        num3=obj.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("The maximum number is :"+num1);
            }
            else
            {
                System.out.println("The maximum number is :"+num3);
            }

        }
        else
        {
            if(num2>num3)
            {
                System.out.println("The maximum number is :"+num2);
            }
            else
            {
                System.out.println("The maximum number is :"+num3);
            }
        }
    }
    
}
