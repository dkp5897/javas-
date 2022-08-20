import java.util.HashMap;
import java.util.Map;
// import java.util.*;
public class mergedSortedArray {
    // method-1: Time Complexity : O(n1 + n2),  Auxiliary Space : O(n1 + n2)
    static void merge(int a[], int b[], int n, int m){
        int arr[]=new int[n+m];
        int i=0,j=0,x=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                arr[x++]=a[i++];
            }
            else{
                arr[x++]=b[j++];
            }
        }
        while(i<n){
            arr[x++]=a[i++];
        }
        while(j<m){
            arr[x++]=b[j++];
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    // method-2: Time Complexity: O( nlog(n) + mlog(m) ) , Auxiliary Space: O(N)
    static void merged(int a[],int b[],int n,int m){
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i], true);
        }
        for(int i=0;i<m;i++){
            map.put(b[i], true);
        }

        for (Map.Entry<Integer,Boolean> me : map.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        int b[]={2,4,6,8};
        System.out.println("Array after merging:");
        merge(a, b, a.length, b.length);

        merged(a, b, a.length, b.length);



    }
}
