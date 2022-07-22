
public class Introduction {

	public static void main(String[] args) {
		// You have to store marks of 500 student of a school
		
//		int marks[];  // --> Declaration
//		mark=new int[5];  //-->memory Allocation
//		int [] marks=new int[5];	//-->Decleration+ memory allocation		
		
		int [] score= {98,85,87,46,25};		//-->Decleration +initialize
		
		int [] marks= new int[5];
		marks[0]=95;
		marks[1]=87;
		marks[2]=85;
		marks[3]=45;
		marks[4]=90;
//		for(int i=0;i<5;i++)
//		{
//			System.out.print(marks[i]+" ");
//		}
		
		for(int j=0;j<5;j++)
		{
			System.out.print(score[j]+" ");
		}
		
		

	}

}
