Hashing Data Structure:-

Hashing is technique or process of Mapping keys and values into a Hashtable by using a Hash Function. It is done for faster
access to elements. 

Let a hash function H(x) maps the value x at the index x%10 in an Array. For example if the list of values is 
[11,12,13,14,15] it will be stored at positions {1,2,3,4,5} in the array or Hash table respectively.

Why Hashing?:-

	In the Trees chapter we saw that balanced binary search trees support operations such as insert,
	delete and search in O(logn) time. In applications, if we need these operations in O(1), then
	hashing provides a way. Remember that worst case complexity of hashing is still O(n), but it
	gives O(1) on the average.


Components of Hashing:-

	Hashing has four key components:
	(1) Hash Table
	(2) Hash Functions
	(3) Collisions
	(4) Collision Resolution Techniques



Basic:-

	Suppose we want to design a system for storing employee records keyed using phone numbers. And we want following 
	queries to be performed efficiently: 
 

	1.Insert a phone number and corresponding information.
	2.Search a phone number and fetch the information.
	3.Delete a phone number and related information.

	We can think of using the following data structures to maintain information about different phone numbers. 
 
	(1) Array of phone numbers and records.
	(2) Linked List of phone numbers and records.
	(3) Balanced binary search tree with phone numbers as keys.
	(4) Direct Access Table.

	For arrays and linked lists, we need to search in a linear fashion, which can be costly in practice. 
	If we use arrays and keep the data sorted, then a phone number can be searched in O(Logn) time using Binary Search, 
	but insert and delete operations become costly as we have to maintain sorted order. 

	With balanced binary search tree, we get moderate search, insert and delete times. All of these operations can 
	be guaranteed to be in O(LogN) time.

	Another solution that one can think of is to use a direct access table where we make a big array and use phone numbers 
	as index in the array. An entry in array is NIL if phone number is not present, else the array entry stores pointer to 
	records corresponding to phone number. Time complexity wise this solution is the best among all, we can do all operations 
	in O(1) time. For example to insert a phone number, we create a record with details of given phone number, use phone number 
	as index and store the pointer to the created record in table.

	This solution has many practical limitations; First problem with this solution is extra space required is huge. 
	For example if phone number is n digits, we need O(m * 10n) space for table where m is size of a pointer to record. 
	Another problem is an integer in a programming language may not store n digits.  

	Due to above limitations Direct Access Table cannot always be used. Hashing is the solution that can be used in almost 
	all such situations and performs extremely well compared to above data structures like Array, Linked List, Balanced BST 
	in practice. With hashing we get O(1) search time on average (under reasonable assumptions) and O(n) in worst case.

	"Hashing is an improvement over Direct Access Table. The idea is to use hash function that converts a given phone"         
	 "number or any other key to a smaller number and uses the small number as index in a table called hash table." 

Hash Function:- 

	A function that converts a given big phone number to a small practical integer value. The mapped integer value is used 
	as an index in hash table. In simple terms, a hash function maps a big number or string to a small integer that can be 
	used as index in hash table. 

	A good hash function should have following properties 
	(1) Efficiently computable. 
	(2) Should uniformly distribute the keys (Each table position equally likely for each key)

	For example for phone numbers a bad hash function is to take first three digits. A better function is consider last 
	three digits. Please note that this may not be the best hash function. There may be better ways. 

	Characteristics of Good Hash Functions:-
		A good hash function should have the following characteristics:
		• Minimize collision
		• Be easy and quick to compute
		• Distribute key values evenly in the hash table
		• Use all the information provided in the key
		• Have a high load factor for a given set of keys

Hash Table:- 
	An array that stores pointers to records corresponding to a given phone number. An entry in hash table is NIL if no 
	existing phone number has hash function value equal to the index for the entry. 

	Hash table or hash map is a data structure that stores the keys and their associated values, and hash table uses 
	a hash function to map keys totheir associated values. 
	The general convention is that we use a hash table when the number of
	keys actually stored is small relative to the number of possible keys.

Collisions:-

	Hash functions are used to map each key to a different address space, but practically it is not
	possible to create such a hash function and the problem is called collision. Collision is the
	condition where two records are stored in the same location.


Collision Handling:- 

	Since a hash function gets us a small number for a big key, there is possibility that two keys result in same value. 
	The situation where a newly inserted key maps to an already occupied slot in hash table is called collision and must 
	be handled using some collision handling technique. Following are the ways to handle collisions:

(1)Chaining:-
		The idea is to make each cell of hash table point to a linked list of records that have same hash function 
		value. Chaining is simple, but requires additional memory outside the table.

		Let us consider a simple hash function as "key mod 7"-->key%7 and sequence of keys as 50, 700, 76, 85, 92, 73, 101.


		Initially empty			filling 50 				filling _700_			filling 85

		0 ___					0 ___					0 _700_					0 _700_
		1 ___					1 _50_					1 _50_					1 _50_ ---> _85_
		2 ___					2 ___					2 ___					2 ____
		3 ___					3 ___					3 ___					3 ____
		4 ___					4 ___					4 ___					4 ____
		5 ___					5 ___					5 ___					5 ____
		
																			Chaining 50 and 85 because it is on same index

Advantages: 
(1) Simple to implement. 
(2) Hash table never fills up, we can always add more elements to the chain. 
(3) Less sensitive to the hash function or load factors. 
(4) It is mostly used when it is unknown how many and how frequently keys may be inserted or deleted. 

Disadvantages: 
(1) Cache performance of chaining is not good as keys are stored using a linked list. Open addressing provides 
	better cache performance as everything is stored in the same table. 
(2) Wastage of Space (Some Parts of hash table are never used) 
(3) If the chain becomes long, then search time can become O(n) in the worst case. 
(4) Uses extra space for links. 

Performance of Chaining: 
	Performance of hashing can be evaluated under the assumption that each key is equally likely to be hashed to any 
	slot of table (simple uniform hashing).  

 m = Number of slots in hash table
 n = Number of keys to be inserted in hash table
 
 Load factor α = n/m 
  
 Expected time to search = O(1 + α)
 
 Expected time to delete = O(1 + α)

Time to insert = O(1)

 Time complexity of search insert and delete is 
 O(1) if  α is O(1)																	



(2)Open Addressing:- 
		In open addressing, all elements are stored in the hash table itself. Each table entry contains either a record or 
		NIL.When searching for an element, we examine the table slots one by one until the desired element is found or 
		it is clear that the element is not in the table. This approach is also known as "closed hashing"


Insert(k): Keep probing until an empty slot is found. Once an empty slot is found, insert k. 

Search(k): Keep probing until slot’s key doesn’t become equal to k or an empty slot is reached. 

Delete(k): Delete operation is interesting. If we simply delete a key, then the search may fail. 
		   So slots of deleted keys are marked specially as “deleted”. 

The insert can insert an item in a deleted slot, but the search doesn’t stop at a deleted slot. 

Open Addressing is done in the following ways: 

(a) Linear Probing: In linear probing, the hash table is searched sequentially that starts from the original location of the hash. If in case the location that we get is already occupied, then we check for the next location. The function used for rehashing is as follows: rehash(key) = (n+1)%table-size. For example, the typical gap between two probes is 1 as seen in the example below. 
Let hash(x) be the slot index computed using a hash function and S be the table size 

			If slot hash(x) % S is full, then we try (hash(x) + 1) % S
			If (hash(x) + 1) % S is also full, then we try (hash(x) + 2) % S
			If (hash(x) + 2) % S is also full, then we try (hash(x) + 3) % S 
			..................................................
			..................................................


Challenges in Linear Probing :

Primary Clustering: One of the problems with linear probing is Primary clustering, many consecutive elements form 
groups and it starts taking time to find a free slot or to search for an element.  
Secondary Clustering: Secondary clustering is less severe, two records only have the same collision chain 
(Probe Sequence) if their initial position is the same.

(b) Quadratic Probing If you observe carefully, then you will understand that the interval between probes will 
	increase proportionally to the hash value. Quadratic probing is a method with the help of which we can solve the 
	problem of clustering that was discussed above.  This method is also known as mid-square method. 
	In this method we look for i2‘th slot in i’th iteration.  We always start from the original hash location. 
	If only the location is occupied then we check the other slots.

			let hash(x) be the slot index computed using hash function.  
			If slot hash(x) % S is full, then we try (hash(x) + 1*1) % S
			If (hash(x) + 1*1) % S is also full, then we try (hash(x) + 2*2) % S
			If (hash(x) + 2*2) % S is also full, then we try (hash(x) + 3*3) % S
			..................................................
			..................................................










S.No.				Separate Chaining												Open Addressing
1.	Chaining is Simpler to implement.									Open Addressing requires more computation.

2.	In chaining, Hash table never fills up, we can always 				In open addressing, table may become full.	
	add more elements to chain.			

3.	Chaining is Less sensitive to the hash function or load factors.	Open addressing requires extra care to avoid 
																		clustering and load factor.

4.	Chaining is mostly used when it is unknown how many and how 		Open addressing is used when the frequency and 																
	frequently keys may be inserted or deleted.							number of keys is known.

