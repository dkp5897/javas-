import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) 
    {
        int a[][]=new int [3][3];  
        int n; 
        Scanner obj = new Scanner(System.in);
        System.out.println("which matrix do you want:");
        n=obj.nextInt();
        System.out.println("enter the 2D matrix element:");
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}
