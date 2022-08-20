											---------:Linked List:---------

A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. 
The elements in a linked list are linked using pointers as shown in the below image:

				Head   Next
				__________	   __________
				|__A__|___|-->|__B__|___|--->Null
				Data

In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the 
next node in the list.				

Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a 
contiguous location; the elements are linked using pointers. They includes a series of connected nodes. 
Here, each node stores the data and the address of the next node.


Why Linked List? 

Arrays can be used to store linear data of similar types, but arrays have the following limitations. 

The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, 
the allocated memory is equal to the upper limit irrespective of the usage. 

Insertion of a new element / Deletion of a existing element in an array of elements is expensive: The room has to be 
created for the new elements and to create room existing elements have to be shifted but in Linked list if we have the 
head node then we can traverse to any node through it and insert new node at the required position.


For example, in a system, if we maintain a sorted list of IDs in an array id[]. 
id[] = [1000, 1010, 1050, 2000, 2040]. 

And if we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 1000 
(excluding 1000). 

Deletion is also expensive with arrays until unless some special techniques are used. For example, to delete 1010 in id[], 
everything after 1010 has to be moved due to this so much work is being done which affects the efficiency of the code.


Advantages over arrays:-

Dynamic Array.
Ease of Insertion/Deletion.


Drawbacks:-

Random access is not allowed. We have to access elements sequentially starting from the first node(head node). 
So we cannot do binary search with linked lists efficiently with its default implementation. Read about it here. 

Extra memory space for a pointer is required with each element of the list. 
Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there 
in case of linked lists.



Representation: 
A linked list is represented by a pointer to the first node of the linked list. The first node is called the head. 
If the linked list is empty, then the value of the head points to NULL. 

Each node in a list consists of at least two parts: 

A Data Item (we can store integer, strings or any type of data).

Pointer (Or Reference) to the next node (connects one node to another) or An address of another node
In C, we can represent a node using structures. Below is an example of a linked list node with integer data.

In Java or C#, LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a 
reference of Node class type. 


class LinkedList {
	Node head; // head of the list

	/* Linked list Node*/
	class Node {
		int data;
		Node next;

		// Constructor to create a new node
		// Next is by default initialized
		// as null
		Node(int d) {
		data = d;
		next = null;
		}
	}
}



First Simple Linked List in C: 
Let us create a simple linked list with 3 nodes.

Code:-

// A simple Java program to introduce a linked list
class LinkedList {
	Node head; // head of list

	/* Linked list Node. This inner class is made static so that
	main() can access it */
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		} // Constructor
	}

	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		/* Three nodes have been allocated dynamically.
		We have references to these three blocks as head,
		second and third

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 1 | null |	 | 2 | null |	 | 3 | null |
		+----+------+	 +----+------+	 +----+------+ */

		llist.head.next = second; // Link first node with the second node

		/* Now next of the first Node refers to the second. So they
			both are linked.

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 1 | o-------->| 2 | null |	 | 3 | null |
		+----+------+	 +----+------+	 +----+------+ */

		second.next = third; // Link second node with the third node

		/* Now next of the second Node refers to third. So all three
			nodes are linked.

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 1 | o-------->| 2 | o-------->| 3 | null |
		+----+------+	 +----+------+	 +----+------+ */
	}
}



Printing the LinkedList:---->

Approach: Traverse for Each Node and Print Data


s.o.p.(head): Incorrect
s.o.p(head.data): Correct

Move to Next Node:

nextNode = currNode.next



Dont Make Operations on head

head: 1 -> 2 -> 3 -> 4 -> 5: tail

while (head!=null)
    head = head.next;

After Loop:

1 -> 2 -> 3 -> 4 -> 5:head, tail


Better Way: 

Node temp = head;
Perform Operations on temp



CORRECT CODE:

head: 1 -> 2 -> 3 -> 4 -> 5: null


void printList(Node head)
{
    Node temp = head;
    while (temp!=null)
    {
        System.out.println(temp.data + " ");
        temp = temp.next;
    }
}

OP: [1 2 3 4 5]

TC: O(N)
SC: O(1)




INCORRECT CODE:

head: 1 -> 2 -> 3 -> 4 -> 5 -> null


void printList(Node head)
{
    Node temp = head;
    while (temp.next!=null)
    {
        System.out.println(temp.data + " "); // Last Node DOES NOT Satisfy the Criteria
        temp = temp.next;
    }
}

