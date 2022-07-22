import java.util.Hashtable;
import java.util.Vector;

public class CollectionsBasic {

	public static void main(String[] args) {
		
		int arr[]= {5,8,4,6,2};
		Vector<Integer> v=new Vector<Integer>();
		Hashtable<Integer,String>table=new Hashtable<Integer, String>();
		
		 // Adding the elements into the
        // vector
		v.addElement(1);
		v.addElement(2);
		
		// adding in hashtable
		
		table.put(1, "Deepak");
		table.put(2, "Pradeep");
		
		// Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()
  
        // Accessing the first element of the
        // array, vector and hashtable
		
		 	System.out.println(arr[0]);
	        System.out.println(v.elementAt(0));
	        System.out.println(table.get(1));
	  
	        // Array elements are accessed using [],
	        // vector elements using elementAt()
	        // and hashtable elements using get()

	}

}
