
public class pr_03_avarage_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks= {85,75,80,68,58,82,82,60,67,50};
		int sum=0;
		for(int e:marks)
		{
			sum=sum+e;
		}
		float avg=(float)sum/marks.length;
		System.out.print(avg);
	}

}