OP: [1 2 3 4]

Code:-

import java.util.LinkedList;

public class LinkedListBasic {
	
	/* Linked list Node.  This inner class is made static so that
    main() can access it */

	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}	// constructor
	}

	// Incorrect Code	(this will not print last element)

	static void printLL(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	
	 /* This function prints contents of linked list starting from head */
	
	 // Correct Code
	static void printList(Node head)
	{
	    Node temp = head;
	    while (temp!=null)
	    {
	        System.out.print(temp.data + "-->");
	        temp = temp.next;
	    }
		System.out.println("null");
	}

	public static void main(String[] args) {

		/* method to create a simple linked list with 3 nodes*/
		
		
		Node head=new Node(1);
		Node second=new Node(2);
		Node third =new Node(3);
		
		head.next=second;		// Link first node with the second node
		second.next=third;		//Link second node with the third node
		
		printList(head);		// print linkedList

		printLL(head);		// print Incorrect linkedList
	}

}
Output:-
1->2->3->Null


Code-2:

public class LLBasic {
    
    static Node head;

    // Creating Node Class
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }// Contructor
    }

    // Printing the LinkedList
    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        LLBasic LList=new LLBasic();    // Creating a object of our class

        LList.head=new Node(1);
        Node second=new Node(2);
        Node Third=new Node(4);

        // linking the Nodes
        head.next=second;
        second.next=Third;

        LList.printLL(head);
        
    }
}


Output:-

1->2->4->Null


Linked List Complexity: 
Time Complexity 

		Time Complexity		Worst Case		Average Case:

				Search			O(n)		O(n)
				Insert			O(1)		O(1)
				Deletion		O(1)		O(1)

Auxiliary Space:  O(n)

Important Links : 
Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above. 


------->Linked List vs Array:-

Arrays store elements in contiguous memory locations, resulting in easily calculable addresses for the elements stored 
and this allows faster access to an element at a specific index. Linked lists are less rigid in their storage structure 
and elements are usually not stored in contiguous locations, hence they need to be stored with additional tags giving a 
reference to the next element. This difference in the data storage scheme decides which data structure would be more 
suitable for a given situation. 



Major differences are listed below: 

Size: 				Since data can only be stored in contiguous blocks of memory in an array, its size cannot be altered 
					at runtime due to the risk of overwriting other data. However, in a linked list, each node points 
					to the next one such that data can exist at scattered (non-contiguous) addresses; this allows for a 
					dynamic size that can change at runtime.

Memory allocation: 	For arrays at compile time and at runtime for linked lists. but, a dynamically allocated array also 
					allocates memory at runtime.


Memory efficiency: 	For the same number of elements, linked lists use more memory as a reference to the next node is 
					also stored along with the data. However, size flexibility in linked lists may make them use less 
					memory overall; this is useful when there is uncertainty about size or there are large variations 
					in the size of data elements; memory equivalent to the upper limit on the size has to be allocated 
					(even if not all of it is being used) while using arrays, whereas linked lists can increase their 
					sizes step-by-step proportionately to the amount of data.


Execution time: 	Any element in an array can be directly accessed with its index; however in the case of a linked list, 
					all the previous elements must be traversed to reach any element. Also, better cache locality in 
					arrays (due to contiguous memory allocation) can significantly improve performance. As a result, 
					some operations (such as modifying a certain element) are faster in arrays, while others 
					(such as inserting/deleting an element in the data) are faster in linked lists.


Insertion: 			In an array, insertion operation takes more time but in linked last these operations are fast. 
					For example, if we want to insert an element in the array at the end position in the array and 
					the array is full then we copy the array into another array and then we can add an element whereas 
					if the linked list is full then we find the last node and make it next to the new node 


Dependency: 		In array values are independent of each other but in the case of linked list nodes are dependent on 
					each other. one node is dependent on its previous node. If the previous node gets loss then we can’t 
					find its next subsequent nodes.


			Arrays  												LinkedList

		(1)	Arrays are store in contiguous memory locations			LinkedList are store in non-contiguous memory locations
		(2)	fixed sizes												Dynamic size
		(3)	Memory is allocated at compile time    					Memory is allocated at runtime
		(4)	Use less memory than Ll 								use more memory for storing address of next element
		(5)	element can be access easily							It take time in LL 
		(6)	Insertion and Deletion take Time  						Insertion and Deletion is faster



Following are the points in favor of Linked Lists:-

