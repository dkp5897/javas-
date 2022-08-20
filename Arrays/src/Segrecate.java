public class Segrecate {
    static void printArray(int arr[],int n){
        for(int e:arr)
        System.out.print(e+" ");
        System.out.println();
    }
    static void segregate(int arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            arr[j++]=arr[i];
        }
        while(j<n){
            arr[j++]=1;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,1,1,1,0,0,1,0};
        printArray(arr, arr.length);
        segregate(arr, arr.length);
        printArray(arr, arr.length);
    }
}
