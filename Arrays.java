 
										 ---------:Arrays in Java:--------

Collection of "Similar Type of Data Types" stored in a "Contiguous Location"

Normally, an array is a collection of similar type of elements which has contiguous memory location.

Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are 
stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a 
fixed set of elements in a Java array.

Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 
1st index and so on.

Unlike C/C++, we can get the length of the array using the length member. In C/C++, we need to use the sizeof operator.

In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the 
Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java. Like C/C++, 
we can also create single dimentional or multidimentional arrays in Java.

Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.										 


Advantages:-
	(1) Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
	(2) Random access: We can get any data located at an index position.

Disadvantages:-
	Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. 
		To solve this problem, collection framework is used in Java which grows automatically.



Following are some important points about Java arrays. 

(1)	In Java, all arrays are dynamically allocated. (discussed below)

(2)	Since arrays are objects in Java, we can find their length using the object property length. 
	This is different from C/C++, where we find length using sizeof.

(3)	A Java array variable can also be declared like other variables with [] after the data type.

(4)	The variables in the array are ordered, and each has an index beginning from 0.

(5)	Java array can also be used as a static field, a local variable, or a method parameter.

(6)	The size of an array must be specified by int or short value and not long.

(7)	The direct superclass of an array type is Object.

(8)	Every array type implements the interfaces Cloneable and java.io.Serializable.		



Default Value in Arrays:-

(1) int ---> 0 
(2)	char ---> ' '
(3)	String----> Null
(4)	boolean ----> false

An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on 
the definition of the array. In the case of primitive data types, the actual values are stored in contiguous memory 
locations. In the case of class objects, the actual objects are stored in a heap segment. 


Types of Array in java:-

There are two types of array.

(1)	Single Dimensional Array
(2)	Multidimensional Array




									----------:Single Dimensional Array:-------



The general form of a one-dimensional array declaration is 

type var-name[];
OR
type[] var-name;

An array declaration has two components: the type and the name. type declares the element type of the array. 
The element type determines the data type of each element that comprises the array. Like an array of integers, 
we can also create an array of other primitive data types like char, float, double, etc., or user-defined data 
types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. 


// both are valid declarations
int intArray[]; 
or int[] intArray; 

byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];

// an array of references to objects of
// the class MyClass (a class created by
// user)
MyClass myClassArray[]; 

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection
                     // of unknown type



Although the first declaration establishes that intArray is an array variable, no actual array exists. It merely tells 
the compiler that this variable (intArray) will hold an array of the integer type. To link intArray with an actual, 
physical array of integers, you must allocate one using new and assign it to intArray. 

Instantiating an Array in Java:-
When an array is declared, only a reference of an array is created. To create or give memory to the array, 
you create an array like this: The general form of new as it applies to one-dimensional arrays appears as follows: 

						var-name = new type [size];

Here, type specifies the type of data being allocated, size determines the number of elements in the array, and 
var-name is the name of the array variable that is linked to the array. To use new to allocate an array, you must 
specify the type and number of elements to allocate.


Example: 

int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array
OR 

int[] intArray = new int[20]; // combining both statements in one


Note : 
	The elements in the array allocated by new will automatically be initialized to zero (for numeric types), 
	false (for boolean), or null (for reference types). Do refer to default array values in Java;

	Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. 
	Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. 
	Thus, in Java, all arrays are dynamically allocated.



Array Literal:-

In a situation where the size of the array and variables of the array are already known, array literals can be used. 

 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
 // Declaring array literal

The length of this array determines the length of the created array.
There is no need to write the new int[] part in the latest versions of Java.	


Each element in the array is accessed via its index. The index begins with 0 and ends at (total array size)-1. 
All the elements of array can be accessed using Java for Loop.

 // accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
  System.out.println("Element at index " + i + " : "+ arr[i]);


Code:-

// Java program to illustrate creating an array
// of integers, puts some values in the array,
// and prints each value to standard output.

