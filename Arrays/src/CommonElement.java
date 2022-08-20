public class CommonElement {
    // Method-1 TC: O(n^3) SC:O(1)
    static void commonElement(int a[],int b[],int c[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<c.length;k++){
                    if(a[i]==b[j]&&b[j]==c[k])
                    System.out.print(a[i]+" ");
                }
            }
        }
    }

    // Method-2 
    static void commonElement2(int a[],int b[],int c[]){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length && k<c.length){
            if(a[i]==b[j] && b[j]==c[k]){
                System.out.print(a[i]+" ");
                i++;
                j++;
                k++;

            }

            else if(a[i]>b[j])
            j++;
            else if(b[j]>c[k])
            k++;
            else
            i++;
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,4,5,7,8,9};
        int arr2[]={1,3,5,7,8,9};
        int arr3[]={1,4,5,6,8,9};

        // commonElement(arr1, arr2, arr3);
        commonElement2(arr1, arr2, arr3);


    }
}
