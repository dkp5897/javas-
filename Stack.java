										<----------:Stack :---------->


Java Collection framework provides a Stack class that models and implements a Stack data structure. 
The class is based on the basic principle of last-in-first-out	(LIFO). In addition to the basic push and pop operations, 
the class provides three more functions of empty, search, and peek. The class can also be said to extend Vector and treats 
the class as a stack with the five mentioned functions. The class can also be referred to as the subclass of Vector.

The below diagram shows the hierarchy of the Stack class: 

			Iterable		|
			Collection		|	interface
			List			|

			Vector			|	class
			Stack 			|



			The class supports one default constructor Stack() which is used to create an empty stack 

		Declaration:

									public class Stack<E> extends Vector<E>



How to Create a Stack:

In order to create a stack, we must import java.util.stack package and use the Stack() constructor of this class. 
The below example creates an empty Stack.

									Stack<E> stack = new Stack<E>();

Here E is the type of Object.									


-------> Applications:

(1) Ctrl + Z: Undo
    Ctrl + Y: Redo


Real Life Example:
Type "devang" in keyboard, Press Ctrl + Z, and Ctrl + Y to see.



Insertion:

1
2
3
4
5: RECENT




Ctrl + Z: Undo: Last/Most Recent Operation is Reverted
Redo: Revert of Undo

Stack:

5: TOP                  4: TOP                5: TOP
4                       3                     4      
3   Ctrl + Z            2      Ctrl + Y       3
2   (5: Deleted)        1    (5: Added)       2
1                                             1

ans: 1 Stack + 1 temp variable

Use of storing in temp value ---> RESTORE (Redo Operations)


Ctrl + Z;
stack.pop();

5: Variable: temp


Ctrl + Y;
stack.push(temp);



(2) Browser History:

Github: 6:30 
Medium: 6:35
Linkedin: 6:40

History: (Reverse Chronological Order)


Linkedin
Medium
Github

- STACK


(3) Recursion


Recursion Stack: O(N) - Auxiliary Memory


void add(c)
{
    if (c==5)
        return;

    add(c+1);
}

p.s.v.m()
{
    add(1);
}



Recursion Stack: O(N) - Heap

add(5)
add(4)
add(3)
add(2)
add(1)


(4) Memory Management Techniques 

(5) Graphs:

DFS: Stacks
BFS: Queues


CODE:

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) 
    {
       Stack<Integer> s = new Stack<Integer>();
       s.push(1);
       s.push(2);
       s.push(3);	// Recent Element
       
       System.out.println("Stack: " + s); // [1 2 3: TOP]
       System.out.println("Top Value: " + s.peek());  
       System.out.println("Size: " + s.size());  
        
       System.out.println("Deleted: " + s.pop()); //3: Deleted 
       System.out.println("Size: " + s.size());  
       System.out.println("Stack: " + s); // [1 2: TOP]
        
       System.out.println("Is Empty: " + s.isEmpty()); // false
        
        System.out.println("Stack Traversal: ");
        while (!s.isEmpty())
        {
            System.out.print(s.pop() + " ");
        }
    }
}


OP:-

Stack: [1, 2, 3]
Top Value: 3
Size: 3
Deleted: 3
Size: 2
Stack: [1, 2]
Is Empty: false
Stack Traversal: 
2 1 




Complexity of Operations:

Insertion: TOP
Deletion: TOP


(1) Push - Add Item

Stack == Full
"Overflow"

CODE:
s.push(5);

TC: O(1)


(2) Pop - Delete Item

Stack == Empty
"Underflow"

CODE:
s.pop(); --> Deletes Top Most Value

TC: O(1)



(3) Peek - Top Element

CODE:
s.peek()

TC: O(1)

(4) s.isEmpty() - true/false
Empty or Not


boolean empty()
{
    return (s.peek()==null);
}

TC: O(1)


Packet of Bread:

OPEN

__5__ : TOP: PICK
__4__
__3__
__2__
__1__



Application Questions:


1 2 3 ----> Stack ---> 3 2 1

Order of Insertion of Values == Opposite of Order of Values in Stack 


Q: Reverse an Array/String

IP: "abc"
OP: "cba"


Ways?


(1) Inbuilt Functions:
    
    S.reverse(); - JAVA
    reverse(s.begin(), s.end());- C++
    A[::-1] - Py

TC: O(N)
SC: O(1)    


(2) Create Extra Array/String, Traverse from R to L

int[] b = new int[n];
for (i=n-1; i>=0; i--)
    b[i] = a[n-1-i];

TC: O(N)
SC: O(N)

(3) Swap

for (i=0; i<n/2; i++)
    swap(a[i], a[n-1-i]);

TC: O(N/2)
SC: O(1)


(4) Two Pointer:

l = a[i], r = a[n-i-1]
while (l<=r)
{
    swap(a[l], a[r]);
    l++;
    r--;
}

TC: O(N/2)
SC: O(1)

(5) Recursion

(6) Stack:

for (i: str)
    stack.push(i);
for(int i=0;i<stack.size();i++)
s.o.p.(stack.pop());

TC: O(N)
SC: O(N) - Stack




Performing various operations on Stack class
1. Adding Elements: In order to add an element to the stack, we can use the push() method. 
	This push() operation place the element at the top of the stack.


Code:-

import java.util.Stack;

public class StackPush {
    public static void main(String[] args) {
        
        Stack<Integer> stack1= new Stack<>();
        Stack<String>stack2=new Stack<>();


        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(8);  // recent element

        stack2.push("Deepak");
        stack2.push("Gudiya");
        stack2.push("Prajapati");

        System.out.println("Stack-1: "+stack1);
        System.out.println("Stack-2: "+stack2);
    }
}


