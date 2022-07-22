import java.util.Scanner;

public class if_condition {
    public static void main(String[] agrs) {
        int pwd;
        System.out.print("Enter the passward :");
        Scanner obj=new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==5035)
        {
            System.out.println("Name : Deepak kumar");
            System.out.println("mobile number : 7376703898");
            System.out.println("address:janakpur");   
        }
        else
        {
            System.out.print("Sorry wrong passward...");
        }
    }
    
}
