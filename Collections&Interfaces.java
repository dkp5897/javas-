										
										----------:Collections in Java:---------

Any group of individual objects which are represented as a single unit is known as the collection of the objects. 
In Java, a separate framework named the “Collection Framework” has been defined in JDK 1.2 which holds all the collection 
classes and interface in it. 

The Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of 
Java collection classes.


----->What is a Framework?

A framework is a set of classes and interfaces which provide a ready-made architecture. In order to implement a new 
feature or a class, there is no need to define a framework. However, an optimal object-oriented design always includes 
a framework with a collection of classes such that all the classes perform the same kind of task. 


------>Need for a Separate Collection Framework

Before the Collection Framework(or before JDK 1.2) was introduced, the standard methods for grouping Java objects 
(or collections) were Arrays or Vectors, or Hashtables. All of these collections had no common interface. 
Therefore, though the main aim of all the collections is the same, the implementation of all these collections was 
defined independently and had no correlation among them. And also, it is very difficult for the users to remember all 
the different methods, syntax, and constructors present in every collection class. 

Let’s understand this with an example of adding an element in a hashtable and a vector. 


Code:-

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

Output:-

5
1
Deepak


As we can observe, none of these collections(Array, Vector, or Hashtable) implements a standard member access interface, 
it was very difficult for programmers to write algorithms that can work for all kinds of Collections. Another drawback 
is that most of the ‘Vector’ methods are final, meaning we cannot extend the ’Vector’ class to implement a similar kind 
of Collection. Therefore, Java developers decided to come up with a common interface to deal with the above-mentioned 
problems and introduced the Collection Framework in JDK 1.2 post which both, legacy Vectors and Hashtables were modified 
to conform to the Collection Framework. 


Advantages of the Collection Framework: Since the lack of a collection framework gave rise to the above set of disadvantages, 
the following are the advantages of the collection framework. 


(1)	Consistent API: The API has a basic set of interfaces like Collection, Set, List, or Map, all the classes 
	(ArrayList, LinkedList, Vector, etc) that implement these interfaces have some common set of methods.
	 
(2)	Reduces programming effort: A programmer doesn’t have to worry about the design of the Collection but rather he can 
	focus on its best use in his program. Therefore, the basic concept of Object-oriented programming (i.e.) abstraction 
	has been successfully implemented.
	 
(3)	Increases program speed and quality: Increases performance by providing high-performance implementations of useful 
	data structures and algorithms because in this case, the programmer need not think of the best implementation of a 
	specific data structure. He can simply use the best implementation to drastically boost the performance of his 
	algorithm/program.




---->Hierarchy of the Collection Framework:-

The utility package, (java.util) contains all the classes and interfaces that are required by the collection framework. 
The collection framework contains an interface named an iterable interface which provides the iterator to iterate through 
all the collections. This interface is extended by the main collection interface which acts as a root for the collection 
framework. All the collections extend this collection interface thereby extending the properties of the iterator and the 
methods of this interface. The following figure illustrates the hierarchy of the collection framework. 




														Iterable

														Collection


					(A)List 					()									