(1) The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. 
	Also, generally, the allocated memory is equal to the upper limit irrespective of usage, and in practical uses, 
	the upper limit is rarely reached. 	

(2)	Inserting a new element in an array of elements is expensive because a room has to be created for the new elements 
	and to create a room existing elements have to be shifted. 

	For example, suppose we maintain a sorted list of IDs in an array id[ ]. 

	id[ ] = [1000, 1010, 1050, 2000, 2040, …..]. 

	And if we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 
	1000 (excluding 1000). 		

(3)	Deletion is also expensive with arrays unless some special techniques are used. For example, to delete 1010 in id[], 
	everything after 1010 has to be moved. 




So Linked list provides the following two advantages over arrays :-

(1) Dynamic size 
(2) Ease of insertion/deletion 


Linked lists have the following drawbacks: 

(1) Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot 
	do a binary search with linked lists. 
(2) Extra memory space for a pointer is required for each element of the list. 

(3) Arrays have a better cache locality that can make a pretty big difference in performance.

(4) It takes a lot of time in traversing and changing the pointers.

(5)  It will be confusing when we work with pointers.


The array has the following drawbacks:

(1) Array is static in nature. Once the size of the array is declared then we can’t modify it.

(2) Insertion and deletion operations are difficult in an array as elements are stored in contiguous memory locations and 
	the shifting operations are costly.

(3) The number of elements that have to be stored in an array should be known in advance.

(4) Wastage of memory is the main problem in the array. If the array size is big the less allocation of memory leads to 
	wastage of memory.



------->Linked List | Set 2 (Inserting a node):-

In this post, methods to insert a new node in linked list are discussed. A node can be added in three ways:- 

(1) At the front of the linked list  
(2) After a given node. 
(3) At the end of the linked list.


-->Add a node at the front: (4 steps process) 

The new node is always added before the head of the given Linked List. And newly added node becomes the new head of 
the Linked List. For example, if the given Linked List is 10->15->20->25 and we add an item 5 at the front, then the 
Linked List becomes 5->10->15->20->25. 
Let us call the function that adds at the front of the list is push(). 
The push() must receive a pointer to the head pointer, because push must change the head pointer to point to the 
new node (See this) 


/* This function is in LinkedList class. Inserts a
new Node at front of the list. This method is
defined inside LinkedList class shown above */
public void push(int new_data)
{
	/* 1 & 2: Allocate the Node &
			Put in the data*/
	Node new_node = new Node(new_data);

	/* 3. Make next of new Node as head */
	new_node.next = head;

	/* 4. Move the head to point to new Node */
	head = new_node;
}

We have a pointer to the head and we can directly attach a node and change the pointer. 
So the Time complexity of inserting a node at head position is O(1) as it does a constant amount of work


Code:-

import java.util.LinkedList;

public class AddFirstLL {

   static Node head;
    // Node calss
   static class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }// Construction
    }

    // add-First 

    public void push(String new_data)
    {
        // Allocate the node

        Node new_node=new Node(new_data);

        // Linking the new node with head i.e. it will be at first positon
        new_node.next=head;

        // making new_node as head
        head=new_node;
    }
    
    // Printing LL
    public void printLL(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        /* method to create a simple linked list with nodes*/

        AddFirstLL LList=new AddFirstLL();

        LList.head=new Node("is");
        Node second=new Node("a");
        Node Third =new Node("Linked");

        head.next=second;
        second.next=Third;

        LList.printLL(head);    // print LL before adding new node

        LList.push("This");
        LList.printLL(head);        // print LL after adding new node

    }
}

Output:-

is->a->Linked->null
This->is->a->Linked->null




--->Add a node after a given node: (5 steps process) :-

We are given a pointer to a node, and the new node is inserted after the given node.


/* This function is in LinkedList class.
Inserts a new node after the given prev_node. This method is
defined inside LinkedList class shown above */
public void insertAfter(Node prev_node, int new_data)
{
	/* 1. Check if the given Node is null */
	if (prev_node == null) {
		System.out.println("The given previous node cannot be null");
		return;
	}

	/* 2. Allocate the Node &
	3. Put in the data*/
	Node new_node = new Node(new_data);

	/* 4. Make next of new Node as next of prev_node */
	new_node.next = prev_node.next;

	/* 5. make next of prev_node as new_node */
	prev_node.next = new_node;
}


Time complexity of insertAfter() is O(n) as it depends on n where n is the size of the linked list

