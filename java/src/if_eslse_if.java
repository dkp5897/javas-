import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class if_eslse_if {
    public static void main(String[] args) 
    {
        int marks;
        System.out.print("Enter the marks :");
        Scanner obj = new Scanner(System.in);
        marks=obj.nextInt();
        if(marks>=60&&marks<=100)
        {
            System.out.println("First Division");
        }
        else if(marks<=60&&marks>=45)
        {
            System.out.println("Second Division");
        }
        else if(marks<=45 && marks>=30)
        {
            System.out.println("Third Division");
        }
        else 
        {
            System.out.print("failed");
        }
    }
    
}
