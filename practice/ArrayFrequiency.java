public class ArrayFrequiency {

    static int freq(int arr[],int n,int x)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            count++;
        }
        if(count>0)
        return count;

        return -1;
    }
    public static void main(String[] args) {
        
        int arr[]={5,4,8,2,1,2,1,2};
        int n=arr.length;
        int x=9;
        int ans=freq(arr, n, x);
        System.out.printf("the frequency of %d is %d times",x,ans);

    }
}
