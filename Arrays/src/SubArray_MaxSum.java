public class SubArray_MaxSum {
    static int maxSumSubarray(int arr[],int n){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);

            if(sum<0)
            sum=0;
        }
        return max;
    }

    static void subArray(int arr[],int n){
        int sum=0;
        int subArraySum=maxSumSubarray(arr, arr.length);
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                for(int k=i;k<=j;k++){
                    if(sum==subArraySum)
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        subArray(arr, arr.length);
        
    }
}