Space complexity: O(1) since using constant space to modify pointers


Code:-

public class AddNodeLL {
    static Node head;

    static class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }


    // this function add a node after a given node

    public void pushNode(Node pre_node ,String new_data)
    {
        if(pre_node==null)
        {
            System.out.println("previous node can't be null");
            return;
        }

        Node new_node=new Node(new_data);

        // replacing pre_node.next to new_node.nex
        /* means the node connected to previous node now connected to new node */
        new_node.next=pre_node.next;
        // Linking previous node to new node
        pre_node.next=new_node;
    }


    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        AddNodeLL LList=new AddNodeLL();

        // putting element in Linked List
        LList.head=new Node("This");
        Node second=new Node("is");
        Node third = new Node("Linked");
        Node forth =new Node("List");

        // Linking the element
        head.next=second;
        second.next=third;
        third.next=forth;
        System.out.println("The Old Linked list: ");
        LList.printLL(head);    // print old LL

        LList.pushNode(second, "a");
        System.out.println("\nThe new Linked list:");
        LList.printLL(head);
        
    }
}

Output:-

The Old Linked list: 
This->is->Linked->List->Null

The new Linked list:
This->is->a->Linked->List->Null





-->Add a node at the end: (6 steps process):-

The new node is always added after the last node of the given Linked List. For example if the given Linked List is 
5->10->15->20->25 and we add an item 30 at the end, then the Linked List becomes 5->10->15->20->25->30. 

Since a Linked List is typically represented by the head of it, we have to traverse the list till the end and then 
change the next to last node to a new node.

Following are the 6 steps to add node at the end.

/* Appends a new node at the end. This method is
defined inside LinkedList class shown above */
public void append(int new_data)
{
	/* 1. Allocate the Node &
	2. Put in the data
	3. Set next as null */
	Node new_node = new Node(new_data);

	/* 4. If the Linked List is empty, then make the
		new node as head */
	if (head == null)
	{
		head = new Node(new_data);
		return;
	}

	/* 4. This new node is going to be the last node, so
		make next of it as null */
	new_node.next = null;

	/* 5. Else traverse till the last node */
	Node last = head;
	while (last.next != null)
		last = last.next;

	/* 6. Change the next of last node */
	last.next = new_node;
	return;
}



Time complexity of append is O(n) where n is the number of nodes in the linked list. Since there is a loop from head to 
end, the function does O(n) work. 
This method can also be optimized to work in O(1) by keeping an extra pointer to the tail of the linked list


Code:-

public class AddLastLL {

    static Node head;

    static class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void pushLast(String new_data)
    {
        /* 1. Allocate the Node &
	        2. Put in the data
	        3. Set next as null */
        Node new_node=new Node(new_data);
        /* 4. If the Linked List is empty, then make the
		new node as head */
        if(head== null)
        {
            head= new Node(new_data);
            return;
        }
        	/* 4. This new node is going to be the last node, so
		make next of it as null */
        new_node.next=null;
        /* 5. Else traverse till the last node */
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        /* 6. Change the next of last node */
        last.next=new_node;
        return;
    }

    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        
        AddLastLL LList= new AddLastLL();
        LList.head=new Node("This");
        Node second=new Node("is");
        Node third = new Node("Linked");

        head.next=second;
        second.next=third;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        LList.pushLast("List");
        System.out.println("\nThe new Linked list:");
        LList.printLL(head);
    }
}



Output:-
The Old Linked list: 
This->is->Linked->Null

The new Linked list:
This->is->Linked->List->Null





All Node Adding Code:-->


import javax.swing.plaf.synth.SynthTextAreaUI;

public class InsertionLL {
    static Node head;

