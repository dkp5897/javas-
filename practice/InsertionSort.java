public class InsertionSort {

    static void insertionSort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,8,1,2,9,4};
        insertionSort(arr,arr.length);
        for(int e:arr)
        System.out.print(e+" ");
        
    }
}
