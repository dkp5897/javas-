
public class NonReapingElement {

	static void printnum(int arr[], int n)
    {
		int j=0,i=0;
        for ( i = 0; i < arr.length; i++)
        {
            for (j = 0; j < arr.length; j++)
            {
            	if (i!=j && arr[i] == arr[j])
            		break;
            }
            if (j==arr.length)
            	System.out.print( arr[i] + " ");
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,0,0,10,0,0,0,0};
        int n = arr.length;
        System.out.print("The non-repeating Elements:");
        printnum(arr, n);

	}

}
