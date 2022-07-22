/*this program is used to generate reverse number*/

import java.util.Scanner;

public class R_table{
    public static void main(String [] args){
        int num,i=10;
        Scanner s= new Scanner(System .in);
        System.out.print("enter the number : ");
        num=s.nextInt();
        do
        {
            System.out.println(num*i);
            i--;
        }while(i>=1);

    }
    
}