Output:-

Stack-1: [2, 4, 6, 8]
Stack-2: [Deepak, Gudiya, Prajapati]



2. Accessing the Element: To retrieve or fetch the first element of the Stack or the element present at the top of 
	the Stack, we can use peek() method. The element retrieved does not get deleted or removed from the Stack. 

Code:-

import java.util.Stack;

public class StackPeak {
    public static void main(String[] args) {
        
        Stack<Integer> stack1= new Stack<>();
        Stack<String>stack2=new Stack<>();


        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(8);  // recent element

        stack2.push("Deepak");
        stack2.push("Gudiya");
        stack2.push("Prajapati");

        System.out.println("Stack-1: "+stack1);
        System.out.println("Stack-2: "+stack2);

        System.out.println("The top most element of stack-1 is: "+stack1.peek());
        System.out.println("The top most element of stack-2 is: "+stack2.peek());
    }
}


Output:-

Stack-1: [2, 4, 6, 8]
Stack-2: [Deepak, Gudiya, Prajapati]
The top most element of stack-1 is: 8
The top most element of stack-2 is: Prajapati



3. Removing Elements: To pop an element from the stack, we can use the pop() method. 
	The element is popped from the top of the stack and is removed from the same.


Code:-

import java.util.Stack;

class StackPop{
    public static void main(String[] args) {

        Stack<Integer> stack1= new Stack<>();
        Stack<String>stack2=new Stack<>();


        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(8);  // recent element

        stack2.push("Deepak");
        stack2.push("Gudiya");
        stack2.push("Prajapati");

        System.out.println("Stack-1: "+stack1);
        System.out.println("Stack-2: "+stack2);

        System.out.println("The poped or deleted element of stack-1: "+stack1.pop());
        System.out.println("The poped or deleted element of stack-2: "+stack2.pop());
        System.out.println("New Stack-1: "+stack1);
        System.out.println("New Stack-2: "+stack2);
    }
}


Output:-

Stack-1: [2, 4, 6, 8]
Stack-2: [Deepak, Gudiya, Prajapati]
The poped or deleted element of stack-1: 8
The poped or deleted element of stack-2: Prajapati
New Stack-1: [2, 4, 6]
New Stack-2: [Deepak, Gudiya]



 Methods in Stack Class :-

Methods								DESCRIPTION

empty()				It returns true if nothing is on the top of the stack. Else, returns false.

peek()				Returns the element on the top of the stack, but does not remove it.

pop()				Removes and returns the top element of the stack. An ‘EmptyStackException’ 
					An exception is thrown if we call pop() when the invoking stack is empty.

push()				Pushes an element on the top of the stack.

search()			It determines whether an object exists in the stack. If the element is found,
					It returns the position of the element from the top of the stack. Else, it returns -1.	



Note: Please note that the Stack class in Java is a legacy class and inherits from Vector in Java. It is a thread-safe 
		class and hence involves overhead when we do not need thread safety. It is recommended to use ArrayDeque for 
		stack implementation as it is more efficient in a single-threaded environment.					



// A Java Program to show implementation
// of Stack using ArrayDeque

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Deque<Character> stack = new ArrayDeque<Character>();
		stack.push('A');
		stack.push('B');
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}


Output:-

B
B



------>Reverse a stack using recursion:-

Write a program to reverse a stack using recursion. You are not allowed to use loop constructs like while, for..etc, 
and you can only use the following ADT functions on Stack S: 

  (1)  isEmpty(S) 
  (2)  push(S) 
  (3)  pop(S)



The idea of the solution is to hold all values in Function Call Stack until the stack becomes empty. When the stack 
becomes empty, insert all held items one by one at the bottom of the stack. 

For example, let the input stack be  

    1  <-- top
    2
    3
    4    
First 4 is inserted at the bottom.
    4 <-- top

Then 3 is inserted at the bottom
    4 <-- top    
    3

Then 2 is inserted at the bottom
    4 <-- top    
    3 
    2
     
Then 1 is inserted at the bottom
    4 <-- top    
    3 
    2
    1
So we need a function that inserts at the bottom of a stack using the above given basic stack function.

void insertAtBottom((): First pops all stack items and stores the popped item in function call stack using recursion. 
    And when stack becomes empty, pushes new item and all items stored in call stack.

void reverse(): This function mainly uses insertAtBottom() to pop all items one by one and insert the popped items at 
the bottom.  



Qu:- Reverse a stack:-

Code:-

import java.util.ArrayList;
import java.util.Stack;

public class ReverseStack {

    // a function that reverse the stack
    // this funcion take stack and return ArrayList

    static ArrayList<Integer> revStack(Stack<Integer>st) {
       
        ArrayList<Integer> list=new ArrayList<>();
        while(!st.empty()){
            list.add(st.peek());
            st.pop();
        }
        return list;
    }
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=5;i++){
            st.push(i);
        }

        System.out.println(st);
        
        System.out.println(revStack(st));   
    }
}

Output:-

[0, 1, 2, 3, 4, 5]
[5, 4, 3, 2, 1, 0]


Qu:- Reverse a String:-

Code:-

import java.util.Stack;

public class ReverseString {
    static String Rstring(String str){

        Stack<Character>st=new Stack<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        while(!st.empty()){
            ans+=st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abcdefgh";

        System.out.print(Rstring(s));
    }
}

Output:-

hgfedcba