    // Creating Node Class
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }// Contructor
    }


    // Adding front element
    public void AddFront(int new_dat)
    {
        Node new_node = new Node(new_dat);

        // Linking the new node with head i.e. it will be at first positon
        new_node.next=head;
        head=new_node;
    }

    // adding element after e given node
    public void Append(Node pre_node, int new_data)
    {
        if(pre_node==null)
        {
            System.out.println("previous node can't be null ");
            return;
        }

        // Allocating node for new data
        Node new_node= new Node(new_data);

        new_node.next=pre_node.next;
        pre_node.next=new_node;
    }

    // adding Node in last

    public void AppendLast(int new_data)
    {
        Node new_node= new Node(new_data);
        if(head==null)
        {
            head=new_node;
            return;
        }

        /* 4. This new node is going to be the last node, so
		make next of it as null */
        new_node.next=null;

        Node last=head;
        /* 4. If the Linked List is empty, then make the
		new node as head */
        while(last.next!=null)
        {
            last=last.next;
        }
         /* 6. Change the next of last node */
        last.next=new_node;
    }

    // Printing the LinkedList
    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        InsertionLL LList=new InsertionLL();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node Third=new Node(4);

        // linking the Nodes
        head.next=second;
        second.next=Third;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("\nThe Linked list after adding front element: ");
        LList.AddFront(0);
        LList.printLL(head);

        System.out.println("\nThe Linked list after adding front element and element after a node: ");
        LList.Append(second, 3);
        LList.printLL(head);

        System.out.println("\nThe Linked list after adding front element, element after a node and last node: ");
        LList.AppendLast(5);
        LList.printLL(head);
    }
}


Output:-

The Old Linked list: 
1->2->4->Null

The Linked list after adding front element:
0->1->2->4->Null

The Linked list after adding front element and element after a node:
0->1->2->3->4->Null

The Linked list after adding front element, element after a node and last node:
0->1->2->3->4->5->Null

Time Complexity : O(n) 
Auxiliary Space : O(1)


-------->Linked List | Set 3 (Deleting a node):-

Delete from a Linked List:-
You can delete an element from a list from:

(1)	Beginning
(2)	End
(3)	Middle


1. Delete from Beginning:
Point head to the next node i.e. second node
Means point head which is at first node to second node and first node will deleted automatecally. 

    head = head.next


Code:-

public class DeleteFirst {

    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    // function for deleting fisrt element in LL

    public void deleFirst()
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        // just change head position from first to second node first node will be deleted
        head=head.next;
    }

    // print LL

    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        DeleteFirst LList=new DeleteFirst();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node forth =new Node(4);
        Node fifth=new Node(5);

        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fifth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("\nThe Linked list after deleting front element: ");
        LList.deleFirst();
        LList.printLL(head);
        
    }
}

Output:-
The Old Linked list: 
1->2->3->4->5->Null

The Linked list after deleting front element:
2->3->4->5->Null


2. Delete from end:
Point head to the previous element i.e. last second element
    Change next pointer to null
    struct node*temp = head;
    while(temp->next->next!=NULL)
    {
        temp = temp->next
    }
    temp->next = NULL


   
Code:-

public class DeleteLast {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

     // function for deleting last element in LL
     public void deleLast()
     {
        // Corner Condition
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        // if only one node present in LL
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node secondLast=head;   // secondLst point fisrt(head) Node
        Node lastNode=head.next;     // lastNode point second element (Node)

        /*at the end of the loop secondLast  will reach at second last element and lastNode at last element  */
        while(lastNode.next !=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;   // Now second last become last element of theLL

     }

    // print LL

    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }


    public static void main(String[] args) {
        
        DeleteLast LList=new DeleteLast();

        // putting element and linking them
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node forth =new Node(4);
        Node fifth=new Node(5);

        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fifth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("\nThe Linked list after deleting last element: ");
        LList.deleLast();
        LList.printLL(head);
    }
}

Output:-
The Old Linked list: 
1->2->3->4->5->Null

The Linked list after deleting last element:
1->2->3->4->Null


3.Delete from Middle:
Traverse to element before the element to be deleted
Change next pointer to exclude the node from the chain
    for(int i=2; i< position; i++) 
    {
         if(temp->next!=NULL) 
         {
               temp = temp->next;
         }
    }

temp->next = temp->next->next;       


Code:-


Time Complexity: O(n)

Auxiliary Space: O(1)

public class DeleteNode {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

      /* Given a key, deletes the first
       occurrence of key in
     * linked list */
    public void deleNode(int key)
    {
        // Store node
        Node temp=head;
        Node prev=null;

        // If head node itself holds the key to be deleted
        if(temp!=null && temp.data==key)
        {
            head=temp.next;
            return ;
        }
        //Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while(temp!= null && temp.data !=key)
        {
            prev=temp;
            temp=temp.next;
        }
        // If key was not present in linked list
        if(temp== null)
        return;
         // Unlink the node from linked list
        prev.next=temp.next;
    }

    // print LL

    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        DeleteNode LList=new DeleteNode();

