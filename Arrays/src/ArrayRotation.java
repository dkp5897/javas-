
public class ArrayRotation {

    public static void rotateLeft(int array[], int d, int n) {
    	
    	//method-01
    	
//        for (int i = 0; i < d; i++)
//            rotateArrayByOne(array, n);
//    }
//
//    public static void rotateArrayByOne(int array[], int n) {
//        int i, temp;
//        temp = array[0];
//        for (i = 0; i < n - 1; i++)
//            // shifts array element to the left by 1
//            array[i] = array[i + 1];
//        array[i] = temp;
//    }
	
    	// method-02(optimized)
	d=d%n;
    int a[]=new int[d];
    for(int i=0;i<d;i++){
        a[i]=array[i];
    }
    for(int i=0;i<n-d;i++){
        array[i]=array[i+d];
    }
    int s=0;
    for(int i=n-d;i<n;i++){
        array[i]=a[s++];
    }
    }

    public static void main(String[] args) {
        int array[] = { 11, 22, 33, 44, 55, 66, 77 };
        int r = 6;
        int n = array.length;
        System.out.println("Array before rotation: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        rotateLeft(array, r, n);
        System.out.println("\nArray after left rotation: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(array[i] + " ");
        }

    }

}
