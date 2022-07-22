public class MaxMin {
    static void minMax(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.print("Maximum value: "+max+" and Minimum Value: "+min);
    }
    public static void main(String[] args) {
        int arr[]={45,9,82,235,125,35};
        minMax(arr, arr.length);
    }
}
