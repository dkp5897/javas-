import java.util.Arrays;

public class pr_06_maximum_element {
	
	static void max1(int a[]) {
		int n=a.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max=Math.max(max, a[i]);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		
		
		 
		
		int [] marks= {85,-75,80,680,58,820,60,67};
//		int max=0;
//		for(int e:marks)
//		{
//			if(e>max)
//			{
//				max=e;
//			}
//		}
//		System.out.println("The maximum element present in array is= "+max);
		
//		System.out.println("\nThe minimum Integer value is= "+Integer.MIN_VALUE);
//		System.out.println("nThe maximum Integer value is= "+Integer.MAX_VALUE);
		
		//method-02
		Arrays.sort(marks);
		System.out.print(marks[marks.length-1]);
		
		// method-03
		max1(marks);
	}

}
