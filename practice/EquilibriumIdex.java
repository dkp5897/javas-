public class EquilibriumIdex {

    static int eqiIndex1(int arr[],int n)
    {
        int lsum=0,rsum=0;
        for(int i=0;i<n;i++)
        {
            lsum=0;
            for(int j=0;j<i;j++)
            {
                lsum+=arr[j];
            }
            rsum=0;
            for(int j=i+1;j<n;j++)
            {
                rsum+=arr[j];
            }
            if(lsum==rsum)
            return i;
        }
        return -1;
    }

    static int eqiIndex2(int arr[],int n)
    {
        int lsum=0,totalsum=0;
        for(int e:arr)
        totalsum+=e;

        for(int i=0;i<n;i++)
        {
            totalsum=totalsum-arr[i];
            if(lsum==totalsum)
            return i;
            lsum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,3,6,10,-3};
        int n=arr.length;
        System.out.println("The equilibrium index is present at index: "+eqiIndex1(arr, n));
        System.out.println("The equilibrium index is present at index: "+eqiIndex2(arr, n));
    }
}
