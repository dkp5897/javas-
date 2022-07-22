import java.util.*;
public class HashMap_with_Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a HashMap with initial Capacity
		HashMap<Integer,String> map1=new HashMap<>(10);
		HashMap<Integer, String>map2=new HashMap<Integer, String>(10);
		
		// adding elements
		
		map1.put(1, "One");
		map1.put(2, "Two");
		map1.put(3, "Three");
		
		map2.put(4, "Four");
		map2.put(5, "Five");
		map2.put(6, "Fivve"); 
		map2.put(6, "Six"); // the updated value will print
		
		System.out.println("First Map: "+map1);
		System.out.println("Second Map: "+map2);
	}

}
