import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       // int a[]={15,30,45,60,75};
        //System.out.println(a[3]);       // for a perticular element printing//
        int a[]=new int[5];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array element:");
        for(int i=0;i<5;i++)
        {
            a[i]=obj.nextInt();
        }
        Arrays.sort(a);         // this will show the output in accending order//

        for(int b:a)                // for each loop//
        {
            System.out.print(b+" ");
        }
        
    }

    private static void sort(int[] a) {
    }
    
}
