import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;
public class percentage{
    public static void main(String[] args) {
        int total=0;
        int marks[]=new int[6];
        Scanner obj =new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter the mark in subject-"+i);
            marks[i]=obj.nextInt();
        }
        for(int i=1;i<=5;i++)
        {
            total=total+marks[i];
        }
        System.out.println("The total is mark in all subject="+total);
        float per=(total/5);
        System.out.println("The total percentage="+per);

        
    }

}