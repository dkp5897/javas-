public class BubbleSort {

    static void bubbleSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])

                //swap
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,8,1,2,9,4};
        bubbleSort(arr,arr.length);
        for(int e:arr)
        System.out.print(e+" ");
    }
}
