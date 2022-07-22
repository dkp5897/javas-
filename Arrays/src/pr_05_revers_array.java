import java.util.Arrays;
import java.util.Collections;

public class pr_05_revers_array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks= {85,75,80,68,58,82,60,67};
		int l=marks.length;
		
		// method-01 (it will not reverse the matrix only show in reverse order)
		
		/*for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[(marks.length-1)-i] + " ");	
		}
		System.out.println();	
		for(int e:marks)
		{
			System.out.print(e+" ");	
		}*/
		
		
		
		//method-02  (swapping)
		
		/*
		int temp;
		for(int i=0;i<l/2;i++)
		{
			// swap a[i] and a[l-1-i]
			// a	b	temp
			// |4|	|3|	||
			
			temp=marks[i];
			marks[i]=marks[l-1-i];
			marks[l-1-i]=temp;
		}
		
		for(int e:marks)
		{
			System.out.print(e+" ");
		}
		*/
//		System.out.println();
		
		//method-03
		/*
		int [] temp1 =new int[l];
		int j=0;
		for(int i=0;i<l;i++)
		{
			temp1[j++]=marks[i];
		}
		for(int e:temp1)
		{
			System.out.print(e+" ");
		}
		*/
		
		
		// method-04 (by using  java.util.Collections.reverse(List list))
		
		Collections.reverse(Arrays.asList(marks));
		System.out.println(Arrays.asList(marks));
	
	}

}
