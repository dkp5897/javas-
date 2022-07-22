import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// ArrayList: Dynamic In Nature: Rubber Band
		
		ArrayList<Integer> A= new ArrayList<Integer>();
		System.out.println("Size="+A.size());
		A.add(10);
		A.add(20);
		A.add(30);
		A.add(40);
		A.add(50);
		A.add(60);
		A.add(70);
		A.add(80);
		A.add(1);
		// Print ArrayList At Once
		System.out.println(A);
		System.out.print("After adding Size="+A.size());
		
		System.out.println();
		// Print All Values in ArrayList
		int n=A.size();
		for(int i=0;i<n;i++)
		{
			System.out.print(A.get(i)+" ");
		}
		System.out.println();
		// Removing Elements
		System.out.println("Removing from Arraylist at Index 1");
		A.remove(1);
		A.remove(5);
		
		System.out.println(A);
        System.out.println("After Removal - Size: " + A.size());
		

	}

}
