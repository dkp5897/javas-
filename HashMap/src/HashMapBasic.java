import java.util.*;
public class HashMapBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an empty Hashmap of String and Integer
		
		HashMap<String, Integer> Map=new HashMap<String, Integer>();
		HashMap<String, Integer> Map2=new HashMap<>();
		
		 // Adding elements to the Map
		Map.put("Aman Sonkar", 8);
		Map.put("Deepak Kumar", 21);
		Map.put("Rajan Singh", 40);
		Map.put("Sooraj Patel", 58);
		
		// Printing the Map
		System.out.println(Map);
		
		// Size of Map
		System.out.println("Size of Map="+Map.size());
		
		// Checking if a key is present and if present, print value by passing random element
		
		System.out.println(Map.containsKey("Deepak Kumar"));
		
		if(Map.containsKey("Aman Sonkar"))
		{
			// Mapping
			Integer a=Map.get("Aman Sonkar"); // getting key for Aman Sonkar
			System.out.println("Roll Number for Name" + "\"Aman Sonkar\"is: " +a);
		}
		
		if(Map.containsKey("Sooraj Patel"))
		{
			// Mapping
			Integer a=Map.get("Sooraj Patel");
			System.out.println("Roll Number for Name" + "\"Sooraj Patel\"is: " +a);
		}
		
		if(Map.containsKey("Rajan Singh"))
		{
			// Mapping
			Integer a=Map.get("Rajan Singh");
			System.out.println("Roll Number for Name" + "\"Rajan Singh\"is: " +a);
		}
		

	}

}
