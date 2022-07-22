import java.util.Scanner;

public class float_sum {
    
    public static void main(String [] args) {

        
        float a[]=new float[6];
        
        float sum=0;
        Scanner obj=new Scanner(System.in);
        for(int i=0;i<=3;i++)
        {
            System.out.println("Enter the element..");
            a[i]=obj.nextFloat();
        }
        for(int i=0;i<=3;i++)
        {
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println("the sum="+sum);
       
    }
    
}
