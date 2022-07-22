import java.util.Arrays;

public class missingNumber {

    static int missingNumber(int arr[],int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i+1)
            return i+1;
        }
        return -1;
    }

    static int missingNumber2(int arr[],int n)
    {
        int sum=n*(n+1)/2;
        int newsum=0;
        for(int e:arr)
        {
            newsum+=e;
        }
        return sum-newsum;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,1,8,5,9,6};
        System.out.println(missingNumber(arr,arr.length+1));
        System.out.println(missingNumber2(arr,arr.length+1));
    }
}