5.	Cache performance of chaining is not good as keys are stored		Open addressing provides better cache performance
 	using linked list.													as everything is stored in the same table. 	

6.	Wastage of Space (Some Parts of hash table 							In Open addressing, a slot can be 
	in chaining are never used).										used even if an input doesn’t map to it.	

7.	Chaining uses extra space for links.								No links in Open addressing
 

Load Factor:-

	The load factor of a non-empty hash table is the number of items stored in the table divided by the
	size of the table. This is the decision parameter used when we want to rehash or expand the
	existing hash table entries. This also helps us in determining the efficiency of the hashing function.
	That means, it tells whether the hash function is distributing the keys uniformly or not. 


Hashing Techniques:-

There are two types of hashing techniques: static hashing and dynamic hashing
	(1) Static Hashing:-
		If the data is fixed then static hashing is useful. In static hashing, the set of keys is kept fixed and
		given in advance, and the number of primary pages in the directory are kept fixed.
	(2) Dynamic Hashing:-
		If the data is not fixed, static hashing can give bad performance, in which case dynamic hashing is
		the alternative, in which case the set of keys can change dynamically.	

Problems for which Hash Tables are not suitable:-

	• Problems for which data ordering is required
	• Problems having multidimensional data
	• Prefix searching, especially if the keys are long and of variable-lengths
	• Problems that have dynamic data
	• Problems in which the data does not have unique keys.	






HashMap:-

	HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is found in java.util package. 
	It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, 
	and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to 
	another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.











											-------------HashMap---------------

HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is found in java.util package. 
It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, 
and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another 
object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.

HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there 
should be only one null key object and there can be any number of null values.  This class makes no guarantees as to 
the order of the map. To use this class and its methods, you need to import java.util.HashMap package or its superclass;

Code:-

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

Output:-

{Sooraj Patel=58, Rajan Singh=40, Aman Sonkar=8, Deepak Kumar=21}
Size of Map=4
true
Roll Number for Name"Aman Sonkar"is: 8
Roll Number for Name"Sooraj Patel"is: 58
Roll Number for Name"Rajan Singh"is: 40





----->Constructors in HashMap is as follows:

HashMap provides 4 constructors and the access modifier of each is public which are listed as follows:

HashMap()
HashMap(int initialCapacity)
HashMap(int initialCapacity, float loadFactor)
HashMap(Map map)
Now discussing above constructors one by one alongside implementing the same with help of clean java programs.

-->Constructor 1: HashMap()

It is the default constructor which creates an instance of HashMap with an initial capacity of 16 and load factor of 0.75.

Syntax:

HashMap<K, V> hm = new HashMap<K, V>();

Code:-

// Java program to Demonstrate the HashMap() constructor

// Importing basic required classes
import java.io.*;
import java.util.*;

// Main class
// To add elements to HashMap
class solution {

	// Main driver method
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>();

		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		// Adding elements using put method Custom input elements
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");

		// Print and display mapping of HashMap 1
		System.out.println("Mappings of HashMap hm1 are : "+ hm1);

		// Print and display mapping of HashMap 2
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}

Output:-
Mappings of HashMap hm1 are : {1=one, 2=two, 3=three}
Mapping of HashMap hm2 are : {4=four, 5=five, 6=six}



-->Constructor 2: HashMap(int initialCapacity)

It creates a HashMap instance with a specified initial capacity and load factor of 0.75.

Syntax:

HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity);

Code:-

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

Output
First Map: {1=One, 2=Two, 3=Three}
Second Map: {4=Four, 5=Five, 6=Six}


-->Constructor 3: HashMap(int initialCapacity, float loadFactor)

It creates a HashMap instance with a specified initial capacity and specified load factor.

Syntax:

HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity, int  loadFactor);

Code:-

// Java program to Demonstrate
// HashMap(int initialCapacity,float loadFactor) Constructor

// Importing basic classes
import java.io.*;
import java.util.*;

// Main class
// To add elements to HashMap
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		// No need to mention the generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>(5, 0.75f);

		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(3, 0.5f);

		// Add Elements using put() method
		// Custom input elements
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");

		// Print and display elements in object of hashMap 1
		System.out.println("Mappings of HashMap hm1 are : " + hm1);

		// Print and display elements in object of hashMap 2
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
	}
}

Output:-
Mappings of HashMap hm1 are : {1=one, 2=two, 3=three}
Mapping of HashMap hm2 are : {4=four, 5=five, 6=six}





--> 4. HashMap(Map map): It creates an instance of HashMap with the same mappings as the specified map.

HashMap<K, V> hm = new HashMap<K, V>(Map map);

Code:-
// Java program to demonstrate the
// HashMap(Map map) Constructor

import java.io.*;
import java.util.*;

class AddElementsToHashMap {
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Map<Integer, String> hm1 = new HashMap<>();

		// Add Elements using put method
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		// Initialization of a HashMap
		// using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);

		System.out.println("Mappings of HashMap hm1 are : "+ hm1);
		
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}

Output:-
Mappings of HashMap hm1 are : {1=one, 2=two, 3=three}
Mapping of HashMap hm2 are : {1=one, 2=two, 3=three}







							---------Performing Various Operations on HashMap--------


1. Adding Elements: 
	In order to add an element to the map, we can use the put() method. However, the insertion order 
	is not retained in the Hashmap. Internally, for every element, a separate hash is generated and the elements are 
	indexed based on this hash to make it more efficient.

Code:-

// Java program to add elements
// to the HashMap

import java.io.*;
import java.util.*;

class AddElementsToHashMap {
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>();

		// Initialization of a HashMap
		// using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		// Add Elements using put method
		hm1.put(1, "Pradeep");
		hm1.put(2, "Kumar");
		hm1.put(3, "Prajapati");

		hm2.put(1, "Deepak");
		hm2.put(2, "Kumar");
		hm2.put(3, "Prajapati");

		System.out.println("Mappings of HashMap hm1 are : "+ hm1);
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}

Output
Mappings of HashMap hm1 are : {1=Pradeep, 2=Kumar, 3=Prajapati}
Mapping of HashMap hm2 are : {1=Deepak, 2=Kumar, 3=Prajapati}




2. Changing Elements:- 
	After adding the elements if we wish to change the element, it can be done by again adding the element with the put() 
	method. Since the elements in the map are indexed using the keys, the value of the key can be changed by simply 
	inserting the updated value for the key for which we wish to change.

Code:-
// Java program to change
// elements of HashMap

import java.io.*;
import java.util.*;
class ChangeElementsOfHashMap {
	public static void main(String args[])
	{

		// Initialization of a HashMap
		HashMap<Integer, String> hm
			= new HashMap<Integer, String>();

		// Change Value using put method
		hm.put(1, "Pradeep");
		hm.put(2, "Deepak");
		hm.put(3, "Prajapati");

		System.out.println("Initial Map " + hm);

		hm.put(2, "Kumar");

		System.out.println("Updated Map " + hm);
	}
}

Output
Initial Map {1=Pradeep, 2=Deepak, 3=Prajapati}
Updated Map {1=Pradeep, 2=Kumar, 3=Prajapati}



3. Removing Element:- 
	In order to remove an element from the Map, we can use the remove() method. This method takes 
	the key value and removes the mapping for a key from this map if it is present in the map.

Code:-
import java.util.*;
public class MapRemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Deepak");
		map.put(2, "Kumar");
		map.put(3, "Prajapati");
		
		System.out.println("Initial map: "+map);
		
		map.remove(3);
		System.out.println("Updated map: "+map);

		map.remove(2, "Kumar");
		System.out.println("Updated map: "+map);

		map.remove(1,"Kumar");// 1st element will not remove because it is not right value
		System.out.println("Updated map: "+map);

		map.remove(1,"Deepak");
		System.out.println("Updated map: "+map);

	}
}

Output:-
Initial map: {1=Deepak, 2=Kumar, 3=Prajapati}
Updated map: {1=Deepak, 2=Kumar}
Updated map: {1=Deepak}
Updated map: {1=Deepak}
Updated map: {}



4. Traversal of HashMap:-

	We can use the Iterator interface to traverse over any structure of the Collection Framework;
 	Since Iterators work with one type of data we use Entry< ? , ? > to resolve the two separate types into a compatible 
 	format. Then using the next() method we print the entries of HashMap.


Code:-

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Deepak");
		map.put(2, "Kumar");
		map.put(3, "Prajapati");
		
		// Iterate the map using for-each loop
		
		for(Entry<Integer, String> e:map.entrySet())
		{
			System.out.println("Key: "+e.getKey()+" ,Value: "+e.getValue());
		}
		
		for(Map.Entry<Integer, String> e:map.entrySet())
		{
			System.out.println("Key: "+e.getKey()+" ,Value: "+e.getValue());
		}

	}

}

Output:-
Key: 1 ,Value: Deepak
Key: 2 ,Value: Kumar
Key: 3 ,Value: Prajapati
Key: 1 ,Value: Deepak
Key: 2 ,Value: Kumar
Key: 3 ,Value: Prajapati




									------Important Features of HashMap---------


