
public class CheckIdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, cols;    
        boolean flag = true;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 0, 0},    
                        {0, 1, 0},    
                        {0, 1, 1}    
                    };
        rows=a.length;
        cols=a[0].length;
        if(rows!=cols)
        	System.out.print("The Matrix should be Square Matrix");
        else
        {
        	for(int i=0;i<rows;i++)
        	{
        		for(int j=0;j<cols;j++)
        		{
        			if(i==j && a[i][j]!=1)//   a00=a11=a22!=1 then false
        				flag=false;
        			if(i!=j && a[i][j]!=0)// a01=a02=a10=a12=a20=a21 !=0 then false
        				flag=false;
        		}
        	}
        }
        if(flag)    
            System.out.println("Given matrix is an identity matrix");    
        else    
            System.out.println("Given matrix is not an identity matrix");    
	}

}
