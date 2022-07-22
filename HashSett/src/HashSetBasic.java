import java.util.*;
public class HashSetBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();
  
        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();
  
        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();
        
        ArrayList<Integer> list3 = new ArrayList<>();
        
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        list3.add(3);
        list3.add(4);
        set.add(list1);
        set.add(list2);
        set.add(list3);
        
        System.out.println("elements of List-1: "+list1);
        System.out.println("elements of List-2: "+list2);
        
        System.out.println("elements of set: "+set);
        System.out.println("Size of set= "+set.size());

	}

}