        // putting element and linking them
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node forth =new Node(4);
        Node fifth=new Node(5);

        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fifth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("\nThe Linked list after deleting a partincular element: ");
        LList.deleNode(3);
        LList.printLL(head);
    }
}


Output:-

The Old Linked list: 
1->2->3->4->5->Null

The Linked list after deleting a partincular element:
1->2->4->5->Null



------->Reverse a Linked List:-

Code:

public class RverseLinkedList {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    // Reverse LL

    public void reverseLL()
    {
        if(head==null || head.next==null)
        {
            return;
        }

        Node preNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=preNode;              // linking current node to previous node

            //update
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }

    // Print LL 

    public void printLL(Node haed)
    {
        if(head==null)
        {
            System.out.println("The linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        RverseLinkedList LList=new RverseLinkedList();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third= new Node(3);
        Node fourth= new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("The Reverse Linked list: ");
        LList.reverseLL();
        LList.printLL(head);
        
    }
}

Output:-

The Old Linked list: 
1->2->3->4->Null
The Reverse Linked list:
4->3->2->1->Null


--------->Delete a node by position:-

Code:-

public class deleteLLposition {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // printLL
    public void printLL(Node head){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    //delete node by position

    public void deleNode(Node position){
        Node temp=head;
        Node prev=null;
        // If head node itself holds the key to be deleted
        if(temp!=null && temp==position){
            head=temp.next;
            return ;
        }
        if(temp.next==null){
            head=null;
            return;
        }

        while(temp!=null && temp!=position){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
        return;
        prev.next=temp.next;


    }
    public static void main(String[] args) {
        deleteLLposition LList=new deleteLLposition();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("The Old Linked list: ");
        LList.printLL(head);
        
        System.out.println("\nThe Linked list after deleting a partincular node: ");
        LList.deleNode(third);
        LList.printLL(head);
    }
}

Output:-

The Old Linked list: 
1->2->3->4->Null

The Linked list after deleting a partincular node:
1->2->4->Null



--------->Write a function to delete a Linked List:---->

Algorithm For C/C++: Iterate through the linked list and delete all the nodes one by one. The main point here is not to 
access the next of the current pointer if the current pointer is deleted.

In Java, Python, and JavaScript automatic garbage collection happens, so deleting a linked list is easy. Just need to 
change head to null.

You can delete the link list by following 3 methods:

(1)	Delete from beginning
(2)	Delete from the end
(3)	Delete from middle


Delete from the beginning :

ALGORITHM:

(1)	Store the address of the first node in a pointer. 
(2)	move the head node to the next node
(3)	dispose or free memory  of the pointer node 



Code:-

public class deleteLL {
    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // delete LL 
    static void deleteLL(){
        head=null;
        return;
    }

    //printLL

    public void printLL(Node head){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        deleteLL LList=new deleteLL();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third= new Node(3);
        Node fourth= new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);


        System.out.println("Now new Linked List: ");
        LList.deleteLL();
        LList.printLL(head);
    }
}

Output:-

The Old Linked list: 
1->2->3->4->Null
Now new Linked List:
Linked list is empty




------>Size of LinkedList:-


Code:-

public class SizeofLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void printLL(Node head){
        int count=0;
        if(head==null){
            System.out.println("The Linked List is empty");
            return ;
        }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
                count++;
            }
            System.out.println("Null");
            System.out.println("The size of the Linked List="+count);  
        }
    public static void main(String[] args) {

        SizeofLL LList =new SizeofLL();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third =new Node(3);
        Node fourth=new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        LList.printLL(head);
    }
}


Output:-

1->2->3->4->Null
The size of the Linked List=4


--------->Search a Key in LL:-


Code:-

public class SearchKeyLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // check a key is present in the LL or not
    public boolean searchLL(Node head, int key){
        Node new_node=new Node(key);
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {

        SearchKeyLL LList= new SearchKeyLL();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third =new Node(3);
        Node fourth=new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println(LList.searchLL(head, 2));
    }
}

Output:-
true



---->Write a function to get Nth node and Nth Node from end in a Linked List:-


Time Complexity: O(n)

Auxiliary Space: O(1) space created for variables

Code:-

public class Find_Nth_NodeLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // find nth Node

