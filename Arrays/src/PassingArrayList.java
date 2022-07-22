import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PassingArrayList {
	
	// passing ArrayList this will return max of array
		static int pair(ArrayList<Integer> a,int n)
		{
			int res=0;
			for(int i=0;i<n;i++)
			{
				res=Math.max(res, a.get(i));
			}
			return res;
		}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// taking ArrayList Input by using BufferedReader
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> A= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			A.add(i,Integer.parseInt(br.readLine()));
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(A.get(i)+" ");
		}
		System.out.println("\nThe maximum value="+pair(A, n));
	}

}
