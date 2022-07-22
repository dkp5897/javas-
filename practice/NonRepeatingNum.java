import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.text.html.parser.Entity;

public class NonRepeatingNum {
    static void nonRep(int arr[],int n)
    {
        int i=0,j=0;
        System.out.print("The non-Repeating Elements are: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                break;
            }
            if(j==arr.length)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    static void repeatingNum(int arr[],int n)
    {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(arr);
        int i=0,j=0;
        System.out.print("The repeating Elements are: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                   // System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j!=arr.length)
            {
                set.add(arr[i]);
            }
        }
        Iterator<Integer> e=set.iterator();
        while(e.hasNext())
        {
            System.out.print(e.next()+" ");
        }
        // Object a[]=set.toArray();
        // for(Object e:a)
        // System.out.print(e+" ");

    }
    public static void main(String[] args) {
        int arr[]={4,5,1,5,2,4,15,15,2,5,8};
        nonRep(arr, arr.length);
        System.out.println();
        repeatingNum(arr, arr.length);
    }
}
