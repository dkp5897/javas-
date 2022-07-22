
public class pr_07_min_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marks= {85,7500,80,680,58,820,60,67};
		int min=Integer.MAX_VALUE;
		for(int e:marks)
		{
			if(e<min)
			{
				min=e;
			}
		}
		System.out.print(min);

	}

}