class GFG
{
	public static void main (String[] args)
	{		
	// declares an Array of integers.
	int[] arr;
		
	// allocating memory for 5 integers.
	arr = new int[5];
		
	// initialize the first elements of the array
	arr[0] = 10;
		
	// initialize the second elements of the array
	arr[1] = 20;
		
	//so on...
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
		
	// accessing the elements of the specified array
	for (int i = 0; i < arr.length; i++)
		System.out.println("Element at index " + i +
									" : "+ arr[i]);		
	}
}


Output:-
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50

Time Complexity: O(n)

Auxiliary Space : O(1)


Code(2):-


public class Arrays_02 {

	public static void main(String[] args) {
		// Length of array
		int [] marks= {45,65,78,98,25,24};
		float [] score= {55.25f,45.54f,78.65f,99.24f,4.5f};
		String [] std= {"Aman","Deepak","Sooraj","Rajan"};
		
		
		System.out.println("\nLength of int marks array=" +marks.length);
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"  ");
		}
		
		System.out.println("\n\nLength of float score array="+score.length);
		for(int i=0;i<score.length;i++)
		{
			System.out.print(score[i]+"  ");
		}
		
		System.out.println("\n\nLength of String std array="+std.length);
		for(int i=0;i<std.length;i++)
		{
			System.out.print(std[i]+"   ");
		}
		
		
		// for printing array in reverse order//
		
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.print(marks[i]+"  ");
		}
		System.out.print("\n\n");
		
		for(int i=score.length-1;i>=0;i--)
		{
			System.out.print(score[i]+"  ");
		}
		System.out.print("\n\n");
		
		for(int i=std.length-1;i>=0;i--)
		{
			System.out.print(std[i]+"  ");
		}
		
		
		// for printing array by using for-each loop//
		
		for(int element:marks)
		{
			System.out.print(element+"  ");
		}
		System.out.print("\n\n");
		
		for(float element:score)
		{
			System.out.print(element+"  ");
		}
		System.out.print("\n\n");
		
		for(String element:std)
		{
			System.out.print(element+"  ");
		}
	}

}


Output:-

Length of int marks array=6
45  65  78  98  25  24  

Length of float score array=5
55.25  45.54  78.65  99.24  4.5  

Length of String std array=4
Aman   Deepak   Sooraj   Rajan   24  25  98  78  65  45  

4.5  99.24  78.65  45.54  55.25  

Rajan  Sooraj  Deepak  Aman  45  65  78  98  25  24  

55.25  45.54  78.65  99.24  4.5  

Aman  Deepak  Sooraj  Rajan  




Arrays of Objects:-

An array of objects is created like an array of primitive type data items in the following way. 

 Student[] arr = new Student[7]; //student is a user-defined class

The studentArray contains seven memory spaces each of the size of student class in which the address of seven 
Student objects can be stored. The Student objects have to be instantiated using the constructor of the Student class, 
and their references should be assigned to the array elements in the following way. 

Student[] arr = new Student[5];



Code:-

// Java program to illustrate creating
// an array of objects

class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

// Elements of the array are objects of a class Student.
public class GFG
{
	public static void main (String[] args)
	{
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[5];

		// initialize the first elements of the array
		arr[0] = new Student(1,"aman");

		// initialize the second elements of the array
		arr[1] = new Student(2,"vaibhav");

		// so on...
		arr[2] = new Student(3,"shikar");
		arr[3] = new Student(4,"dharmesh");
		arr[4] = new Student(5,"mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " +arr[i].roll_no +" "+ arr[i].name);
	}
}


Output:-

Element at 0 : 1 aman
Element at 1 : 2 vaibhav
Element at 2 : 3 shikar
Element at 3 : 4 dharmesh
Element at 4 : 5 mohit

Time Complexity: O(n)

Auxiliary Space : O(1)


What happens if we try to access elements outside the array size?

JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index. 
The index is either negative or greater than or equal to the size of an array.

Code:-

public class GFG
{
	public static void main (String[] args)
	{
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;

		for (int i = 0; i <= arr.length; i++)
			System.out.println(arr[i]);
	}
}


Runtime error 

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
    at GFG.main(File.java:12)

Output:-
10
20


										--------:Multidimensional Arrays:--------

Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays. 
These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets 
([]) per dimension. 


int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array

