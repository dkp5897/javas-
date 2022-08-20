import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicate {
    static void printArray(int arr[]){
        for(int e:arr)
        System.out.print(e+" ");
        System.out.println();
    }

    //method-2 by HashSet
    static void removeDuplicate2(int arr[],int n){
        HashSet<Integer>set=new HashSet<>();
        for(int e:arr){
            set.add(e);
        }
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
    // method-1     TC: O(nlogn)
    static void removeDuplicate(int arr[],int n){
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1])
            arr[j++]=arr[i];
        }
        // for last element
        arr[j++]=arr[n-1];
        
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // method-3 By HashMap
    static void removeDuplicate3(int arr[],int n){
        Arrays.sort(arr);
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<n-1;i++){
            if(map.containsKey(arr[i]))
            map.put(arr[i], map.get(arr[i])+1);
            else
            map.put(arr[i], 1);
        }
        map.forEach((key,value)->System.out.print(key+" "));
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,2,5,5};
        printArray(arr);

        removeDuplicate2(arr, arr.length);
        System.out.println();

        removeDuplicate(arr, arr.length);

        removeDuplicate3(arr, arr.length);
        
    }
}
