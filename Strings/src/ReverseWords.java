import java.util.Scanner;

public class ReverseWords {
	
	static String ReverseWord(String S)
	{
		String [] arr=S.split("\\.");		// Storing the given String in a array without "."
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		StringBuilder Builder=new StringBuilder();		// Creating a muttable String
		
		for(int i=arr.length-1;i>=0;i--)
		{
			Builder.append(arr[i]);		// Storing the given String of array to Builder String object
			if(i>0)
			{
				Builder.append(".");	// putting dot (.)
			}
		}
		return Builder.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//String Str= "much.very.program.this.like.i";
		System.out.print(ReverseWord(str));

	}

}
