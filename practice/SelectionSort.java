public class SelectionSort {

    // static void selectonSort(int arr[],int n)
    // {
    //     for(int i=0;i<n-1;i++)
    //     {
    //         int smallest=i;
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(arr[j]<arr[smallest])
    //             {
    //                 smallest=j;
    //             }
    //         }
    //         // swap 
    //         int temp=arr[smallest];
    //         arr[smallest]=arr[i];
    //         arr[i]=temp;
    //     }
    // }

    static void selectonSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[smallest])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,8,1,2,9,4};
        selectonSort(arr,arr.length);
        for(int e:arr)
        System.out.print(e+" ");
    
    }
}
