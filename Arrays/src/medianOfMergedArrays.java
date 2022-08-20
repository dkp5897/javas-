import java.util.Arrays;

public class medianOfMergedArrays {
    static int median(int arr[],int n){
        if(n%2==0){
            int p=arr[n/2];
            int q=arr[(n/2)-1];
            int ans=(p+q)/2;
            return ans;
        }
        else{
            return arr[n/2];
        }
    }
    public static void main(String[] args) {
        int arr1[]={-5, 3, 6, 12, 15};
        int arr2[]={-12, -10, -6, -3, 4, 10};

        int merge[]=new int[arr1.length+arr2.length];

        System.arraycopy(arr1, 0, merge, 0, arr1.length);
        System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);

        Arrays.sort(merge);
        int medians=median(merge, merge.length);
        System.out.println(medians);

    }
}
