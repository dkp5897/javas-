										---------:Queue Data Structure:---------


A Queue is a linear structure which follows a particular order in which the operations are performed. 
The order is First In First Out (FIFO). A good example of a queue is any queue of consumers for a resource where 
the consumer that came first is served first. The difference between stacks and queues is in removing. 
In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added.



Similar to Stack, Queue is a linear data structure that follows a particular order in which the operations are performed 
for storing data. The order is First In First Out (FIFO).  One can imagine a queue as a line of people waiting to receive 
something in sequential order which starts from the beginning of the line. It is an ordered list in which insertions are 
done at one end which is known as the rear and deletions are done from the other end known as the front. 
A good example of a queue is any queue of consumers for a resource where the consumer that came first is served first.

The difference between stacks and queues is in removing. In a stack we remove the item the most recently added; 
in a queue, we remove the item the least recently added.

Basic Operations on Queue: 

(1)	void enqueue(int data): Inserts an element at the end of the queue i.e. at the rear end.
(2)	int dequeue(): This operation removes and returns an element that is at the front end of the queue.



Auxiliary Operations on Queue:

(1)	int front(): This operation returns the element at the front end without removing it.
(2)	int rear(): This operation returns the element at the rear end without removing it.
(3)	int isEmpty(): This operation indicates whether the queue is empty or not.
(4)	int size(): This operation returns the size of the queue i.e. the total number of elements it contains. 



Types of Queues: 

(1)	Simple Queue: Simple queue also known as a linear queue is the most basic version of a queue. Here, insertion of an 
	element i.e. the Enqueue operation takes place at the rear end and removal of an element i.e. the Dequeue operation 
	takes place at the front end.

(2)	Circular Queue:  In a circular queue, the element of the queue act as a circular ring. The working of a circular 
	queue is similar to the linear queue except for the fact that the last element is connected to the first element. 
	Its advantage is that the memory is utilized in a better way. This is because if there is an empty space i.e. 
	if no element is present at a certain position in the queue, then an element can be easily added at that position.

(3)	Priority Queue: This queue is a special type of queue. Its specialty is that it arranges the elements in a queue 
	based on some priority. The priority can be something where the element with the highest value has the priority so 
	it creates a queue with decreasing order of values. The priority can also be such that the element with the lowest 
	value gets the highest priority so in turn it creates a queue with increasing order of values.

(4)	Dequeue: Dequeue is also known as Double Ended Queue. As the name suggests double ended, it means that an element 
	can be inserted or removed from both the ends of the queue unlike the other queues in which it can be done only from 
	one end. Because of this property it may not obey the First In First Out property. 



Applications of Queue: 

Queue is used when things don’t have to be processed immediately, but have to be processed in First In First Out order 
like Breadth First Search. This property of Queue makes it also useful in following kind of scenarios.

(1) When a resource is shared among multiple consumers. Examples include CPU scheduling, Disk Scheduling. 

(2) When data is transferred asynchronously (data not necessarily received at same rate as sent) between two processes. 
	Examples include IO Buffers, pipes, file IO, etc. 

(3) Queue can be used as an essential component in various other data structures.

See this for more detailed applications of Queue and Stack.

Array implementation Of Queue 
For implementing queue, we need to keep track of two indices, front and rear. We enqueue an item at the rear and dequeue 
an item from the front. If we simply increment front and rear indices, then there may be problems, the front may reach 
the end of the array. The solution to this problem is to increase front and rear in circular manner.

Steps for ENQUEUE:-

(1)	Check the queue is full or not
(2)	If full, print overflow and exit
(3)	If queue is not full, increment tail and add the element


Steps for DEQUEUE:-

(1)	Check queue is empty or not
(2)	if empty, print underflow and exit
(3)	if not empty, print element at the head and increment head




Complexity Analysis:  

Time Complexity:
Operations              Complexity

Enque(insertion)           O(1)
Deque(deletion)            O(1)
Front(Get front)           O(1)
Rear(Get Rear)             O(1)        


Auxiliary Space: O(N). 
N is the size of array for storing elements.




Applications of Queue Data Structure:-

Queue is used when things don’t have to be processed immediately, but have to be processed in First In First Out order 
like Breadth First Search. 

This property of Queue makes it also useful in following kind of scenarios. 

When a resource is shared among multiple consumers. Examples include CPU scheduling, Disk Scheduling. 

When data is transferred asynchronously (data not necessarily received at same rate as sent) between two processes. 
Examples include IO Buffers, pipes, file IO, etc. 

In Operating systems:
Semaphores
FCFS ( first come first serve) scheduling, example: FIFO queue
Spooling in printers
 Buffer for devices like keyboard
In Networks:
Queues in routers/ switches 
Mail Queues
Variations: ( Deque, Priority Queue, Doubly Ended Priority Queue )
Some other applications of Queue:

(1)	Applied as waiting lists for a single shared resource like CPU, Disk, Printer.
(2)	Applied as buffers on MP3 players and portable CD players.
(3)	Applied on Operating system to handle interruption.
(4)	Applied to add song at the end or to play from the front.
(5)	Applied on WhatsApp when we send messages to our friends and they don’t have an internet connection then these messages 
	are queued on the server of WhatsApp.





The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements 
about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to 
inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), 
it follows the FIFO or the First-In-First-Out principle.

Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue 
and LinkedList in Java. Note that neither of these implementations is thread-safe. PriorityBlockingQueue is one 
alternative implementation if the thread-safe implementation is needed.


Declaration: The Queue interface is declared as:

public interface Queue extends Collection


Creating Queue Objects:- Since Queue is an interface, objects cannot be created of the type queue. We always need a 
class which extends this list in order to create an object. And also, after the introduction of Generics in Java 1.5, 
it is possible to restrict the type of object that can be stored in the Queue. This type-safe queue can be defined as:	

		// Obj is the type of the object to be stored in Queue 

			Queue<Obj> queue = new PriorityQueue<Obj> ();


Code:-

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<=5;i++){
            q.add(i);
        }
        System.out.println("The element of queue are: "+q);
        // to remove the head of the queue
        System.out.println("the removable element: "+q.remove());
        System.out.println("the head (the removable element) of the queue: "+q.poll());
        System.out.println("Npw the element of queue are: "+q);

        // to view the head of queue
        System.out.println("the head of the queue: "+q.peek());
        System.out.println("The element of queue are: "+q);

        //size of the queue
        System.out.println("Size of queue-" + q.size());
    }
}


Output:-

The element of queue are: [0, 1, 2, 3, 4, 5]
the removable element: 0
the head (the removable element) of the queue: 1
Npw the element of queue are: [2, 3, 4, 5]
the head of the queue: 2
The element of queue are: [2, 3, 4, 5]
Size of queue-4




Code:-

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


Output:-

Deepak Kumar Prajapati 
Deepak
Kumar
[Kumar, Prajapati]
[Prajapati]




Characteristics of a Queue: The following are the characteristics of the queue:-

(1)	The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. 
	It follows FIFO concept.

(2)	The Java Queue supports all methods of Collection interface including insertion, deletion, etc.

(3)	LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.

(4)	If any null operation is performed on BlockingQueues, NullPointerException is thrown.

(5)	The Queues which are available in java.util package are Unbounded Queues.

(6)	The Queues which are available in java.util.concurrent package are the Bounded Queues.

(6)	All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. 
	The Deques support element insertion and removal at both ends. 




									Classes that implement the Queue Interface:-


1. PriorityQueue: PriorityQueue class which is implemented in the collection framework provides us a way to process 
	the objects based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes 
	the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes 
	into play. Let’s see how to create a queue object using this class.


Code:-


// Java program to demonstrate the
// creation of queue object using the
// PriorityQueue class

import java.util.*;

class GfG {

	public static void main(String args[])
	{
		// Creating empty priority queue
		Queue<Integer> pQueue
			= new PriorityQueue<Integer>();

		// Adding items to the pQueue
		// using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		// Printing the top element of
		// the PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
	}
}

Output:-
10
10
15

2. LinkedList: LinkedList is a class which is implemented in the collection framework which inherently implements the 
	linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and 
	every element is a separate object with a data part and address part. The elements are linked using pointers and 
	addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are 
	preferred over the arrays or queues. Let’s see how to create a queue object using this class.



Code:-

// Java program to demonstrate the
// creation of queue object using the
// LinkedList class

import java.util.*;

class GfG {

	public static void main(String args[])
	{
		// Creating empty LinkedList
		Queue<Integer> ll
			= new LinkedList<Integer>();

		// Adding items to the ll
		// using add()
		ll.add(10);
		ll.add(20);
		ll.add(15);

		// Printing the top element of
		// the LinkedList
		System.out.println(ll.peek());

		// Printing the top element and removing it
		// from the LinkedList container
		System.out.println(ll.poll());

		// Printing the top element again
		System.out.println(ll.peek());
	}
}

Output:-
10
10
15

3. PriorityBlockingQueue: It is to be noted that both the implementations, the PriorityQueue and LinkedList are not 
	thread-safe. PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed. 
	PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and 
	supplies blocking retrieval operations. 
	Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError. 
	Let’s see how to create a queue object using this class.

Code:-

// Java program to demonstrate the
// creation of queue object using the
// PriorityBlockingQueue class

import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

class GfG {
	public static void main(String args[])
	{
		// Creating empty priority
		// blocking queue
		Queue<Integer> pbq
			= new PriorityBlockingQueue<Integer>();

		// Adding items to the pbq
		// using add()
		pbq.add(10);
		pbq.add(20);
		pbq.add(15);

		// Printing the top element of
		// the PriorityBlockingQueue
		System.out.println(pbq.peek());

		// Printing the top element and
		// removing it from the
		// PriorityBlockingQueue
		System.out.println(pbq.poll());

		// Printing the top element again
		System.out.println(pbq.peek());
	}
}

Output:-

10
10
15