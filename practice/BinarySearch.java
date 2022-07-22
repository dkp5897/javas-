import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class BinarySearch {

    // Mtehod -01 (by loop)
    static int binarySearch(int arr[],int key)
    {
      
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==key)
            return mid;
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else 
            {
                low=low+1;
            }
        }
        return -1;
    }

    // Method-02 (by recursion)

    static int binarySearch2(int arr[],int low,int high,int key)
    {
        int mid=low+(high-low)/2;
        if(low<=high)
        {
            if(arr[mid]==key)
            return mid;
            else if(key<arr[mid])
            return binarySearch2(arr, low, mid+1, key);
            else 
            return binarySearch2(arr, mid-1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,5,7,9,10};
        int x=7;
        int n= arr.length;
        int ans=binarySearch(arr, x);
        System.out.println(ans);
        int ans2=binarySearch2(arr, 0,n-1,x);
        System.out.println(ans2);

    }
}
