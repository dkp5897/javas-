import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pairSum {
    static int maxSum(int [] arr,int n)
    {
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i<n-1;i++)
        {
            res=Math.max(res, arr[i]+arr[i+1]);
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();      // muliple lines String Input
        int n=Integer.parseInt(line);   // converting String to integer

        // taking array as input

        int arr[]=new int [n];
        String line2=br.readLine();
        String S[]=line2.trim().split("\\s+");   // String array
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(S[i]);      // converting string array into Integre array 
        }

        System.out.print("The maximun pair sum is: "+maxSum(arr, n));
    }
}
