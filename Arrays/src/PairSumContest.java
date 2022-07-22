import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PairSumContest {
	
	
	
	static int pairs(int a[],int n)
	{
		int res=0;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			res=Math.max(res, a[i]+a[n-1-i]);
		}
		return res;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int n = Integer.parseInt(br.readLine());
		
		// taking array input using bufferedReader
		
		int arr[]=new int [n];
		String line=br.readLine(); // to read multiple line integers
		String [] str= line.trim().split("\\s+");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.print(pairs(arr,n));
		
	}
}