    public int findNode(int index){
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(count==index){
                return temp.data;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }

    // Nth Node from end Method-01
    public int NthfromEnd(int endIndex){

        int count=0,index=0;
        Node temp=head;
        while(temp!=null){      // it will give size of LL
            count++;                
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if((count-index)==endIndex){
                return temp.data;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }

    //Method-02 end index

    public int NthfromEnd2(int endIndex){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len<endIndex)
        return -1;

        temp=head;
        for(int i=1;i<len-endIndex+1;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {

        Find_Nth_NodeLL LList=new Find_Nth_NodeLL();

        LList.head=new Node(100);
        Node second=new Node(200);
        Node third =new Node(300);
        Node fourth=new Node(400);

        head.next=second;
        second.next=third;
        third.next=fourth;

        int index=3;
        int ans=LList.findNode(index);
        System.out.printf("The value at index %d is %d",index,ans);

        int endIndex=2;
        int ans2=LList.NthfromEnd(endIndex);
        System.out.printf("\nThe value at index %d from end is %d",endIndex,ans2);

        int ans3=LList.NthfromEnd2(endIndex);
        System.out.printf("\nThe value at index %d from end is %d",endIndex,ans3);
    }
}



Output:-

The value at index 3 is 300
The value at index 2 from end is 300
The value at index 2 from end is 300



--------> Middle node:-

Code:- Method-01

public class MiddleNodeLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // 
    public int middlNode(Node head){
        Node temp=head;
        //Node temp2=head;
        int count=0;
        int index=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            int middle=count/2;
            if(middle==index){
                return temp.data;
            }
            index++;
            temp=temp.next;
        }
       return -1;
    }
    public static void main(String[] args) {
        MiddleNodeLL LList=new MiddleNodeLL();
        LList.head=new Node(100);
        Node second=new Node(200);
        Node third =new Node(300);
        Node fourth=new Node(400);
        Node fifth=new Node(500);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        int ans=LList.middlNode(head);
        System.out.print("The middle Node data is "+ans);
    }
}

Output:-

The middle Node data is 300

 Method-02:

Method 2: Traverse linked list using two-pointers. Move one pointer by one and the other pointers by two. 
When the fast pointer reaches the end, the slow pointer will reach the middle of the linked list.

Time Complexity: O(N), As we are traversing the list only once.
Auxiliary Space: O(1), As constant extra space is used.

Code:-

public class MiddleNodeLL02 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // Middle Node by two pointers method

    public void middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
           fast=fast.next.next;
            slow=slow.next;
        }
        System.out.print("The middle Node is: "+slow.data);
    }
    public static void main(String[] args) {

        MiddleNodeLL02 LList=new MiddleNodeLL02();

        LList.head=new Node(100);
        Node second=new Node(200);
        Node third=new Node(300);
        Node fourth=new Node(400);

        head.next=second;
        second.next=third;
        third.next=fourth;

        LList.middleNode(head);
        
    }
}

Output:-

The middle Node is: 300


Method-03:-
	Initialize the mid element as head and initialize a counter as 0. Traverse the list from the head, 
	while traversing increment the counter and change mid to mid->next whenever the counter is odd. 
	So the mid will move only half of the total length of the list. 

Time Complexity: O(N), As we are traversing the list once.
Auxiliary Space: O(1), As constant extra space is used.

Code:-

public class MiddleNode03 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void middleNode(Node head){
        Node mid=head;
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(count%2==1){
                mid=mid.next;
            }
            count++;
            temp=temp.next;
        }
        System.out.print("The middle Node is: "+mid.data);

    }
    public static void main(String[] args) {
        MiddleNode03 LList=new MiddleNode03();
        
        LList.head=new Node(100);
        Node second=new Node(200);
        Node third=new Node(300);
        Node fourth=new Node(400);

        head.next=second;
        second.next=third;
        third.next=fourth;

        LList.middleNode(head);
    }
}

Output:-
The middle Node is: 300	





234. Palindrome Linked List:-

Given the head of a singly linked list, return true if it is a palindrome.

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false



Code:-


// "static void main" must be defined in a public class.
public class Pelindrome {
    static Node head;
    
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
    
        public boolean isPelindrome(Node head){
            Stack<Integer> stk=new Stack<>();
            Node temp=head;
            while(temp!=null){
                stk.push(temp.data);
                temp=temp.next;
            }
            temp=head;
            while(temp!=null){
                if(temp.data!=(int)stk.pop()){
                    return false;
                }
                temp=temp.next;
            }
            return true;
        }
    public static void main(String[] args) {
        Pelindrome LList=new Pelindrome();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(2);
        Node fourth=new Node(1);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println(LList.isPelindrome(head));
    }
}



Output:-true