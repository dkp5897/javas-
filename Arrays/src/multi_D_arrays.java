
public class multi_D_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr =new [5]; --->1D array
//		int [][] flats=new int [2][3];---2D array
		
		int [][] flats;
		flats = new int[3][3];
		flats[0][0]=101;
		flats[0][1]=102;
		flats[0][2]=103;
		flats[1][0]=201;
		flats[1][1]=202;
		flats[1][2]=203;
		flats[2][0]=301;
		flats[2][1]=302;
		flats[2][2]=303;
		
		//printing a 2-D arrays
		
		for(int i=0;i<flats.length;i++)
		{
			for(int j=0;j<flats[i].length;j++)
			{
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
