import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class patt_04 {
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 int [] a= {10,12,2,4,6,1,8};
		 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=1;j<a.length;j++)
			 {
				 if(a[i]+a[j]==10)
					 System.out.print(a[i]+" "+a[j]+" ");	 
			 }
			 
		 }
		
		

	}

}