Code:-

public class multiDimensional
{
	public static void main(String args[])
	{
		// declaring and initializing 2D array
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

		// printing 2D array
		for (int i=0; i< 3 ; i++)
		{
			for (int j=0; j < 3 ; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
	}
}

Output:-
2 7 9 
3 6 1 
7 4 2 


Passing Arrays to Methods:-

Like variables, we can also pass arrays to methods. For example, the below program passes the array to method sum 
to calculate the sum of the array’s values.

Code:-
// Java program to demonstrate
// passing of array to method

public class Test
{
	// Driver method
	public static void main(String args[])
	{
		int arr[] = {3, 1, 2, 5, 4};
		
		// passing array to method m1
		sum(arr);
	
	}

	public static void sum(int[] arr)
	{
		// getting sum of array values
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++)
			sum+=arr[i];
		
		System.out.println("sum of array values : " + sum);
	}
}

Output:-
sum of array values : 15





Returning Arrays from Methods:-

As usual, a method can also return an array. For example, the below program returns an array from method m1. 

Code:-
// Java program to demonstrate
// return of array from method

class Test
{
	// Driver method
	public static void main(String args[])
	{
		int arr[] = m1();
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	
	}

	public static int[] m1()
	{
		// returning array
		return new int[]{1,2,3};
	}
}

Output:-
1 2 3 

Time Complexity: O(n), Auxiliary Space : O(1)


Class Objects for Arrays:-
Every array has an associated Class object, shared with all other arrays with the same component type. 

Code:-
// Java program to demonstrate
// Class Objects for Arrays

class Test
{
	public static void main(String args[])
	{
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortsArray[] = new short[3];
		
		// array of Strings
		String[] strArray = new String[3];
		
		System.out.println(intArray.getClass());
		System.out.println(intArray.getClass().getSuperclass());
		System.out.println(byteArray.getClass());
		System.out.println(shortsArray.getClass());
		System.out.println(strArray.getClass());
	}
}

Output:-

class [I
class java.lang.Object
class [B
class [S
class [Ljava.lang.String;

Explanation: 

(1)	The string “[I” is the run-time type signature for the class object “array with component type int.”
(2)	The only direct super class of an array type is java.lang.Object.
(3)	The string “[B” is the run-time type signature for the class object “array with component type byte.”
(4)	The string “[S” is the run-time type signature for the class object “array with component type short.”
(5)	The string “[L” is the run-time type signature for the class object “array with component type of a Class.” 
		The Class name is then followed.


Array Members:-

	Now, as you know that arrays are objects of a class, and a direct superclass of arrays is a class Object. 
	The members of an array type are all of the following: 

The public final field length, which contains the number of components of the array. Length may be positive or zero.
All the members inherited from class Object; the only method of Object that is not inherited is its clone method.
The public method clone(), which overrides the clone method in class Object and throws no checked exceptions.		


Array Types																	Allowed Element Types
Primitive Type Arrays							Any type which can be implicitly promoted to declared type.
Object Type Arrays								Either declared type objects or it’s child class objects.
Abstract Class Type Arrays				Its child-class objects are allowed.
Interface Type Arrays							Its implementation class objects are allowed.	



Cloning of arrays:-

When you clone a single-dimensional array, such as Object[], a “deep copy” is performed with the new array containing 
copies of the original array’s elements as opposed to references.

Code:-

// Java program to demonstrate
// cloning of one-dimensional arrays

class Test
{
	public static void main(String args[])
	{
		int intArray[] = {1,2,3};
		
		int cloneArray[] = intArray.clone();
		
		// will print false as deep copy is created
		// for one-dimensional array
		System.out.println(intArray == cloneArray);
		
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i]+" ");
		}
	}
}

Output:-
false
1 2 3 



 A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” however, which is to say that it creates 
 only a single new array with each element array a reference to an original element array, but subarrays are shared. 

 Code:-

 // Java program to demonstrate
// cloning of multi-dimensional arrays

class Test
{
	public static void main(String args[])
	{
		int intArray[][] = {{1,2,3},{4,5}};
		
		int cloneArray[][] = intArray.clone();
		
		// will print false
		System.out.println(intArray == cloneArray);
		
		// will print true as shallow copy is created
		// i.e. sub-arrays are shared
		System.out.println(intArray[0] == cloneArray[0]);
		System.out.println(intArray[1] == cloneArray[1]);
		
	}
}

Output:-

false
true
true







Array Class in Java;-

The Arrays class in java.util package is a part of the Java Collection Framework. This class provides static methods to 
dynamically create and access Java arrays. It consists of only static methods and the methods of Object class. 
The methods of this class can be used by the class name itself.


The class hierarchy is as follows: 

java.lang.Object
 ↳ java.util.Arrays

Geek, now you must be wondering why do we need java Arrays class when we are able to declare, initialize and compute 
operations over arrays. The answer to this though lies within the methods of this class which we are going to discuss 
further as practically these functions help programmers expanding horizons with arrays for instance there are often times 
when loops are used to do some tasks on an array like: 

Fill an array with a particular value.

(1)	Sort an Arrays.
(2)	Search in an Arrays.
(3)	And many more.

Here Arrays class provides several static methods that can be used to perform these tasks directly without the use of 
loops, hence forth making our code super short and optimized.


Syntax: Class declaration  

public class Arrays
    extends Object
Syntax: In order to use Arrays  

Arrays.<function name>;



Methods in Java Array Class 

The Arrays class of the java.util package contains several static methods that can be used to fill, sort, search, 
etc in arrays. Now let us discuss the methods of this class which are shown below in a tabular format as follows:



Methods 																									Action Performed
asList()												Returns a fixed-size list backed by the specified Arrays
binarySearch()									Searches for the specified element in the array with the help of the Binary Search 
																			Algorithm
binarySearch(array, fromIndex,	Searches a range of the specified array for the specified object using the Binary 
	toIndex, key, Comparator)					Search Algorithm 

compare(array 1, array 2)				Compares two arrays passed as parameters lexicographically.

copyOf(originalArray, 					Copies the specified array, truncating or padding with the default value (if necessary) 
	newLength)												so the copy has the specified length.

copyOfRange(originalArray, 			Copies the specified range of the specified array into a new Arrays.
	fromIndex, endIndex)	

deepEquals(Object[] a1, 				Returns true if the two specified arrays are deeply equal to one another.
	Object[] a2)	

deepHashCode(Object[] a) 				Returns a hash code based on the “deep contents” of the specified Arrays.

deepToString(Object[] a)				Returns a string representation of the “deep contents” of the specified Arrays.

equals(array1, array2)					Checks if both the arrays are equal or not.

fill(originalArray, fillValue)	Assigns this fill value to each index of this arrays.

hashCode(originalArray) 				Returns an integer hashCode of this array instance.

mismatch(array1, array2) 				Finds and returns the index of the first unmatched element between the two specified arrays.

parallelPrefix(originalArray, 	Performs parallelPrefix for the given range of the array with the specified functional operator.
	fromIndex, endIndex, 
	functionalOperator)	

parallelPrefix(originalArray,		Performs parallelPrefix for complete array with the specified functional operator. 
 operator)	

parallelSetAll(originalArray,		Sets all the elements of this array in parallel, using the provided generator function.
 functionalGenerator)	 

parallelSort(originalArray)			Sorts the specified array using parallel sort.

setAll(originalArray, 					Sets all the elements of the specified array using the generator function provided. 
	functionalGenerator)	

sort(originalArray)							Sorts the complete array in ascending order. 

sort(originalArray, 						Sorts the specified range of array in ascending order.
	fromIndex, endIndex)	

sort(T[] a, int fromIndex, 			Sorts the specified range of the specified array of objects according to the order
	int toIndex, Comparator				induced by the specified comparator.
	< super T> c)	


sort(T[] a, Comparator					Sorts the specified array of objects according to the order induced by the specified comparator.
	< super T> c)	
spliterator(originalArray)			Returns a Spliterator covering all of the specified Arrays.

spliterator(originalArray,			Returns a Spliterator of the type of the array covering the specified range of the specified arrays.
 fromIndex, endIndex) 				







Implementation of Methods:-


1. asList()

Code:-

// Java Program to Demonstrate Arrays Class
// Via asList() method

// Importing Arrays utility class
// from java.util package
import java.util.Arrays;

// Main class
class mains {
	
	// Main driver method
	public static void main(String[] args)
	{
		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To convert the elements as List
		System.out.println("Integer Array as List: "
						+ Arrays.asList(intArr));
	}
}

Output:-
Integer Array as List: [[I@2f4d3709]




2. binarySearch()

Code:-

// Java Program to Demonstrate Arrays Class
// Via binarySearch() method

// Importing Arrays utility class
// from java.util package
import java.util.Arrays;

// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(intArr);

		int intKey = 22;

		// Print the key and corresponding index
		System.out.println(intKey + " found at index = "+ Arrays.binarySearch(intArr, intKey));
	}
}


Output:-

22 found at index = 3





3.  binarySearch(array, fromIndex, toIndex, key, Comparator)

Code:-

// Java program to demonstrate
// Arrays.binarySearch() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		Arrays.sort(intArr);

		int intKey = 22;

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));
	}
}

Output:-
22 found at index = -4





4.compare(arr1,arr2)

Code:-

// Java program to demonstrate
// Arrays.compare() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// Get the second Array
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: "+ Arrays.compare(intArr, intArr1));
	}
}


