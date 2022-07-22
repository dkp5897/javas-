import java.net.SocketPermission;

import javax.print.event.PrintEvent;

public class ArrayRotateright {

    // static void rotateByOne(String arr[],int n)
    // {
    //     String temp;
    //     int i;
    //     temp=arr[n-1];
    //     for( i=n-1;i>0;i--)
    //     {
    //         arr[i]=arr[i-1];
    //     }
    //     arr[i]=temp;
    // }

    // static void rotateRight(String arr[],int n,int d)
    // {
    //     for(int i=0;i<d;i++)
    //     rotateByOne(arr, n);
    // }

    static void rotateRight(String  arr[],int n,int d)
    {
        d=d%n;
        String s[]=new String[n];
        for(int i=0;i<d;i++)
        {
            s[i]=arr[n+i-d];
        }
        for(int i=d;i<n;i++)
        {
            arr[i]=arr[i-d];
        }
        int r=0;
        for(int i=0;i<d;i++)
        {
            arr[i]=s[r++];
        }
    }
    public static void main(String[] args) {
        String [] str={"Deepak","Kumar","Prajapati"};
        int d=2;
        for(String e:str)
        System.out.print(e+" ");
        System.out.println();
        rotateRight(str, str.length, d);
        for(String e:str)
        System.out.print(e+" ");
    }
}
