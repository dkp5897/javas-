
public class pr_08_check_shorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks= {85,90,95,680,5800,820 };
		boolean check=true;
		for(int i=0;i<marks.length-1;i++)
		{
			if(marks[i]>marks[i+1])
			{
				check=false;
				break;
			}
		}
		
		if(check)
		{
			System.out.print("The array is sorted");
		}
		else
		{
			System.out.print("The array is not sorted");
		}

	}

}