Output:-
Integer Arrays on comparison: 1




5. compareUnsigned(array 1, array 2) 

Code:-

// Java program to demonstrate
// Arrays.compareUnsigned() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Arrays
		int intArr[] = { 10, 20, 15, 22, 35 };

		// Get the second Arrays
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: "+ Arrays.compareUnsigned(intArr, intArr1));
	}
}


Output:-
Integer Arrays on comparison: 1




6.  copyOf(originalArray, newLength) Method 

Code:-

// Java program to demonstrate
// Arrays.copyOf() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: "+ Arrays.toString(intArr));

		System.out.println("\nNew Arrays by copyOf:\n");

		System.out.println("Integer Array: "+ Arrays.toString(Arrays.copyOf(intArr, 10)));
	}
}

Output:-
Integer Array: [10, 20, 15, 22, 35]

New Arrays by copyOf:

Integer Array: [10, 20, 15, 22, 35, 0, 0, 0, 0, 0]




7.  copyOfRange(originalArray, fromIndex, endIndex) Method 

Code:-

// Java program to demonstrate
// Arrays.copyOfRange() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: "+ Arrays.toString(intArr));

		System.out.println("\nNew Arrays by copyOfRange:\n");

		// To copy the array into an array of new length
		System.out.println("Integer Array: "+ Arrays.toString(Arrays.copyOfRange(intArr, 1, 3)));
	}
}

