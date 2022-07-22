public class MaxElement {

    static void maxele(int arr[],int n)
    {
        int max1=0,max2=0,max3=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1)
            {
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 && arr[i]<max2)
            {
                max3=arr[i];
            }
        }
        System.out.print("The three maximum elements are: "+max1+" "+max2+" "+max3);
    }
    public static void main(String[] args) {
        int arr[]={8,5,1,4,2,6};
        int n=arr.length;
        maxele(arr, n);
    }
}
