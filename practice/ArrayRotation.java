public class ArrayRotation {

    // static void rotateByOne(int arr[],int n)
    // {
    //     int temp,i;
    //     temp=arr[0];
    //     for(i=0;i<n-1;i++)
    //     {
    //         arr[i]=arr[i+1];
    //     }
    //     arr[i]=temp;
       
    // }

    // static void rotateLeft(int arr[],int n,int d)
    // {
    //     for(int i=0;i<d;i++)
    //     rotateByOne(arr, n);
    // }

    static void rotateLeft(int arr[],int n,int d)
    {
        d=d%n;
        int a[]=new int[n];
        for(int i=0;i<d;i++)
        {
            a[i]=arr[i];
        }
        for(int i=0;i<n-d;i++)
        {
            arr[i]=arr[i+d];
        }
        int s=0;
        for(int i=n-d;i<n;i++)
        {
            arr[i]=a[s++];
        }
    }

     public static void main(String[] args) {
        int arr[]={4,5,2,6,4,1,7};
        int n=arr.length;
        int d=2;
        for(int e:arr)
        System.out.print(e+" ");
        System.out.println();
        rotateLeft(arr, n, d);
        for(int e:arr)
        System.out.print(e+" ");

    } 
}