Output:-
Integer Array: [10, 20, 15, 22, 35]

New Arrays by copyOfRange:

Integer Array: [20, 15]



8. deepEquals(Object[] a1, Object[] a2) Method 

Code:-

// Java program to demonstrate
// Arrays.deepEquals() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Arrays
		int intArr[][] = { { 10, 20, 15, 22, 35 } };

		// Get the second Arrays
		int intArr1[][] = { { 10, 15, 22 } };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: "+ Arrays.deepEquals(intArr, intArr1));
	}
}


Output:-
Integer Arrays on comparison: false




9.  deepHashCode(Object[] a) Method 

Code:-

// Java program to demonstrate
// Arrays.deepHashCode() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[][] = { { 10, 20, 15, 22, 35 } };

		// To get the dep hashCode of the arrays
		System.out.println("Integer Array: "+ Arrays.deepHashCode(intArr));
	}
}


Output:-
Integer Array: 38475344




10.  deepToString(Object[] a) Method 

Code:-

// Java program to demonstrate
// Arrays.deepToString() method

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{

		// Get the Array
		int intArr[][] = { { 10, 20, 15, 22, 35 } };

		// To get the deep String of the arrays
		System.out.println("Integer Array: "+ Arrays.deepToString(intArr));
	}
}

Output:-
Integer Array: [[10, 20, 15, 22, 35]]