To access a value one must know its key. HashMap is known as HashMap because it uses a technique called Hashing. 
Hashing is a technique of converting a large String to small String that represents the same String. 
A shorter value helps in indexing and faster searches. HashSet also uses HashMap internally.

Few important features of HashMap are: 

(1)	HashMap is a part of java.util package.
(2)	HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
(3)	It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value 
	respectively.
(4)	HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more 
	than 1 value but more than 1 key can contain a single value.
(5)	HashMap allows null key also but only once and multiple null values.
(6)	This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order 
	will remain constant over time. It is roughly similar to HashTable but is unsynchronized.


Internally HashMap contains an array of Node and a node is represented as a class that contains 4 fields: 

(1)	int hash
(2)	K key
(3)	V value
(4)	Node next
It can be seen that the node is containing a reference to its own object. So it’s a linked list. 	

Node: 
 
Node<k,v>

int hash
k key
v value
Node<k,v>next




										--------Performance of HashMap----------

Performance of HashMap depends on 2 parameters which are named as follows:

Initial Capacity
Load Factor
1. Initial Capacity – It is the capacity of HashMap at the time of its creation (It is the number of buckets a HashMap 
	can hold when the HashMap is instantiated). In java, it is 2^4=16 initially, meaning it can hold 16 key-value pairs.

2. Load Factor – It is the percent value of the capacity after which the capacity of Hashmap is to be increased 
	(It is the percentage fill of buckets after which Rehashing takes place). In java, it is 0.75f by default, 
	meaning the rehashing takes place after filling 75% of the capacity.

3. Threshold – It is the product of Load Factor and Initial Capacity. In java, by default, it is (16 * 0.75 = 12). 
	That is, Rehashing takes place after inserting 12 key-value pairs into the HashMap.

4. Rehashing – It is the process of doubling the capacity of the HashMap after it reaches its Threshold. In java, 
	HashMap continues to rehash(by default) in the following sequence – 2^4, 2^5, 2^6, 2^7, …. so on. 
 

If the initial capacity is kept higher then rehashing will never be done. But by keeping it higher increases the 
time complexity of iteration. So it should be chosen very cleverly to increase performance. The expected number of 
values should be taken into account to set the initial capacity. The most generally preferred load factor value is 
0.75 which provides a good deal between time and space costs. The load factor’s value varies between 0 and 1. 


Note: 
	From Java 8 onward, Java has started using Self Balancing BST instead of a linked list for chaining. 
	The advantage of self-balancing bst is, we get the worst case (when every key maps to the same slot) search 
	time is O(Log n). 

Synchronized HashMap:-

	As it is told that HashMap is unsynchronized i.e. multiple threads can access it simultaneously. 
	If multiple threads access this class simultaneously and at least one thread manipulates it structurally then it is 
	necessary to make it synchronized externally. It is done by synchronizing some object which encapsulates the map. 
	If No such object exists then it can be wrapped around Collections.synchronizedMap() to make HashMap synchronized 
	and avoid accidental unsynchronized access. As in the following example: 

	Map m = Collections.synchronizedMap(new HashMap(...));

	Now the Map m is synchronized.  Iterators of this class are fail-fast if any structure modification is done after 
	the creation of iterator, in any way except through the iterator’s remove method. In a failure of iterator, 
	it will throw ConcurrentModificationException.
 
	Time complexity of HashMap: HashMap provides constant time complexity for basic operations, get and put if the 
	hash function is properly written and it disperses the elements properly among the buckets. Iteration over HashMap 
	depends on the capacity of HashMap and a number of key-value pairs. Basically, it is directly proportional to the 
	capacity + size. Capacity is the number of buckets in HashMap. So it is not a good idea to keep a high number of 
	buckets in HashMap initially.

	"Time complexity is proportional to (capacity + size) and capacity is number of buckets which should be minimum"
 
	Applications of HashMap: HashMap is mainly the implementation of hashing. It is useful when we need efficient 
	implementation of search, insert and delete operations. Please refer to the applications of hashing for details.

	Methods in HashMap:-

	K – The type of the keys in the map.
	V – The type of values mapped in the map.





Methods															DESCRIPTION

clear()														Removes all of the mappings from this map.
clone()														Returns a shallow copy of this HashMap instance: 
															the keys and values themselves are not cloned.

compute(K key, BiFunction<? super K, ? super V,?			Attempts to compute a mapping for the specified key and 
			extends V> remappingFunction)					its current mapped value 
															(or null if there is no current mapping).
 
		
computeIfAbsent(K key, Function<? super K,					If the specified key is not already associated with a value 
		? extends V> mappingFunction)						(or is mapped to null), attempts to compute its value using 
															the given mapping function and enters it into this map unless 
															null. 
		
computeIfPresent(K key, BiFunction<? super K, 				If the value for the specified key is present and non-null, 
		? super V,? extends V> remappingFunction)			attempts to compute a new mapping given the key and its 
															current mapped value.
		 
containsKey(Object key)										Returns true if this map contains a mapping for the 
															specified key.

containsValue(Object value)									Returns true if this map maps one or more keys to the 
															specified value.

entrySet()													Returns a Set view of the mappings contained in this map.

get(Object key)												Returns the value to which the specified key is mapped, or 
															null if this map contains no mapping for the key.

isEmpty()													Returns true if this map contains no key-value mappings.

keySet()													Returns a Set view of the keys contained in this map.

merge(K key, V value, BiFunction<? super V, ? 				If the specified key is not already associated with a value 
	super V,? extends V> remappingFunction)					or is associated with null, associates it with the given 
															non-null value.	
						
put(K key, V value)											Associates the specified value with the specified key in 
															this map.

putAll(Map<? extends K,? extends V> m)						Copies all of the mappings from the specified map to this map.

remove(Object key)											Removes the mapping for the specified key from this map if 
															present.

size()														Returns the number of key-value mappings in this map.

values()													Returns a Collection view of the values contained in this map.	





 Methods inherited from class java.util.AbstractMap

Methods							DESCRIPTION

equals()			Compares the specified object with this map for equality.
hashCode()			Returns the hash code value for this map.
toString()			Returns a string representation of this map.



						-------Methods inherited from interface java.util.Map---------

Methods														DESCRIPTION

equals()										Compares the specified object with this map for equality.

forEach(BiConsumer<? super K,					Performs the given action for each entry in this map until all entries 
	? super V> action)							have been processed or the action throws an exception.

getOrDefault(Object key, V defaultValue)		Returns the value to which the specified key is mapped, or defaultValue 
												if this map contains no mapping for the key.

hashCode()										Returns the hash code value for this map.	

putIfAbsent(K key, V value)						If the specified key is not already associated with a value 
												(or is mapped to null) associates it with the given value and returns null, 
												else returns the current value.

remove(Object key, Object value)				Removes the entry for the specified key only if it is currently mapped 
												to the specified value.					

replace(K key, V value)							Replaces the entry for the specified key only if it is currently mapped 
												to some value.																														
											 
replace(K key, V oldValue, V newValue)			Replaces the entry for the specified key only if currently mapped to the 
												specified value.		

replaceAll(BiFunction<? super K,				Replaces each entry’s value with the result of invoking the given function 
	? super V,? extends V> function)			on that entry until all entries have been processed or the function throws 
												an exception.												
			



Code for clear and clone mathods:-

Code:-
import java.util.HashMap;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1=new HashMap<>();
		HashMap<Integer,String> map2=new HashMap<>();
		
		map1.put(1,"I");
		map1.put(2,"am");
		map1.put(3,"Deepak");
		map1.put(4,"Kumar");
		
		map2.put(1,"I");
		map2.put(2,"am");
		map2.put(3,"Pradeep");
		map2.put(4,"Kumar");
		
		System.out.println("Map1: "+map1);
		System.out.println("Map2: "+map2);
		
		// to clear all mapping
		
		map2.clear();
		System.out.println("The map2 after clear(): "+map2);
		
		// to print clone map
		Object map3=new HashMap<>();
		map3=map1.clone();
		System.out.println("The cloned map3 of map1: "+map3);
		System.out.println("The cloned map of map1: "+map1.clone());
	}
}

Output:-
Map1: {1=I, 2=am, 3=Deepak, 4=Kumar}
Map2: {1=I, 2=am, 3=Pradeep, 4=Kumar}
The map2 after clear(): {}
The cloned map3 of map1: {1=I, 2=am, 3=Deepak, 4=Kumar}
The cloned map of map1: {1=I, 2=am, 3=Deepak, 4=Kumar}




Compute Methods:-
	The compute(Key, BiFunction) method of HashMap class allows you to update a value in HashMap. 
	The compute() method tries to compute a mapping for the specified key and its current mapped value 
	(or null if there is no current mapping is found). This method is used to automatically update a value for 
	given key in HashMap.


Code:-

