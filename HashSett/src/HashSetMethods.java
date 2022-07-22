import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<>();
		HashSet<String>set2=new HashSet<>();
		set.add("Deepak");
		set.add("Pradeep");
		set.add("Priyansh");
		set.add("Deepak");
		
		set2.add("Deepak");
		set2.add("Pradeep");
		set2.add("Priyansh");
		
		System.out.println("\nSet: \n"+set);
		
		set.remove("Deepak");
		System.out.println("\nAfter removing Set:\n "+set);
		
		System.out.println(set.contains("Priyansh"));
		System.out.println(set.contains("Deepak"));
		
		System.out.println(set.isEmpty());
		
		set.add("Deepak");
		set.add("Varya");
		set.add("Divyansh");
		
		System.out.println("\nIterating Over the Set:");
		
		Iterator<String> i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		
		System.out.println("The Size of set : "+set.size());
		
		Object cloneset=set.clone();
		System.out.println("The clone Set: "+cloneset);
		
		HashSet<String>cloneset2=(HashSet<String>) set.clone();
		System.out.println("The clone Set2: "+cloneset2);
		
		System.out.println(set.equals(cloneset2));			// true
		System.out.println(cloneset.equals(cloneset2));		// true	
		System.out.println(cloneset2.equals(set));			//true
		System.out.println(set.equals(set2));				// false
		
		System.out.println("\nThe HashCode of set: "+set.hashCode());
		System.out.println("The HashCode of set2: "+set2.hashCode());
		System.out.println("The HashCode of cloneset: "+cloneset.hashCode());
		
		ArrayList<String>list=new ArrayList<>();
		list.add("Deepak");
		list.add("Pradeep");
		list.add("Chandramukhi");
		
		set2.removeAll(list);
		System.out.println("\nset2 after removeAll:\n"+set2);	//this will remove all elements from set2 present in list
		
		set.removeAll(list);		// this will remove all elements from set present in list
		System.out.println("\n set after removeAll:\n"+set);
		
		set.removeAll(set2);
		System.out.println("\nNow set after removeAll:\n"+set);	//this will remove all elements remaining in set present in set2
		
		System.out.println("\nThe new size of set: "+set.size());
		System.out.println("\nThe new size of set2: "+set2.size());
		
		
		set2.addAll(list);
		System.out.println("\nset2 after addAll with list:\n "+set2);
		
		set.addAll(set2);
		System.out.println("\nset after addAll with set2:\n "+set);
		
		set.addAll(list);
		System.out.println("\nset after addAll with list:\n "+set);
		
		
		System.out.println("Is set containsAll cloneset: "+set.containsAll(cloneset2));
		System.out.println("Is set2 containsAll cloneset: "+set2.containsAll(cloneset2));
		
//		System.out.println("Is set retainAll cloneset: "+set.retainAll(cloneset2));
//		System.out.println("Is set2 retainAll cloneset: "+set2.retainAll(cloneset2));
//		System.out.println("Is set retainAll cloneset: "+set.retainAll(set2));
		
		System.out.println("\nset as Array: ");
		Object[] arr=set.toArray();
		for(Object e:arr)
			System.out.print(e+" ");
		
		
		System.out.println("\n\nset2 as String:");
		System.out.println(set2.toString());

	}
	

}
