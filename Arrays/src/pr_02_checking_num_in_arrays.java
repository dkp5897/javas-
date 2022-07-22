import java.util.Scanner;

public class pr_02_checking_num_in_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {25,78,45,69,235,63};
		boolean check=false;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int e:arr)
		{
			if(num==e)
			{
				check=true;
				break;
			}
		}
		if(check)
			System.out.print("The number is present in array");
		else
			System.out.print("The number is not present in array");

	}

}
