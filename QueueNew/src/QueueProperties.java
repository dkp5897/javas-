import java.util.*;
public class QueueProperties {

	public static void main(String[] args) {
		 Queue<String> pq = new PriorityQueue<>();
		 pq.add("Deepak");
		 pq.add("Kumar");
		 pq.add("Prajapati");
		 
		 Iterator iterator = pq.iterator();
		  
	     while (iterator.hasNext()) {
	    	 System.out.print(iterator.next() + " ");
	     }
		 System.out.println();
		 System.out.println(pq.poll());	// it will delete the first element
		 System.out.println(pq.peek());	// print latest element
		 System.out.println(pq);
		 
		 pq.remove("Kumar");
		 System.out.println(pq);
	}
}
