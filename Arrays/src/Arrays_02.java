
public class Arrays_02 {

	public static void main(String[] args) {
		// Length of array
		int [] marks= {45,65,78,98,25,24};
		float [] score= {55.25f,45.54f,78.65f,99.24f,4.5f};
		String [] std= {"Aman","Deepak","Sooraj","Rajan"};
		
		
		System.out.println("\nLength of int marks array=" +marks.length);
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"  ");
		}
		
		System.out.println("\n\nLength of float score array="+score.length);
		for(int i=0;i<score.length;i++)
		{
			System.out.print(score[i]+"  ");
		}
		
		System.out.println("\n\nLength of String std array="+std.length);
		for(int i=0;i<std.length;i++)
		{
			System.out.print(std[i]+"   ");
		}
		
		
		// for printing array in reverse order//
		
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.print(marks[i]+"  ");
		}
		System.out.print("\n\n");
		
		for(int i=score.length-1;i>=0;i--)
		{
			System.out.print(score[i]+"  ");
		}
		System.out.print("\n\n");
		
		for(int i=std.length-1;i>=0;i--)
		{
			System.out.print(std[i]+"  ");
		}
		
		
		// for printing array by using for-each loop//
		
		for(int element:marks)
		{
			System.out.print(element+"  ");
		}
		System.out.print("\n\n");
		
		for(float element:score)
		{
			System.out.print(element+"  ");
		}
		System.out.print("\n\n");
		
		for(String element:std)
		{
			System.out.print(element+"  ");
		}
	}

}