// Compute Methods to update our map
		
		HashMap<String,String> map4=new HashMap<>();
		map4.put("Name","Deepak");
		map4.put("Sallary", "50000");
		System.out.println("Map4: "+map4);
		// remap the values using compute() method
		
		map4.compute("Name", (key,val)->val.concat(" Kumar") );
		map4.compute("Sallary",(key,val)->val.concat(" Thousands"));
		System.out.println("Map4 after compute methods-1: "+map4);
		
		map4.compute("Name",(key,val)->val.replace("Deepak Kumar", "Pradeep Kumar"));
		System.out.println("Map4 after compute methods-2: "+map4);
		
		map4.compute("Sallary",(key,val)->key.replace("Sallary", "75000 Thousands"));
		System.out.println("Map4 after compute methods-3: "+map4);
		
		map4.compute("Name",(key,val)->key.replace("Name", "Priyansh"));
		System.out.println("Map4 after compute methods-4: "+map4);
	
Output:-
Map4: {Sallary=50000, Name=Deepak}
Map4 after compute methods-1: {Sallary=50000 Thousands, Name=Deepak Kumar}
Map4 after compute methods-2: {Sallary=50000 Thousands, Name=Pradeep Kumar}
Map4 after compute methods-3: {Sallary=75000 Thousands, Name=Pradeep Kumar}
Map4 after compute methods-4: {Sallary=75000 Thousands, Name=Priyansh}


Code-2:-

// Java program to demonstrate
// compute(Key, BiFunction) method.

import java.util.*;

public class Solution {

	// Main method
	public static void main(String[] args)
	{

		// Create a Map and add some values
		Map<String, Integer> map = new HashMap<>();
		map.put("Key1", 12);
		map.put("Key2", 15);

		// print map details
		System.out.println("Map: " + map);

		// remap the values
		// using compute method
		map.compute("Key1", (key, val)-> (val == null)? 1: val + 1);

		map.compute("Key2", (key, val)-> (val == null)? 1: val + 5);

		// print new mapping
		System.out.println("New Map: " + map);
	}
}

Output:-
	Map: {Key2=15, Key1=12}
	New Map: {Key2=20, Key1=13}




Code-3:-

// Java program to demonstrate Exception thrown by
// compute(Key, BiFunction) method.

import java.util.*;

public class GFG {

	// Main method
	public static void main(String[] args)
	{

		// create a Map and add some values
		Map<String, Integer> map = new HashMap<>();
		map.put("Key1", 12);
		map.put("Key2", 15);

		// print map details
		System.out.println("Map: " + map);

		try {

			// remap the values using compute() method
			// passing null value will throw exception
			map.compute(null, (key, value)-> value + 3);
			System.out.println("New Map: " + map);
		}
		catch (NullPointerException e) {

			System.out.println("Exception: " + e);
		}
	}
}

Output:-
	Map: {Key2=15, Key1=12}
	Exception: java.lang.NullPointerException





HashMap computeIfAbsent() method:-

The computeIfAbsent(Key, Function) method of HashMap class is used to compute value for a given key using the 
given mapping function, if key is not already associated with a value (or is mapped to null) and enter that computed 
value in Hashmap else null.

Code:-

HashMap<String,Integer> map5=new HashMap<>();
		map5.put("key-1", 25000);
		map5.put("key-2", 35000);
		map5.put("key-3", 45000);
		map5.put("key-4", 55000);
		
		System.out.println("map5:\n "+map5);
		
		map5.computeIfAbsent("key-5", k-> 65000);
		map5.computeIfAbsent("key-6",k->65000+10000);
		System.out.println("new map5:\n "+map5);


Output:-
map5:
 {key-1=25000, key-4=55000, key-3=45000, key-2=35000}
new map5:
 {key-1=25000, key-5=65000, key-4=55000, key-3=45000, key-2=35000, key-6=75000}





HashMap computeIfPresent(key, BiFunction) method:-

The computeIfPresent(Key, BiFunction) method of HashMap class which allows you to compute value of a mapping for 
specified key if key is already associated with a value (or is mapped to null).

Code:-

HashMap<Integer,String> map6=new HashMap<>();
		map6.put(1, "Deepak");
		map6.put(2, "Kumar");
		map6.put(3, "Prajapati");
		
		System.out.println("map6:\n "+map6);
		
		map6.computeIfPresent(1 ,(key,val)->val+100);
		map6.computeIfPresent(2 ,(key,val)->val.replace("Kumar", "Singh"));
		map6.computeIfPresent(3 ,(key,val)->val.replace("Prajapati", "Radh"));
		map6.computeIfPresent(3 ,(key,val)->val+"aur");
		
		System.out.println("New map6:\n "+map6);


Output:-

map6:
 {1=Deepak, 2=Kumar, 3=Prajapati}
New map6:
 {1=Deepak100, 2=Singh, 3=Radhaur}




HashMap containsKey() Method:-

The java.util.HashMap.containsKey() method is used to check whether a particular key is being mapped into the 
HashMap or not. It takes the key element as a parameter and returns True if that element is mapped in the map.

Code:-

HashMap<Integer,String> map7=new HashMap<>();
		
		map7.put(10, "Deepak");
		map7.put(20, "Kumar");
		map7.put(30, "Prajapati");
		
		System.out.println("Is key 20 present :"+map7.containsKey(20));
		
		System.out.println("Is key 80 present :"+map7.containsKey(80));


Output:-
Is key 20 present :true
Is key 80 present :false		





HashMap containsValue() Method:

The java.util.HashMap.containsValue() method is used to check whether a particular value is being mapped by a single 
or more than one key in the HashMap. It takes the Value as a parameter and returns True if that value is mapped by any 
of the key in the map.

Syntax:

Hash_Map.containsValue(Object Value):-

Code:- TC : O(N)

	HashMap<Integer,String> map8=new HashMap<>();
		
		map8.put(10, "Pradeep");
		map8.put(20, "Kumar");
		map8.put(30, "Prajapati");
		System.out.println("map8:\n"+map8);
		System.out.println("Is value Deepak present : "+map8.containsValue("Deepak"));
		System.out.println("Is value Kumar present : "+map8.containsValue("Kumar"));


Output:-
map8:
{20=Kumar, 10=Pradeep, 30=Prajapati}
Is value Deepak present : false
Is value Kumar present : true		



HashMap entrySet() Method in Java:-


The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained 
in the hash map. It basically returns a set view of the hash map or we can create a new set and store the map 
elements into them.

Syntax:

hash_map.entrySet()

Code:-

HashMap<Integer,String> map9=new HashMap<>();
		
		map9.put(10, "Welcome");
		map9.put(20, "Dear");
		map9.put(30, "Pradeep");
		System.out.println("map9:\n"+map9);
		
		System.out.println("The set is:\n"+map9.entrySet());


Output:-

map9:
{20=Dear, 10=Welcome, 30=Pradeep}
The set is:
[20=Dear, 10=Welcome, 30=Pradeep]



HashMap get() Method:-
The java.util.HashMap.get() method of HashMap class is used to retrieve or fetch the value mapped by a 
particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.	

Syntax:

Hash_Map.get(Object key_element)

Code:-

// Java code to illustrate the get() method
import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Getting the value of 25
		System.out.println("The Value is: " + hash_map.get(25));

		// Getting the value of 10
		System.out.println("The Value is: " + hash_map.get(10));
	}
}


Output:-

Initial Mappings are: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}
The Value is: Welcomes
The Value is: Geeks




HashMap isEmpty() Method in Java:-

The java.util.HashMap.isEmpty() method of HashMap class is used to check for the emptiness of the map. 
The method returns True if no key-value pair or mapping is present in the map else False.

Syntax:

Hash_Map.isEmpty()	

Code:-

// Java code to illustrate the isEmpty() method
import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

		// Mapping int values to string keys
		hash_map.put("Geeks", 10);
		hash_map.put("4", 15);
		hash_map.put("Geeks", 20);
		hash_map.put("Welcomes", 25);
		hash_map.put("You", 30);

		// Displaying the HashMap
		System.out.println("The Mappings are: " + hash_map);

		// Checking for the emptiness of Map
		System.out.println("Is the map empty? " + hash_map.isEmpty());
	}
}

Output:-
The Mappings are: {4=15, Geeks=20, You=30, Welcomes=25}
Is the map empty? false


HashMap keySet() Method in Java:-

The java.util.HashMap.keySet() method in Java is used to create a set out of the key elements contained in the hash map. 
It basically returns a set view of the keys or we can create a new set and store the key elements in them.

Syntax:

hash_map.keySet()

Code:-

		HashMap<Integer,String> map10=new HashMap<>();
		
		map10.put(10, "Welcome");
		map10.put(20, "Dear");
		map10.put(30, "Pradeep");
		System.out.println("map10:\n"+map10);
		
		System.out.println("The KeySet is:\n"+map10.keySet());

Output:-

map10:
{20=Dear, 10=Welcome, 30=Pradeep}
The KeySet is:
[20, 10, 30]



HashMap merge(key, value, BiFunction) method in Java:-

The merge(Key, Value, BiFunctional) method of HashMap class is used to combine multiple mapped values for a key using 
the given mapping function. Bucket is actually an index of array, that array is called table in HashMap implementation. 
So table[0] is referred to as bucket0, table[1] as bucket1 and so on.

