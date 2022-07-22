import java.util.*;
public class HashSetBasic_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set= new HashSet<>();
		set.add("India");
		set.add("Australia");
	    set.add("South Africa");
	    
	    // adding India again
	    set.add("India");
	    System.out.println("Set: \n"+set);	// [India,Australia,South Africa]
	    System.out.println("Is set contains India or not: "+set.contains("India"));	// true
	    
	    // Removing items from HashSet
        // using remove() method
        set.remove("Australia");
        System.out.println("Set after removing Australia: "+ set);	// [India,South Africa]
        
        // Display message
        System.out.println("Iterating over list:");
  
        // Iterating over hashSet items
        Iterator<String> i = set.iterator();
  
        // Holds true till there is single element remaining
        while (i.hasNext())
  
            // Iterating over elements
            // using next() method
            System.out.println(i.next());
	}
}