If the key is not present or is associated with null, it simply outputs the key along with the corresponding value in 
the Hashmap as a new entry.
However, if the key already holds some value that Remapping Function merges both the old and new values with the given 
key
In case key is null, it is always mapped to bucket 0, as hash is not calculated for null keys due to NullPointerException

Syntax:

public V merge(K key, V value,BiFunction remappingFunction)]

Parameters:This method accepts three parameters:

Key: which is the key for which we have a particular value. If two keys have the same value they are merged.
Value: which is the index corresponding to the particular key which is stored in the bucket.
BiFunction: which is the function having two arguments to be used for calculating the new mapping from the old value 
			and given value.		

Return Value: This method returns the key along with its value if the key is not present or is associated with null. 
	ELse if the key already holds any value, it merges the old value with the new value using the mapping technique.


Code:-

		HashMap<Integer,String> map11=new HashMap<>();
		HashMap<Integer,String> map12=new HashMap<>();
		
		map11.put(1,"I");
		map11.put(2,"am");
		map11.put(3,"Aditya");
		map11.put(4,"Kumar");
		
		map12.put(1,"My");
		map12.put(2,"Name is");
		map12.put(3,"Adarsh");
		map12.put(4,"Kumar");
		
		System.out.println("Map11: "+map11);
		System.out.println("Map12: "+map12);
		
		System.out.println("Map11 to String: "+map11.toString());
		System.out.println("Map11 to String: "+map12.toString());
		

        // provide value for new key which is absent using computeIfAbsent method
		map12.forEach((key,value)->map11.merge(key, value,(v1,v2)
														->v1.equalsIgnoreCase(v2)?v1:v1+","+v2));
		System.out.println("New HashMap: " + map11);


Output:-
Map11: {1=I, 2=am, 3=Aditya, 4=Kumar}
Map12: {1=My, 2=Name is, 3=Adarsh, 4=Kumar}
Map11 to String: {1=I, 2=am, 3=Aditya, 4=Kumar}
Map11 to String: {1=My, 2=Name is, 3=Adarsh, 4=Kumar}

New HashMap: {1=I,My, 2=am,Name is, 3=Aditya,Adarsh, 4=Kumar}





Code:(2):-

// Java program to demonstrate
// computeIfAbsent(Key, Function) method.

import java.util.*;

public class GFG {

	// Main method
	public static void main(String[] args)
	{

		// create a HashMap and add some values
		HashMap<Integer, String>map1 = new HashMap<>();
		map1.put(1, "Ram");
		map1.put(2, "Rohan");
		map1.put(3, "Shivam");

		HashMap<Integer, String>map2 = new HashMap<>();
		map2.put(1, "Tushar");
		map2.put(10, "Satya");
		map2.put(12, "Sundar");

		// print map details
		System.out.println("HashMap1: "+ map1.toString());

		System.out.println("HashMap2: "+ map2.toString());

		// provide value for new key which is absent
		// using computeIfAbsent method
		map2.forEach( (key, value) -> map1.merge(key,value,(v1, v2)-> v1.equalsIgnoreCase(v2)? v1: v1 + ", " + v2));

		// print new mapping
		System.out.println("New HashMap: " + map1);
	}
}

Output:-
HashMap1: {1=Ram, 2=Rohan, 3=Shivam}
HashMap2: {1=Tushar, 10=Satya, 12=Sundar}
New HashMap: {1=Ram, Tushar, 2=Rohan, 3=Shivam, 10=Satya, 12=Sundar}




HashMap put() Method in Java:-

The java.util.HashMap.put() method of HashMap is used to insert a mapping into a map. This means we can insert a 
specific key and the value it is mapping to into a particular map. If an existing key is passed then the previous 
value gets replaced by the new value. If a new pair is passed, then the pair gets inserted as a whole.

Syntax: 

Hash_Map.put(key, value)

Code:-

// Java code to illustrate the put() method
import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Inserting existing key along with new value
		String returned_value = (String)hash_map.put(20, "All");

		// Verifying the returned value
		System.out.println("Returned value is: " + returned_value);

		// Displaying the new map
		System.out.println("New map is: " + hash_map);
	}
}

Output:-
Initial Mappings are: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}
Returned value is: Geeks
New map is: {20=All, 25=Welcomes, 10=Geeks, 30=You, 15=4}

Code:-
// Java code to illustrate the put() method
import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Inserting existing key along with new value
		String returned_value = (String)hash_map.put(50, "All");

		// Verifying the returned value
		System.out.println("Returned value is: " + returned_value);

		// Displaying the new map
		System.out.println("New map is: " + hash_map);
	}
}


Output:-
Initial Mappings are: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}
Returned value is: null
New map is: {50=All, 20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}

Note: The same operation can be performed with any type of Mappings with variation and combination of different data 
	  types.


HashMap putAll() Method in Java:-

The java.util.HashMap.putAll() is an inbuilt method of HashMap class that is used for the copy operation. 
The method copies all of the elements i.e., the mappings, from one map into another.

Syntax:

new_hash_map.putAll(exist_hash_map)

Code:-

		HashMap<Integer,String> map13=new HashMap<>();
		
		map13.put(10, "Welcome");
		map13.put(20, "Dear");
		map13.put(30, "Pradeep");
		
		System.out.println("Map13: "+map13);
		HashMap<Integer,String> newMap13= new HashMap<>();
		
		newMap13.putAll(map13);
		System.out.println("newMap13: "+newMap13);

Output:-

Map13: {20=Dear, 10=Welcome, 30=Pradeep}
newMap13: {10=Welcome, 20=Dear, 30=Pradeep}



HashMap remove() Method in Java:-

The java.util.HashMap.remove() is an inbuilt method of HashMap class and is used to remove the mapping of any 
particular key from the map. It basically removes the values for any particular key in the Map.

Syntax: 
 
Hash_Map.remove(Object key)		


Code:-
		HashMap<Integer,String> map14=new HashMap<>();
		
		map14.put(10, "Welcome");
		map14.put(20, "Dear");
		map14.put(30, "Deepak");
		System.out.println("Map13: "+map14);
		
		String strr= (String)map14.remove(20);
		System.out.println("String Value : "+strr);
		System.out.println("Updated map14:"+map14);
		map14.remove(10);
		System.out.println("Updated map14:"+map14);


Output:-

Map14: {20=Dear, 10=Welcome, 30=Deepak}
String Value : Dear
Updated map14:{10=Welcome, 30=Deepak}
Updated map14:{30=Deepak}


HashMap values() Method in Java:-


The java.util.HashMap.values() method of HashMap class in Java is used to create a collection out of the values of the
map. It basically returns a Collection view of the values in the HashMap.

Syntax:

Hash_Map.values()

Code:-
// Java code to illustrate the values() method
import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Using values() to get the set view of values
		System.out.println("The collection is: " + hash_map.values());
	}
}


Output:-

Initial Mappings are: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}
The collection is: [Geeks, Welcomes, Geeks, You, 4]




HashMap size() Method in Java:-

The java.util.HashMap.size() method of HashMap class is used to get the size of the map which refers to the number of 
the key-value pair or mappings in the Map.

Syntax:

Hash_Map.size()

Code:-

// Java code to illustrate the size() method
import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Displaying the size of the map
		System.out.println("The size of the map is " + hash_map.size());
	}
}

Output:-
Initial Mappings are: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}
The size of the map is 5





AbstractMap equals() Method in Java:-

The AbstractMap.equals() method in Java is used to check for equality between two maps. It verifies whether the 
elements of one map passed as a parameter is equal to the elements of this map or not.

Syntax:

AbstractMap1.equals(AbstractMap2)


AbstractMap hashCode() Method in Java:-

The AbstractMap.hashCode() method in Java is used to fetch the hash code value of a particular this AbstractMap. 
A map consists of a number of buckets to store the key-value pair. Each bucket has a unique identity and when a 
key-value pair is inserted into a bucket, the key’s hashcode is matched with the identifier of the bucket, and if 
its a match the pair is stored successfully. This is how the hash code works.

Syntax:

AbstractMap.hashCode()

Code:-

		HashMap<Integer,String> map15=new HashMap<>();
		HashMap<Integer,String> map16=new HashMap<>();
		map15.put(10, "Welcome");
		map15.put(20, "Dear");
		map15.put(30, "Deepak");
		
		map16.put(10, "Welcome");
		map16.put(20, "Dear");
		map16.put(30, "Deepak");		
		
		System.out.println("Map15: \n"+map15);
		System.out.println("Map16: \n"+map16);
		
		System.out.println(map15.equals(map16));
		
		System.out.println("Hashcode of map15: "+map15.hashCode());



Output:-

Map15: 
{20=Dear, 10=Welcome, 30=Deepak}
Map16: 
{20=Dear, 10=Welcome, 30=Deepak}
true
Hashcode of map15: 648089078





AbstractMap.SimpleEntry toString() Method in Java:- 

AbstractMap.SimpleEntry<K, V> is used to maintain a key and a value entry. The value can be changed using the 
setValue method. This class facilitates the process of building custom map implementations.

toString() method of AbstractMap.SimpleEntry<K, V> returns a String representation of this SimpleEntry map entry. 
This method returns the string representation of this map entry’s key followed by the equals character (“=”) followed 
by the string representation of this entry’s value.

Syntax:

public String toString()		


Code:-

import java.util.*;
import java.util.AbstractMap.SimpleEntry;
public class MaptoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a ArrayList of Map
        ArrayList<AbstractMap.SimpleEntry<Integer, Integer> >arrayList
        
            = new ArrayList<AbstractMap.SimpleEntry<Integer, Integer> >();
        
        // add values
        arrayList.add(new AbstractMap.SimpleEntry(0, 123));
        arrayList.add(new AbstractMap.SimpleEntry(1, 130));
        arrayList.add(new AbstractMap.SimpleEntry(2, 994));
        
     // print keys
        for (int i = 0; i < arrayList.size(); i++) {
  
            // get map from list
            AbstractMap.SimpleEntry<Integer, Integer>map= arrayList.get(i);
  
            // get representation of map using toString()
            String value = map.toString();
  
            System.out.println(value);
        }

	}

}


Output:-

0=123
1=130
2=994






										----------:HashMap Vs TreeMap:----------


HashMap:-

Qs:- find frequency of element in an Array

Code:-

import java.util.*;
import java.util.Map.Entry;
public class FrequencyOfHashMap {
	
	@SuppressWarnings("rawtypes")
	static void PrintFreq(int arr[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		// Traverse Through Array
		
		for(int i=0;i<arr.length;i++)
		{
			Integer c=map.get(arr[i]);
			 // If this is first occurrence of element 
			if(map.get(arr[i])==null)
				map.put(arr[i], 1);
			// If elements already exists in hash map
			else
				map.put(arr[i],++c);
		}
		 // Print result
		
		for(Entry<Integer, Integer> m:map.entrySet())
		{
			 System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		}
		
		System.out.println();
		
		for(Map.Entry p:map.entrySet())
		{
			 System.out.println("Frequency of " + p.getKey() + " is " + p.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
        PrintFreq(arr);
	}
}

Output:-
Frequency of 34 is 1
Frequency of 3 is 1
Frequency of 5 is 2
Frequency of 10 is 3

Frequency of 34 is 1
Frequency of 3 is 1
Frequency of 5 is 2
Frequency of 10 is 3



	KeyPoints:-

		(1)HashMap does not maintain any order neither based on key nor on basis of value, If we want the keys to be 
			maintained in a sorted order, we need to use TreeMap.

		(2)Complexity: get/put/containsKey() operations are O(1) in average case but we can’t guarantee that since it 
			all depends on how much time does it take to compute the hash.

	Application:
		HashMap is basically an implementation of hashing. So wherever we need hashing with key value pairs, 
		we can use HashMap. For example, in Web Applications username is stored as a key and user data is stored as a 
		value in the HashMap, for faster retrieval of user data corresponding to a username.		





TreeMap:-


Qs:- find frequency of element in an Array

Code:-

/* Java program to print frequencies of all elements using
TreeMap */
import java.util.*;

class Main
{
	// This function prints frequencies of all elements
	static void printFreq(int arr[])
	{
		// Creates an empty TreeMap
		TreeMap<Integer, Integer> tmap =new TreeMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++)
		{
			Integer c = tmap.get(arr[i]);

			// If this is first occurrence of element
			if (tmap.get(arr[i]) == null)
			tmap.put(arr[i], 1);

			// If elements already exists in hash map
			else
			tmap.put(arr[i], ++c);
		}

		// Print result
		for (Map.Entry m:tmap.entrySet())
		System.out.println("Frequency of " + m.getKey() +" is " + m.getValue());
	}

	// Driver method to test above method
	public static void main (String[] args)
	{
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
		printFreq(arr);
	}
}


Output:-

Frequency of 3 is 1
Frequency of 5 is 2
Frequency of 10 is 3
Frequency of 34 is 1

		
Key Points:-

	(1) For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements 
		present in TreeMap.
	(2) TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order. 
		TreeMap also provides some cool methods for first, last, floor and ceiling of keys.



Overview:-

(1) HashMap implements Map interface while TreeMap implements SortedMap interface. A Sorted Map interface is a 
	child of Map.

(2) HashMap implements Hashing, while TreeMap implements Red-Black Tree(a Self Balancing Binary Search Tree). 
	Therefore all differences between Hashing and Balanced Binary Search Tree apply here.

(3) Both HashMap and TreeMap have their counterparts HashSet and TreeSet. HashSet and TreeSet implement Set interface. 
	In HashSet and TreeSet, we have only key, no value, these are mainly used to see presence/absence in a set. 
	For above problem, we can’t use HashSet (or TreeSet) as we can’t store counts. An example problem where we would 
	prefer HashSet (or TreeSet) over HashMap (or TreeMap) is to print all distinct elements in an array.





Differences between HashMap and HashTable in Java:-


HashMap and Hashtable store key and value pairs in a hash table. When using a Hashtable or HashMap, we specify an 
object that is used as a key and the value that you want to be linked to that key. The key is then hashed, and the 
resulting hash code is used as the index at which the value is stored within the table. Now let us discuss with the 
help of an example.

Hashmap vs Hashtable 

HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper 
synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
HashMap is generally preferred over HashTable if thread synchronization is not needed.





Top 15 Frequently Asked HashMap Interview Questions In Java:-

HashMap is one of the tricky java class in java collections framework. Unlike other java classes its object 
contains both key and value pair. This is one of the most frequently used java class along side ArrayList. 
In this tutorial I will be sharing frequently asked HashMap interview questions with answers.

Q1 How HashMap internally works in java 8? 

Solution:-
	This question is the most popular interview question for java developers. The get() method of HashMap works on 
	the principle of Hashing. TreeNode concept is introduced in java 8 to store key-value pairs. You can find the 
	detailed explanation here.


Q2 What is the difference between HashMap and Hashtable in java ? 

Solution:-
	1. The main difference between Hashtable and HashMap is that HashMap can contain one null key and any number of 
		null values but Hashtable does not allow null values.
	2. Hashtable is synchronized while HashMap is not synchronized.
	3. HashMap is faster as compared to Hashtable because HashMap is not synchronized.


Q3 What is the difference between HashMap and ConcurrentHashMap in java ? 

Solution:-
	1. ConcurrentHashMap is thread-safe that is at a time only one thread can access the code whereas HashMap is not 
		thread-safe.
	2. ConcurrentHashMap does not allow keys to contain null values whereas HashMap can contain one null key.



Q4 What is the threshold value after which bucket converted from linked list to Tree?

Solution:-
	If for a given bucket, if there are more than 8 Nodes then the linked list is converted into a Red Black tree. 
	This is represented in the HashMap class code as follows :

	static final int TREEIFY_THRESHOLD = 8;
 
  
	Below image displays both tree (at bucket 0), and linked lists (at bucket 1, 2, 3) . Bucket 0 is a 
	Tree because it contains at least 8 nodes (containing Node A, Node B,  Node C, Node D, Node E, Node F , Node K , 
		Node Q, Node O, Node M, Node P)


Q5 What is the threshold value after which Tree is converted back to linked list?

Solution:-
	If for a given bucket, if there are less than 6 Nodes then the Tree is converted back to the linked list. 
	This is represented in the HashMap class code as follows :

	static final int UNTREEIFY_THRESHOLD = 6;

Q6 What is the time complexity of basic operations get() and put() in HashMap class?

Solution:-
	According to Java docs,

	The HashMap provides the constant time performance O(1)  for the basic operations get and put , assuming that the 
	hash function disperses the elements properly among the buckets.

Q7 What will happen if you try to store duplicate key in the HashMap?

Solution:-
	If you try to store a key which is already present in the HashMap then it will override the old value with the new value. 
	It will not throw error or exception. The size of the HashMap does not change. This is one of the reason that when you 
	call keySet() method on HashMap to get all keys it will return Set instead of Collection because Set does not allow 
	duplicates.


Q8 What will happen if you store duplicate value in the HashMap?

Solution:-
	Yes, HashMap can store duplicate values in java. This is the reason when you call values() method of HashMap to get all 
	values it will return a Collection not a Set. It also does not return List because HashMap does not maintain order 
	guarantee for key and value.


Q9 In HashMap, what is the requirement for an object to be used as key?

Solution:-
	Any class(for e.g String) can serve as a key if and only if it overrides the hashCode() and equals() method. 
	hashCode() method is used when you insert a key into the HashMap while equals() method is used to retrieve the 
	value from HashMap.



Q10 What will happen if you try to store null key in HashMap?

Solution:-
	Only one null key is allowed in HashMap. If key of the HashMap is null then it will always be present in index 0. 
	NullPointerException is thrown if you try to call hashCode() method on null key.
	As a result, when a get() method is called then value of the first index is returned.



Q11 What is the difference between Collections.synchroizedHashMap(HashMap)  and HashMap?

Solution:-
	The main difference between Collections.synchronizedHashMap(HashMap) and HashMap is that HashMap is non-synchronized 
	while Collections.synchronizedHashMap(HashMap) is a wrapped instance of HashMap which has all put and get methods 
	synchronized.



Q12 What are the different ways to traverse HashMap in java?

Solution:-
	There are various ways by which we can iterate HashMap in java :

	1. Using keySet() and iterator()
	2. Using entrySet() and enhanced for loop
	3. Using entrySet() and iterator()
	4. Using keySet() and get() method

Q13  What is the difference between capacity and size of HashMap in java?

Solution:-
	The capacity indicates the number of entries object a HashMap can store whereas size() denotes how many key-value 
	pairs is currently present in the HashMap.



Q14 What is the difference between HashMap and ArrayList ? 

Solution:-
	1. HashMap implements Map interface while ArrayList class implements List interface.
	2. HashMap does not provide ordering guarantee where as ArrayList maintains the order of the object in which they are inserted.
	3. ArrayList allows duplicate objects whereas HashMap does not allow duplicate keys.



Q15  How will you measure the performance of HashMap?

Solution:-
	According to Java docs,

	An instance of HashMap has two parameters that affects its performance
	1. load factor
	2. capacity

	load factor : The load factor is a measure of how full the hash table is allowed to get before its capacity is 
		automatically increased. When the number of entries in the hash table exceeds the product of the load factor and 
		the current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) so that the hash 
		table has approximately twice the number of buckets.

	capacity : The capacity is the number of buckets in the hash table( HashMap class is roughly equivalent to Hashtable, 
		except that it is unsynchronized and permits nulls.), and the initial capacity is simply the capacity at the time 
		the hash table is created. 

Q16  What is the difference between HashMap and TreeMap in java ? 

Solution:-
	1. HashMap does not maintain any ordering guarantee. TreeMap elements are sorted according to the natural ordering 
		of the elements.
	2. HashMap implementation internally uses hashing. TreeMap internally uses Red-black tree implementation.
	3. HashMap can contain any number of null values and one null key. TreeMap can not contain null keys but may 
		contain null values.

Q17 What is the difference between clear() and remove() method of HashMap?

Solution:-
	clear() method removes all the entries object from the HashMap and returns void.

	remove() method removes the mapping for the key passed as a parameter.


Q18 How HashMap remove() method internally works in java ? 

Solution:-
That's all for this post HashMap interview questions and answers . If you liked this article then please share it 
with your friends. If you have any questions or doubts then feel free to mention in the comments.








									     --------HahsSet in Java-------


The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. 
No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant 
order of elements over time. This class permits the null element. The class also offers constant time performance for 
the basic operations like add, remove, contains, and size assuming the hash function disperses the elements properly 
among the buckets, which we shall see further in the article.  									     



A few important features of HashSet are: 

(1)	Implements Set Interface.
(2)	The underlying data structure for HashSet is Hashtable.
(3)	As it implements the Set Interface, duplicate values are not allowed.
(4)	Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted 
	based on their hash code.
(5)	NULL elements are allowed in HashSet.
(6)	HashSet also implements Serializable and Cloneable interfaces.


HashSet extends Abstract Set<E> class and implements Set<E>, Cloneable, and Serializable interfaces where E is the 
type of elements maintained by this set. The directly known subclass of HashSet is LinkedHashSet.

Now for the maintenance of constant time performance, iterating over HashSet requires time proportional to the sum of 
the HashSet instance’s size (the number of elements) plus the “capacity” of the backing HashMap instance 
(the number of buckets). Thus, it’s very important not to set the initial capacity too high (or the load factor too low) 
if iteration performance is important. 



Initial Capacity:- The initial capacity means the number of buckets when hashtable (HashSet internally uses hashtable 
		data structure) is created. The number of buckets will be automatically increased if the current size gets full. 
 
Load Factor:- The load factor is a measure of how full the HashSet is allowed to get before its capacity is automatically 
				increased. When the number of entries in the hash table exceeds the product of the load factor and the 
				current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) so that the 
				hash table has approximately twice the number of buckets.



Effect on performance:  Load factor and initial capacity are two main factors that affect the performance of HashSet 
	operations. A load factor of 0.75 provides very effective performance with respect to time and space complexity. 
	If we increase the load factor value more than that then memory overhead will be reduced (because it will decrease 
		internal rebuilding operation) but, it will affect the add and search operation in the hashtable. 
	To reduce the rehashing operation we should choose initial capacity wisely. If the initial capacity is greater than 
	the maximum number of entries divided by the load factor, no rehash operation will ever occur.


Note: The implementation in a HashSet is not synchronized, in the sense that if multiple threads access a hash set 
	concurrently, and at least one of the threads modifies the set, it must be synchronized externally. 
	This is typically accomplished by synchronizing on some object that naturally encapsulates the set. 
	If no such object exists, the set should be “wrapped” using the Collections.synchronizedSet method. 
	This is best done at creation time, to prevent accidental unsynchronized access to the set as shown below:



Set s = Collections.synchronizedSet(new HashSet(...));
Syntax: Declaration of HashSet

public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable					
where E is the type of elements stored in a HashSet.

Internal working of a HashSet: All the classes of Set interface are internally backed up by Map. HashSet uses 
HashMap for storing its object internally. You must be wondering that to enter a value in HashMap we need a key-value 
pair, but in HashSet, we are passing only one value. 

Storage in HashMap: Actually the value we insert in HashSet acts as a key to the map Object and for its value, 
java uses a constant variable. So in the key-value pair, all the values will be the same.


HashSet not only stores unique Objects but also a unique Collection of Objects like ArrayList<E>, LinkedList<E>, 
Vector<E>,..etc.

Implementation:-

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

Output:-
elements of List-1: [1, 2]
elements of List-2: [1, 2]
elements of set: [[1, 2], [3, 4]]
Size of set= 2



 Before storing an Object, HashSet checks whether there is an existing entry using hashCode() and equals() methods. 
 In the above example, two lists are considered equal if they have the same elements in the same order. 
 When you invoke the hashCode()  method on the two lists, they both would give the same hash since they are equal. 

HashSet does not store duplicate items,  if you give two Objects that are equal then it stores only the first one, 
here it is list1.


Constructors of HashSet class:-


In order to create a HashSet, we need to create an object of the HashSet class. The HashSet class consists of various 
constructors that allow the possible creation of the HashSet. The following are the constructors available in this class.

1. HashSet(): This constructor is used to build an empty HashSet object in which the default initial capacity is 16 and 
	the default load factor is 0.75. If we wish to create an empty HashSet with the name hs, then, it can be created as:

HashSet<E> hs = new HashSet<E>();

2. HashSet(int initialCapacity): This constructor is used to build an empty HashSet object in which the initialCapacity 
	is specified at the time of object creation. Here, the default loadFactor remains 0.75.

HashSet<E> hs = new HashSet<E>(int initialCapacity);

3. HashSet(int initialCapacity, float loadFactor): This constructor is used to build an empty HashSet object in which 
	the initialCapacity and loadFactor are specified at the time of object creation.

HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);

4. HashSet(Collection): This constructor is used to build a HashSet object containing all the elements from the given 
	collection. In short, this constructor is used when any conversion is needed from any Collection object to the HashSet 
	object. If we wish to create a HashSet with the name hs, it can be created as:

HashSet<E> hs = new HashSet<E>(Collection C);


Code:-

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
	    System.out.println("Set: \n"+set);
	    System.out.println("Is set contains India or not: "+set.contains("India"));
	    
	    // Removing items from HashSet
        // using remove() method
        set.remove("Australia");
        System.out.println("Set after removing Australia: "+ set);
        
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

Output:-
Set: 
[South Africa, Australia, India]
Is set contains India or not: true
Set after removing Australia: [South Africa, India]
Iterating over list:
South Africa
India





 Performing Various Operations on HashSet
Let’s see how to perform a few frequently used operations on the HashSet.

Operation 1: Adding Elements

In order to add an element to the HashSet, we can use the add() method. However, the insertion order is not retained in 
the HashSet.  We need to keep a note that duplicate elements are not allowed and all the duplicate elements are ignored.

Code:-
// Java program to Adding Elements to HashSet

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
// AddingElementsToHashSet
class GFG {

	// Method 1
	// Main driver method
	public static void main(String[] args)
	{
		// Creating an empty HashSet of string entities
		HashSet<String> hs = new HashSet<String>();

		// Adding elements using add() method
		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");

		// Printing all string el=ntries inside the Set
		System.out.println("HashSet elements : " + hs);
	}
}


Output:
HashSet elements : [Geek, For, Geeks]



Operation 2: Removing Elements

The values can be removed from the HashSet using the remove() method.

Code:-
// Java program Illustrating Removal Of Elements of HashSet

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
// RemoveElementsOfHashSet
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an
		HashSet<String> hs = new HashSet<String>();

		// Adding elements to above Set
		// using add() method
		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");
		hs.add("A");
		hs.add("B");
		hs.add("Z");

		// Printing the elements of HashSet elements
		System.out.println("Initial HashSet " + hs);

		// Removing the element B
		hs.remove("B");

		// Printing the updated HashSet elements
		System.out.println("After removing element " + hs);

		// Returns false if the element is not present
		System.out.println("Element AC exists in the Set : "
						+ hs.remove("AC"));
	}
}

Output:
Initial HashSet [A, B, Geek, For, Geeks, Z]
After removing element [A, Geek, For, Geeks, Z]
Element AC exists in the Set : false



Operation 3: Iterating through the HashSet

Iterate through the elements of HashSet using the iterator() method. Also, the most famous one is to use the 
enhanced for loop. 

Code:-
// Java Program to Illustrate Iteration Over HashSet

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
// IterateTheHashSet
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an empty HashSet of string entries
		HashSet<String> hs = new HashSet<String>();

		// Adding elements to above Set
		// using add() method
		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");
		hs.add("A");
		hs.add("B");
		hs.add("Z");

		// Iterating though the HashSet using iterators
		Iterator itr = hs.iterator();

		// Holds true till there is single element
		// remaining in Set
		while (itr.hasNext())

			// Traversing elements and printing them
			System.out.print(itr.next() + ", ");
		System.out.println();

		// Using enhanced for loop for traversal
		for (String s : hs)

			// Traversing elements and printing them
			System.out.print(s + ", ");
		System.out.println();
	}
}

Output
A, B, Geek, For, Geeks, Z, 
A, B, Geek, For, Geeks, Z, 



Time Complexity of HashSet Operations: The underlying data structure for HashSet is hashtable. So amortize 
(average or usual case) time complexity for add, remove and look-up (contains method) operation of HashSet takes 
O(1) time.





									--------Methods in HashSet---------


Methods 												DESCRIPTION

add(E e)						Used to add the specified element if it is not present, if it is present then return false.
clear()							Used to remove all the elements from set.
contains(Object o)				Used to return true if an element is present in set.
remove(Object o)				Used to remove the element if it is present in set.
iterator()	 					Used to return an iterator over the element in the set.
isEmpty()						Used to check whether the set is empty or not. Returns true for empty and false for a 
								non-empty condition for set.
size()							Used to return the size of the set.
clone()							Used to create a shallow copy of the set.


Methods inherited from class java.util.AbstractSet
Methods 												DESCRIPTION

equals()						Used to verify the equality of an Object with a HashSet and compare them. 
								The list returns true only if both HashSet contains same elements, irrespective of order.

hashcode()						Returns the hash code value for this set.

removeAll(collection)			This method is used to remove all the elements from the collection which are present 
								in the set.
								This method returns true if this set changed as a result of the call.





Methods inherited from class java.util.AbstractCollection

METHOD 													DESCRIPTION

addAll(collection) 				This method is used to append all of the elements from the mentioned collection to the 
								existing set.
								The elements are added randomly without following any specific order.

containsAll(collection) 		This method is used to check whether the set contains all the elements present in 
								the given collection or not.

								This method returns true if the set contains all the elements and returns false if any 
								of the elements are missing.

retainAll(collection)			This method is used to retain all the elements from the set which are mentioned in 
								the given collection.
								This method returns true if this set changed as a result of the call.

toArray()						This method is used to form an array of the same elements as that of the Set.

toString()						The toString() method of Java HashSet is used to return a string representation of 
								the elements of the HashSet Collection.								




Methods declared in interface java.util.Collection

METHOD 													DESCRIPTION

parallelStream()				Returns a possibly parallel Stream with this collection as its source.

removeIf​(Predicate<? 	Removes all of the elements of this 
		super E> filter)		collection that satisfy the given predicate.	

stream()						Returns a sequential Stream with this collection as its source.

toArray​(IntFunction     Returns an array containing all of the 
		<T[]> generator)		elements in this collection, using the provided generator function to allocate the 
								returned array.						
				




Methods declared in interface java.lang.Iterable

METHOD 													DESCRIPTION

 forEach​(Consumer<? super T> action)		Performs the given action for each element of the Iterable until 
 													all elements have been processed or the action throws an exception.	



 Methods declared in interface java.util.Set

METHOD 													DESCRIPTION

addAll​(Collection<? extends E> c)		Adds all of the elements in the specified collection to this set if 
												they’re not already present (optional operation).

containsAll​(Collection<?> c)			Returns true if this set contains all of the elements of the specified 
												collection.

equals​(Object o)						Compares the specified object with this set for equality.
hashCode()										Returns the hash code value for this set.

removeAll​(Collection<?> c)				Removes from this set all of its elements that are contained in the 
												specified collection (optional operation).

retainAll​(Collection<?> c)				Retains only the elements in this set that are contained in the specified 
												collection (optional operation).

toArray()										Returns an array containing all of the elements in this set.

toArray​(T[] a)							Returns an array containing all of the elements in this set; 
												the runtime type of the returned array is that of the specified array.																				




Methos Code:-

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

Output:-


Set: 
[Pradeep, Priyansh, Deepak]

After removing Set:
 [Pradeep, Priyansh]
true
false
false

Iterating Over the Set:
Varya Divyansh Pradeep Priyansh Deepak 
The Size of set : 5
The clone Set: [Divyansh, Pradeep, Priyansh, Varya, Deepak]
The clone Set2: [Divyansh, Pradeep, Priyansh, Varya, Deepak]
true
true
true
false

The HashCode of set: -1475603218
The HashCode of set2: -2001638603
The HashCode of cloneset: -1475603218

set2 after removeAll:
[Priyansh]

 set after removeAll:
[Varya, Divyansh, Priyansh]

Now set after removeAll:
[Varya, Divyansh]

The new size of set: 2

The new size of set2: 1

set2 after addAll with list:
 [Chandramukhi, Pradeep, Priyansh, Deepak]

set after addAll with set2:
 [Varya, Chandramukhi, Divyansh, Pradeep, Priyansh, Deepak]

set after addAll with list:
 [Varya, Chandramukhi, Divyansh, Pradeep, Priyansh, Deepak]
Is set containsAll cloneset: true
Is set2 containsAll cloneset: false

set as Array: 
Varya Chandramukhi Divyansh Pradeep Priyansh Deepak 

set2 as String:
[Chandramukhi, Pradeep, Priyansh, Deepak]








HashSet vs HashMap:-


BASIS 							HashSet 														HashMap

Implementation		HashSet implements Set interface.						HashMap implements Map interface.
Duplicates			HashSet doesn’t allow duplicate values.					HashMap store key, value pairs and it does 
																			not allow duplicate keys. If key is duplicate 
																			then the old key is replaced with the new value.

Number of objects	HashSet requires only one object add(Object o).			HashMap requires two objects put(K key, V Value)	
 during storing 															to add an element to the HashMap object.
 objects		 

Dummy value			HashSet internally uses HashMap to add elements. 		HashMap does not have any concept of dummy value.
					In HashSet, the argument passed in add(Object) 
					method serves as key K. Java internally associates 
					dummy value for each value passed in add(Object) 
					method.	.

Storing or Adding 	HashSet internally uses the HashMap objects				HashMap internally uses hashing to store or 
mechanism	 		to store or add the objects.							add objects

Faster				HashSet is slower than HashMap.							HashMap is faster than HashSet.

Insertion			HashSet uses the add() method for add or storing data.	HashMap uses the put() method for storing data.

Example	   			HashSet is a set, e.g. {1, 2, 3, 4, 5, 6, 7}.			HashMap is a key -> value pair(key to value) 
																			map, e.g. {a -> 1, b -> 2, c -> 2, d -> 1}.





HashSet vs TreeSet:-

BASIS 								HashSet 											TreeSet

Speed and internal 		For operations like search, insert 			TreeSet takes O(Log n) for search, insert and delete 
	implementation		and delete. It takes constant time 			which is higher than HashSet. But TreeSet keeps sorted 
						for these operations on average. 			data. Also, it supports operations like higher()
						HashSet is faster than TreeSet. 			(Returns least higher element), floor(), ceiling(), etc. 
						HashSet is Implemented using a 				These operations are also O(Log n) in TreeSet and not supported
						hash table.									in HashSet. TreeSet is implemented using a Self Balancing
																	Binary Search Tree (Red-Black Tree). TreeSet is backed 
																	by TreeMap in Java.

Ordering 				Elements in HashSet are not ordered.		TreeSet maintains objects in Sorted order defined 
																	by either Comparable or Comparator method in Java. 
																	TreeSet elements are sorted in ascending order by 
																	default. It offers several methods to deal with the 
																	ordered set like first(), last(), headSet(), 
																	tailSet(), etc.		

Null Object				HashSet allows the null object.				TreeSet doesn’t allow null Object and throw 
																	NullPointerException, Why, because TreeSet uses 
																	compareTo() method to compare keys and compareTo() 
																	will throw java.lang.NullPointerException.	

Comparison				HashSet uses equals() method to compare 	TreeSet uses compareTo() method for same purpose.
						two objects in Set and for detecting 		If equals() and compareTo() are not consistent,
						duplicates.									i.e. for two equal object equals should return true
																	while compareTo() should return zero, then it will 
																	break the contract of the Set interface and will 
																	allow duplicates in Set implementations like TreeSet 

