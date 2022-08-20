----->String:- 


Qs. :-  What is String in Java?
		
Ans:-	Generally, String is a sequence of characters. 
		But in Java, string is an object that represents a sequence of characters. 
		The java.lang.String class is used to create a string object;


Qs. :-	How to create a string object?		

Ans:-	There are three ways to create String object:

		(1)	By Character Array
		(2) By string literal
		(3) By new keyword


(1) By Character Array:-

Code:-
		char[] ch= {'D','e','e','p','a','k'};
		String str=new String(ch);				//converting char array to string    
		System.out.print(str);



(2) By string literal:- Java String literal is created by using double quotes;

Code:-
		String str2="Deepak Kumar";
		System.out.println(str2);


	Each time you create a string literal, the JVM checks the "string constant pool" first. 
	If the string already exists in the pool, a reference to the pooled instance is returned. 
	If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

Eg.:-
	String s1="Welcome";  
	String s2="Welcome";//It doesn't create a new instance  

	In the above example, only one object will be created. 
	Firstly, JVM will not find any string object with the value "Welcome" in string constant pool that's why 
	it will create a new object. After that it will find the string with the value "Welcome" in the pool, 
	it will not create a new object but will return the reference to the same instance.



Note: String objects are stored in a special memory area known as the "string constant pool".



(3) By new keyword:-

Code:-
		String str3=new String("Pradeep");	//creating Java string by new keyword
		System.out.print(str3);


	In such case, JVM will create a new string object in normal (non-pool) heap memory, 
	and the literal "Welcome" will be placed in the string constant pool. 
	The variable s will refer to the object in a heap (non-pool).

	Code:-


		public class StringCreation {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				// Method-01
				char[] ch= {'D','e','e','p','a','k'};
				String str=new String(ch);				//converting char array to string    
				System.out.println(str);
				
				//Method-02
				
				String str2="Deepak Kumar";
				System.out.println(str2);
				
				String str3=new String("Pradeep");
				System.out.println(str3);
				
				System.out.println(str2.length());
			}

		}
		Output:-
		Deepak
		Deepak Kumar
		Pradeep
		12


write code for different methods of String like:   String.method


No.	    Method																								Description

1	char charAt(int index)		--------->	It returns char value for the particular index

2	int length()				--------->	It returns string length

3	static String format(String format, Object... args)	--------->	It returns a formatted string.

4	static String format(Locale l, String format, Object... args)--------->	It returns formatted string with given locale.

5	String substring(int beginIndex)--------->	It returns substring for given begin index.

6	String substring(int beginIndex, int endIndex)--------->	It returns substring for given begin index and end index.

7	boolean contains(CharSequence s)--------->	It returns true or false after matching the sequence of char value.

8	static String join(CharSequence delimiter, CharSequence... elements)--------->	It returns a joined string.

9	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)--------->	It returns a joined 
																									string.

10	boolean equals(Object another)--------->	It checks the equality of string with the given object.

11	boolean isEmpty()--------->	It checks if string is empty.

12	String concat(String str)--------->	It concatenates the specified string.

13	String replace(char old, char new)--------->It replaces all occurrences of the specified char value.

14	String replace(CharSequence old, CharSequence new)--------->It replaces all occurrences of the specified CharSequence.

15	static String equalsIgnoreCase(String another)--------->	It compares another string. It doesn't check case.

16	String[] split(String regex)--------->	It returns a split string matching regex.

17	String[] split(String regex, int limit)--------->	It returns a split string matching regex and limit.

18	String intern()--------->	It returns an interned string.

19	int indexOf(int ch)--------->	It returns the specified char value index.

20	int indexOf(int ch, int fromIndex)--------->	It returns the specified char value index starting with given index.

21	int indexOf(String substring)--------->	It returns the specified substring index.

22	int indexOf(String substring, int fromIndex)--------->	It returns the specified substring index starting with given index.

23	String toLowerCase()	--------->It returns a string in lowercase.

24	String toLowerCase(Locale l)--------->	It returns a string in lowercase using specified locale.

25	String toUpperCase()--------->	It returns a string in uppercase.

26	String toUpperCase(Locale l)--------->	It returns a string in uppercase using specified locale.

27	String trim()--------->	It removes beginning and ending spaces of this string.

28	static String valueOf(int value)--------->	It converts given type into string. It is an overloaded method.




Immutable String in Java:-

String objects are immutable. Immutable simply means unmodifiable or unchangeable.
Once String object is created its data or state can't be changed but a new String object is created.

Code:-

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Sachin";  
		s.concat(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(s);//will print Sachin because strings are immutable objects  
	}
}

Oouput:-
		Sachin

Explaination:-
				Now it can be understood by the diagram given below. 
				Here Sachin is not changed but a new object is created with Sachin Tendulkar. 
				That is why String is known as immutable.


		"heap[String constant pool {s (Sachin), (Sachin Tendulkar)}]"				


As you can see in the above figure that two objects are created but s reference variable still 
refers to "Sachin" not to "Sachin Tendulkar".

But if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object.

Code:-

class Testimmutablestring1{  
 public static void main(String args[]){  
   String s="Sachin";  
   s=s.concat(" Tendulkar");  
   System.out.println(s);  
 }  
}  

Oouput:-
			Sachin Tendulkar

In such a case, s points to the "Sachin Tendulkar". Please notice that still Sachin object is not modified.



Qs. :- Why String objects are immutable in Java?

Ans:-
		As Java uses the concept of String literal. Suppose there are 5 reference variables, 
		all refer to one object "Sachin". If one reference variable changes the value of the object, 
		it will be affected by all the reference variables. That is why String objects are immutable in Java.




------>Java String compare:-

We can compare strings in java on the basis of content and reference

It is used in authentication (by equals() method), sorting (by compareTo() method), 
reference matching (by == operator) etc.



There are three methods to compare the strings.... 

(1) By Using equals() Method
(2) By Using == Operator
(3) By compareTo() Method



(1) By Using equals() Method:-

		The String class equals() method compares the original content of the string.
		It compares values of string for equality. String class provides the following two methods:

		(a) public boolean equals(Object another) compares this string to the specified object.
		(b) public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.

		Code:-

		public class StringCompare {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				// Method -01 By Using equals() Method
				
				String str1="Deepak";
				String str2="Deepak";
				String str3=new String("Deepak");
				String str4="Pradeep";
				System.out.println(str1.equals(str2));	//true
				System.out.println(str2.equals(str3));	//true
				System.out.println(str3.equals(str4));	//false
			}
		}

		Oouput:-
		true
		true
		false

		Explaination:-
				In the above code, two strings are compared using equals() method of String class. 
				And the result is printed as boolean values, true or false.

		Code:-


		public class StringCompare {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String s1="Deepak";
				String s2="DEEPAK";
				System.out.println(s1.equals(s2));			// false
				System.out.println(s1.equalsIgnoreCase(s2));// true
			}
		}

		Oouput:-
		false
		true

		Explaination:-
				In the above program, the methods of String class are used. 
				The equals() method returns true if String objects are matching and both strings are of same case. 
				equalsIgnoreCase() returns true regardless of cases of strings.




(2) By Using == Operator:- The == operator compares references not values.

		Code:-

		public class StringCompare {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				// Method -02 By using == Operator
				
				String s3="Deepak";
				String s4="Deepak";
				String s5=new String("Deepak");
				System.out.println(s3==s4);		//true (because both refer to same instance)
				System.out.println(s4==s5);		//false(because s3 refers to instance created in nonpool)  
			}
		}

		Oouput:-
		true
		false




(3) By Using compareTo() method:-
		The String class compareTo() method compares values lexicographically and returns an integer value 
		that describes if first string is less than, equal to or greater than second string.

		Suppose s1 and s2 are two String objects. If:

		s1 == s2 : The method returns 0.
		s1 > s2 : The method returns a positive value.
		s1 < s2 : The method returns a negative value.

		Code:-


		public class StringCompare {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//(3) By Using compareTo() method
				String st1="Deepak";
				String st2="Deepak";
				String st3=new String("Priyansh");
				String st4="Pradeep";
				System.out.println(st1.compareTo(st2));// 0 Because there is no difference
				System.out.println(st2.compareTo(st3));// -12 Because D is less than 12 times of P
				System.out.println(st3.compareTo(st4));// 8 Because i is greater than 8 times of a
			}
		}
		Output:-
		0
		-12
		8


		All Code:-



		public class StringCompare {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				// Method -01 By Using equals() Method
				
				String str1="Deepak";
				String str2="Deepak";
				String str3=new String("Deepak");
				String str4="Pradeep";
				System.out.println(str1.equals(str2));	//true
				System.out.println(str2.equals(str3));	//true
				System.out.println(str3.equals(str4));	//false
				
				String s1="Deepak";
				String s2="DEEPAK";
				System.out.println(s1.equals(s2));			// false
				System.out.println(s1.equalsIgnoreCase(s2));// true
				
				
				
				// Method -02 By using == Operator
				
				String s3="Deepak";
				String s4="Deepak";
				String s5=new String("Deepak");
				System.out.println(s3==s4);		//true (because both refer to same instance)
				System.out.println(s4==s5);		//false(because s3 refers to instance created in nonpool)  
				
				
				//(3) By Using compareTo() method
				String st1="Deepak";
				String st2="Deepak";
				String st3=new String("Priyansh");
				String st4="Pradeep";
				System.out.println(st1.compareTo(st2));// 0 Because there is no difference
				System.out.println(st2.compareTo(st3));// -12 Because D is less than 12 times of P
				System.out.println(st3.compareTo(st4));// 8 Because i is greater than 8 times of a
			}
		}

		Output:-
		true
		true
		false
		false
		true
		true
		false
		0
		-12
		8





------->String Concatenation in Java(String Addition/Combination):-

In Java, String concatenation forms a new String that is the combination of multiple strings. 
There are two ways to concatenate strings in Java:

(1) By + (String concatenation) operator
(2) By concat() method

(1)String Concatenation by + (String concatenation) operator:-

			Java String concatenation operator (+) is used to add strings.


			Code:-


			
			public class StringConcatenation {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					
					String str1="Deepak";
					String str2=" Kumar";
					String str3 =str1+str2;
					System.out.println(str3);
					System.out.println(str1+str2);
					System.out.println(str3+str1);
					System.out.println("Pradeep"+" Kumar");
					String s="Sachin"+" Tendulkar";  
					System.out.println(s);//Sachin Tendulkar  

				}
			}


			Output:-
			Deepak Kumar
			Deepak Kumar
			Deepak KumarDeepak
			Pradeep Kumar
			Sachin Tendulkar

			java compilar transform Line no. 443 code to ...

			String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();												                     		
			
			In Java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method. 
			String concatenation operator produces a new String by appending the second operand onto the end of the first operand. 
			The String concatenation operator can concatenate not only String but primitive values also.	


			Code:-

			class TestStringConcatenation2{  
		  public static void main(String args[]){  
		   String s=50+30+"Sachin"+40+40;  
		   System.out.println(s);//80Sachin4040  
		 }  
		}  

		Output:-

		80Sachin4040


Note: After a string literal, all the + will be treated as string concatenation operator.



(2) By concat() method:-

		The String concat() method concatenates the specified string to the end of current string. Syntax:

		public String concat(String another)  

		Code:-


			public class StringConcatenation {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					
					// method-02 By using concat()
					String s1="Deepak";
					String s2=" Kumar";
					System.out.println(s1.concat(s2));

				}
			}

			Output:-
			Deepak Kumar



There are some other possible ways to concatenate Strings in Java

1. String concatenation using StringBuilder class

		StringBuilder is class provides append() method to perform concatenation operation. 
		The append() method accepts arguments of different types like Objects, StringBuilder, int, char,CharSequence, boolean, 
		float, double; 

		"StringBuilder is the most popular and fastet way to concatenate strings in Java." 
		It is mutable class which means values stored in StringBuilder objects can be updated or changed.


		Code:-

		public class strBuilder {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				StringBuilder s1= new StringBuilder("Deepak");
				StringBuilder s2= new StringBuilder(" Kumar");
				
				StringBuilder s= s1.append(s2);
				System.out.println(s.toString());
			}
		}

		Output:-
		Deepak Kumar

		Explaination:-In the above code snippet, s1, s2 and s are declared as objects of StringBuilder class. 
									s stores the result of concatenation of s1 and s2 using append() method.



2. String concatenation using format() method:-

		String.format() method allows to concatenate multiple strings using format specifier 
		like %s followed by the string values or objects.

		Code:-


		public class StrFormat {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String s1= new String("Hello");
				String s2 =new String(" Deepak");
				String s= String.format("%s%s",s1,s2);
				System.out.print(s.toString());
			}
		}

		Output:-
		Hello Deepak



3. String concatenation using String.join() method (Java Version 8+):-

		The String.join() method is available in Java version 8 and all the above versions. 
		String.join() method accepts arguments first a separator and an array of String objects.


		Code:-

		public class StrJoin {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String s1= new String("Hello");
				String s2 =new String(" Pradeep");
				String s= String.join("",s1,s2);
				System.out.println(s.toString());

			}

		}

		Output:-
		Hello Pradeep

		Explaination:- In the above code snippet, the String object s stores the result of String.join("",s1,s2) method. 
									 A separator is specified inside quotation marks followed by the String objects or array of String objects.


4. String concatenation using StringJoiner class (Java Version 8+):-

		StringJoiner class has all the functionalities of String.join() method. 
		In advance its constructor can also accept optional arguments, prefix and suffix.


		Code:-

		import java.util.StringJoiner;

		public class StrJoiner {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//4. String concatenation using StringJoiner class (Java Version 8+)
				
				StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
				s.add("Hello");    		//String 1   
				s.add("Priyansh");    //String 2  
				System.out.println(s.toString());  //Displays result  
			}
		}

		Output:-

		Hello, Priyansh

		Explaination:-In the above code snippet, the StringJoiner object s is declared and the constructor StringJoiner() 
									accepts a separator value. 
									A separator is specified inside quotation marks. The add() method appends Strings passed as arguments.



-------->substring in Java:-

		A part of String is called substring. In other words, substring is a subset of another String. 
		Java String class provides the built-in substring() method that extract a substring from the given string 
		by using the index values passed as an argument. In case of substring() method startIndex is inclusive and 
		endIndex is exclusive.

		Suppose the string is "computer", then the substring will be com, compu, ter, etc.

		Note: Index starts from 0.

		You can get substring from the given String object by one of the two methods:

		(1) public String substring(int startIndex):-
				This method returns new String object containing the substring of the given string from specified 
				startIndex (inclusive). The method throws an IndexOutOfBoundException when the startIndex is larger than 
				the length of String or less than zero.

		(2) public String substring(int startIndex, int endIndex):-
				This method returns new String object containing the substring of the given string from specified 
				startIndex to endIndex. The method throws an IndexOutOfBoundException when the startIndex is less 
				than zero or startIndex is greater than endIndex or endIndex is greater than length of String.


		In case of String:

		startIndex: inclusive
		endIndex: exclusive


		Let's understand the startIndex and endIndex by the code given below.

		Code:-


			public class SubString {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					
					String str="Deepak";
					String str2="Kumar";
					System.out.println(str);
					System.out.println(str.substring(0,3));	// return Dee as a SunbString
				}
			}
				
			Output:-
			Deepak
			Dee

			Explaination:-
										In the above substring, 0 points the first letter and 2 points the second letter i.e., 
										e (because end index is exclusive).


			Example of Java substring() method:-
			
			TestSubstring.java

			public class TestSubstring{    
			 public static void main(String args[]){    
			 String s="SachinTendulkar";    
			 System.out.println("Original String: " + s);  
			 System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
			 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  
			 }  
			}   

			Output:-

			Original String: SachinTendulkar
			Substring starting from index 6: Tendulkar
			Substring starting from index 0 to 6: Sachin				

			demonstrates variants of the substring() method of String class. 
			The startindex is inclusive and endindex is exclusive.	





-------->Java String Class Methods:-


		The java.lang.String class provides a lot of built-in methods that are used to manipulate string in Java. 
		By the help of these methods, we can perform operations on String objects such as trimming, concatenating, 
		converting, comparing, replacing strings etc.

		Java String is a powerful concept because everything is treated as a String if you submit any form 
		in window based, web based or mobile application.

		Let's use some important methods of String class.		


(1)Java String toUpperCase() and toLowerCase() method:-

		The Java String toUpperCase() method converts this String into uppercase letter and 
						 String toLowerCase() method into lowercase letter.		

		Code:-

		public class UpperLowerCases {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String s1="Deepak Kumar";
				String s2="Pradeep Kumar";
				System.out.println(s1.toUpperCase());	// convert all to upper case 
				System.out.println(s2.toLowerCase());	// convert all to lower case 
			}
		}

		Output:-
		DEEPAK KUMAR
		pradeep kumar



(2) Java String trim() method:-

		The String class trim() method eliminates white spaces before and after the String.

		Code:-

		public class TrimString {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String str=" Deepak ";
				String str2="Kumar";
				System.out.println(str);
				System.out.println(str.trim());// print with triming extra space
				System.out.println(str2.trim());
			}
		}



(3)Java String startsWith() and endsWith() method:-

		The method startsWith() checks whether the String starts with the letters passed as arguments and endsWith() 
		method checks whether the String ends with the letters passed as arguments.		

		Code:-


		public class StrartEndWith {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String s1="Deepak Kumar";
				String s2="Pradeep Kumar";
				System.out.println(s1.startsWith("D"));
				System.out.println(s1.endsWith("k"));
				System.out.println(s2.endsWith("ar"));
				System.out.println(s2.startsWith("p"));	// fasle b/c it start with 'P' not 'p'
			}
		}

		Output:-

		true
		false
		true
		false



(4) Java String charAt() Method:-

		The String class charAt() method returns a character at specified index.	

		Code:-


		public class charAtString {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String str="Deepak";
				String str2="Kumar";
				
				System.out.println(str.charAt(1));		// e
				System.out.println(str.charAt(4));		// a
				System.out.println(str2.charAt(0));		// K
				System.out.println(str2.charAt(3));		// a
				
			}
		}

		Output:-

		e
		a
		K
		a



(5) Java String intern() Method:-

		A pool of strings, initially empty, is maintained privately by the class String.

		When the intern method is invoked, if the pool already contains a String equal to this String object as 
		determined by the equals(Object) method, then the String from the pool is returned. Otherwise, 
		this String object is added to the pool and a reference to this String object is returned.


		Code:-


		public class StringIntern {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String s= new String("Deepak");
				String s2=s.intern();		// it insert the content of s into s2
				System.out.println(s);
				System.out.println(s2);
				//System.out.println(s.concat(s2));
			}
		}

		Output:-
		Deepak
		Deepak



(6) Java String valueOf() Method:-

		The String class valueOf() method coverts given type such as int, long, float, double, boolean, 
		char and char array into String.

		Code:-


		public class StrValueOf {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int a=15;
				long b=400;
				boolean c=true;
				
				String s1= String.valueOf(a);	// it convert int into string
				System.out.println(s1+10);		// 1510 b/c it is String addition
				
				String s2= String.valueOf(b);
				System.out.println(s2+"avg");	//400avg
				
				String s3= String.valueOf(c);
				System.out.println(s3+21);		//true21
			}
		}

		Output:-

		1510
		400avg
		true21



(7) Java String replace() Method:-

		The String class replace() method replaces all occurrence of first sequence of character with second 
		sequence of character.

		Code:-

		public class StrReplace {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String s1="Java is a programming language. Java is a platform. Java is an Island";
				String rString=s1.replace("Java","Kava");
				System.out.println(rString);
				System.out.println(rString.replace("Kava", "Java"));
			}
		}

		Output:-

		Kava is a programming language. Kava is a platform. Kava is an Island
		Java is a programming language. Java is a platform. Java is an Island






------->Java StringBuffer Class:-

		Java StringBuffer class is used to create mutable (modifiable) String objects. 
		The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.

		Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. 
					So it is safe and will result in an order.


	Important Constructors of StringBuffer Class:

	Constructor																									Description

	StringBuffer()													It creates an empty String buffer with the initial capacity of 16.
	StringBuffer(String str)								It creates a String buffer with the specified string..
	StringBuffer(int capacity)							It creates an empty String buffer with the specified capacity as length.



 
	Important methods of StringBuffer class:


	public, synchronized StringBuffer:


		Method																																	Description

		append(String s)											It is used to append the specified string with this string. 
																					The append() method is overloaded like append(char), append(boolean), 
																					append(int), append(float), append(double) etc.


		insert(int offset, String s)					It is used to insert the specified string with this string at the specified 
																					position. The insert() method is overloaded like insert(int, char), 
																					insert(int, boolean), insert(int, int), insert(int, float), 
																					insert(int, double) etc.


		replace(int startIndex, 
						int endIndex, String str)			It is used to replace the string from specified startIndex and endIndex.


		delete(int startIndex, int endIndex)	It is used to delete the string from specified startIndex and endIndex.	


		reverse()															is used to reverse the string.


		capacity()	(public int)							It is used to return the current capacity.


		ensureCapacity(int minimumCapacity)		It is used to ensure the capacity at least equal to the given minimum.
								(public void)


		charAt(int index)		(public char)			It is used to return the character at the specified position.


		length()				(public int )					It is used to return the length of the string i.e. total number of characters.


		substring(int beginIndex)							It is used to return the substring from the specified beginIndex.
								(public String)


		substring(int beginIndex, 
							int endIndex)								It is used to return the substring from the specified beginIndex and endIndex.
					(public String)




	Qs.:-	What is a mutable String?

				A String that can be modified or changed is known as mutable String. 
				StringBuffer and StringBuilder classes are used for creating mutable strings.


		(1) StringBuffer Class append() Method:-
		
		The append() method concatenates the given argument with this String.		

		Code:-


		public class MutableString {

			public static void main(String[] args) {
				
				//(1) StringBuffer Class append() Method
				
				StringBuffer sb =new StringBuffer("Deepak");
				sb.append(" Kumar");		//now original string is changed  
				System.out.println(sb);
				sb.append(" Prajapati");
				System.out.println(sb);
			}
		}

		Output:-
		Deepak Kumar
		Deepak Kumar Prajapati


		(2) StringBuffer insert() Method:-

		The insert() method inserts the given String with this string at the given position.


		public class MutableString {

			public static void main(String[] args) {
				
				//2) StringBuffer insert() Method
				
				StringBuffer sb2=new StringBuffer("Hello");
				sb2.insert(2, " Deepak");	// it insert Deepak into sb2 at 2 position
				System.out.println(sb2);
			}
		}

		Output:-
		He Deepakllo

		(3) StringBuffer replace() Method:-

		The replace() method replaces the given String from the specified beginIndex and endIndex.

		Code:-

		public class MutableString {

			public static void main(String[] args) {
				
				//3) StringBuffer replace() Method
				
				StringBuffer sb3=new StringBuffer("Pradip");
				sb3.replace(4, sb3.length(),"eep");
				System.out.println(sb3);
			}
		}
		Output:-
		Pradeep


		(4) StringBuffer delete() Method:-

		The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex

		Code:-

		public class MutableString {

			public static void main(String[] args) {
				
				//4) StringBuffer delete() Method
				
				StringBuffer sb4=new StringBuffer("Priyansh");
				sb4.delete(5, sb4.length());
				System.out.println(sb4);	
			}
		}

		Output:-
		Priya

		(5) StringBuffer reverse() Method:-

		The reverse() method of the StringBuilder class reverses the current String.

		Code:-

		public class MutableString {

			public static void main(String[] args) {
				
				StringBuffer sb5 =new StringBuffer("Divyansh");
				sb5.reverse();
				System.out.println(sb5);
				
			}
		}

		Output:-
		hsnayviD

		(6) StringBuffer capacity() Method:-
		The capacity() method of the StringBuffer class returns the current capacity of the buffer. 
		The default capacity of the buffer is 16. If the number of character increases from its current capacity, 
		it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.)

		Code:-


		public class MutableString {

			public static void main(String[] args) {
				
				//6) StringBuffer capacity() Method
				
				StringBuffer sb6=new StringBuffer("");
				System.out.println(sb6.capacity());// Default capacity=16
				sb6.append("Hello");
				System.out.println(sb6.capacity());// now capacity=16
				sb6.append(" I am Deepak Kumar");
				System.out.println(sb6);
				System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
				
			}
		}

		Output:-
		16
		16
		Hello I am Deepak Kumar
		34


		(7) StringBuffer ensureCapacity() method
		The ensureCapacity() method of the StringBuffer class ensures that the given capacity is the minimum 
		to the current capacity. If it is greater than the current capacity, it increases the capacity 
		by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.)

		Code:-

		public class MutableString {

			public static void main(String[] args) {
				
				//(7) StringBuffer ensureCapacity() method
				
				StringBuffer sb7=new StringBuffer("");
				System.out.println(sb7.capacity());		// Default capacity=16
				sb7.append("Varya");
				System.out.println(sb7.capacity());// now capacity=16
				sb7.append(" will become a Doctor");
				System.out.println(sb7.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
				sb7.ensureCapacity(10);
				System.out.println(sb7.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
				sb7.ensureCapacity(50);
				System.out.println(sb7.capacity());// now (34*2)+2=70 i.e (oldcapacity*2)+2
			}
		}

		Output:-
		16
		16
		34
		34
		70



-------> Java StringBuilder Class:-

		Java StringBuilder class is used to create mutable (modifiable) String. 
		The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. 
		It is available since JDK 1.5.		


		Every Methods of StringBuffer class is same as StringBuffer class except synchronizing property of StringBuffer class.



-------> Difference between StringBuffer and StringBuilder:-

		Java provides three classes to represent a sequence of characters: String, StringBuffer, and StringBuilder. 
		The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable. 
		There are many differences between StringBuffer and StringBuilder. 
		The StringBuilder class is introduced since JDK 1.5.



		No.	                     StringBuffer	                                    StringBuilder

		(1)			StringBuffer is synchronized i.e. thread safe. 				StringBuilder is non-synchronized i.e. not thread safe. 
						It means two threads can't call the methods of 				It means two threads can call the methods of 
						StringBuffer simultaneously.													StringBuilder simultaneously.

		(2)			StringBuffer is less efficient than StringBuilder.		StringBuilder is more efficient than StringBuffer.	

		(3)			StringBuffer was introduced in Java 1.0								StringBuilder was introduced in Java 1.5			


		Code:-

		//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
		public class ConcatTest{  
		    public static void main(String[] args){  
		        long startTime = System.currentTimeMillis();  
		        StringBuffer sb = new StringBuffer("Java");  
		        for (int i=0; i<10000; i++){  
		            sb.append("Tpoint");  
		        }  
		        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
		        startTime = System.currentTimeMillis();  
		        StringBuilder sb2 = new StringBuilder("Java");  
		        for (int i=0; i<10000; i++){  
		            sb2.append("Tpoint");  
		        }  
		        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
		    }  
		}  
		Output:

		Time taken by StringBuffer: 16ms
		Time taken by StringBuilder: 0ms











Interview Question and Answer:---

1. What is String in Java? Is it a datatype?

		The string is a final class in Java defined in java.lang package. You can assign a sequence of characters 
		to a string variable. For example String name = "Gaurav";

		No, String is not a datatype like int, char, or long.

		When you assign a sequence of character to String variable, you are creating a string object.

		Every String literal is an instance of the String class, and its value can not be changed.


2. What is the difference between String in C language and String in Java?

		String in Java and C is completely different. In ‘C’ language String is a null-terminated character array.

		In the image given below, I have shown the structure of the string in C and Java.

		The string is more abstract in Java.

		The string class comes with java.lang package and has lots of predefined methods that a programmer 
		can use to operate on a string or get information about a String.

		So String is more feature-rich in Java than C.

3. What is the String pool in Java?

		The String pool is a special type of memory maintained by the JVM.

		String pool is used to store unique string objects.

		When you assign the same string literal to different string variables, JVM saves only one copy of the 
		String object in the String pool, and String variables will start referring to that string object.

		I have shown the pictorial explanation of the above sentence in the following diagram.
		The purpose of maintaining this special type of memory is memory optimization.


4. Why String is immutable?

		In most of the Java Interviews, you will face this question. Why do you think Java language designers kept 
		string immutable?

		You can give the following reasons.

		Java String pool is possible because the String is immutable.

		If you assign the same string literal to many string variables, JVM will save only one copy of the 
		string object in the Java string pool, and these variables will start referring to that string object.

		If you were not asked about the String pool before this question, please give a little background about 
		the string pool concept in Java. Please refer to the previous question.

		Also, another reason can be Security. We know that almost every Java program contains a string, 
		and it is used to save important data like usernames and passwords. So it should not be changed in-between. 
		Otherwise, there will be a security problem.		


5. How many objects will be created from the following code?

String firstString = "Gaurav";
String secondString = "Gaurav";
String thirdString =  new String("Gaurav");

		By seeing the above code, only two string objects will be created. The first two variables will refer to the 
		same string object with the value "Gaurav". JVM uses the string pool concept to store only one copy of duplicate 
		string objects to string constant pool.

		But when we use a new keyword to create a new string, a new string object will be created and stored in the 
		Java heap memory.

		So for the third variable thirdString, a new string object will be created and stored in a Java heap space.

		So there will be a total of two objects, one from the Java string pool and one from the Java heap memory.

		Below, I have shown these two objects in the following diagram.


6. What is the intern() method?

		intern() method is used to add the unique copy of the string object to the Java string pool manually.

		We know, when we create a string using a new keyword, it will be stored in the heap memory.

		We can store the unique copy of that string object in the Java string pool using the intern() method.

		When you do such a thing, JVM will check if the string object with the same value is present in the string pool or not.

		If a string object with the same value is present, JVM will simply provide the reference of that object to the 
		respective string variable.

		If a string object with the same value is not present in the string pool, JVM creates a string object with the 
		same value in the String pool and returns its reference to the string variable.		


7. What is the difference between the String and StringBuffer?

		The String is a final class in Java. The String is immutable. That means we can not change the value of the 
		String object afterword.

		Since the string is widely used in applications, we have to perform several operations on the String object. 
		Which generates a new String object each time, and all previous objects will be garbage object putting the 
		pressure on the Garbage collector.

		Hence, the Java team introduced the StringBuffer class. It is a mutable String object, which means you can 
		change its value.

		The string is immutable, but the StringBuffer is mutable.


8. What is the difference between the StringBuffer and StringBuilder?

		We know String is immutable in Java. But using StringBuffer and StringBuilder, you can create editable string objects.

		When Java Team realizes the need for the editable string object, they have introduced the StringBuffer class. 
		But all the methods of the StringBuffer class are synchronized. That means at a time, only one thread can access 
		a method of the StringBuffer.

		As a result, it was taking more time.

		Latter, Java Team realizes that making all methods of the StringBuffer class synchronized was not a good idea, 
		and they introduced a StringBuilder class. None of the methods of the StringBuilder class are synchronized.

		Since all the methods of the StringBuffer class are synchronized, StringBuffer is thread-safe, slower, 
		and less efficient as compared to StringBuilder.

		Since none of the methods of the StringBuilder class is synchronized, StringBuilder is not thread-safe, 
		faster, and efficient as compared to StringBuffer.

		Also, you can check my detailed article on difference between theStringBuffer and StringBuilder.				


9. Can we compare String using the == operator? What is the risk?

		Yes, of course, we can compare String using the == operator. But when we are comparing string using the == operator, 
		we are comparing their object reference, whether these string variables are pointing towards the same string object or 
		not.

		Most of the time, developers want to compare the content of the strings, but mistakenly they compare strings with == 
		operator, instead of equals() method, which leads to an error.

		Below, I have given a program, which shows the string comparison using the == operator and equals() method.

		Java
		/*
		 * A java program showing the string comparison
		 * using equals to operator ( == ).
		 */
		public class StringCompareUsingEqualsOperator {

			public static void main(String[] args) {
				
				String firstString = "Gaurav";
				String secondString = "Gaurav";
				
				String thirdString =  new String("Gaurav");
				
				System.out.print("Case 1 : ");
				System.out.println(firstString == secondString); // true
				
				System.out.print("Case 2 : ");
				System.out.println(firstString == thirdString); // false
				
				// Comparing strings using equals() method
				System.out.print("Case 3 : ");
				System.out.println(firstString.equals(thirdString)); // true
			}

		}

		Output:-

		Case 1 : true
		Case 2 : false
		Case 3 : true

		In ‘case 1,’ we are comparing firstString and secondString using the equals to operator (==), 
		since both the variables are pointing towards the same string object, it will print true.

		In ‘case 2,’ we are comparing firstString and thirdString using the equals to operator i.e. == since both 
		the variables are not pointing towards the same string object, it will print false.

		You can see, for thirdString, we are using the new keyword, which creates a new object in Java heap memory.

		In ‘case 3,’ we are comparing firstString and thirdString using equals() method. Even if both are the different 
		string object, it has the same content hence it is printing true.


10. What are the ways to compare string?

		We can compare strings using the equals() method, == operator and compareTo() method.

		When we compare strings using the equals() method, we are comparing the content of the strings, whether these strings have the same content or not.

		When we compare strings using the == operator, we are comparing the reference of the string, whether these variables are pointing to the same string object or not.

		Also, we can compare string lexicographically (comparing strings by alphabetical order). We can use the compareTo() method to compare the strings lexicographically.

		compareTo() method returns a negative integer, 0, or a positive integer.	

		firstString.compareTo(secondString)
		If firstString is less than the secondString, it will return a negative integer. i.e firstString < secondString → returns a negative integer

		If firstString is equal to the secondString it will return zero. i.e firstString == secondString → returns zero

		If firstString is greater than the secondString, it will return a positive integer. i.e firstString > secondString → returns a positive integer

		If you want to check string comparison in detail, please consider visiting this article.	


11. What is the use of the substring() method?

		The substring() method in Java returns a ‘substring’ of the specified string.

		The creation of the substring depends on the parameter passed to the substring() method.

		There are two variants of the Substring method.

		substring(int beginIndex)
		substring(int beginIndex, int endIndex)
		In the first method, we are just giving beinIndex parameter, while in the second variant 
		we are giving both beginIndex and endIndex.

		For the first variant, substring will be created from the beginIndex (inclusive) to the last character of the string.

		For the second variant, substring will be created from the beginIndex (inclusive) to the endIndex (exclusive).

		See the following diagram to understand substring() method.

		In the first diagram, I have the first variant of the substring() method.

		String name = "Gaurav Kukade";
		String result = name.substring(4);

		System.out.println(result); // it will print "av kukade"
		1
		2
		3
		4
		String name = "Gaurav Kukade";
		String result = name.substring(4);
		 
		System.out.println(result); // it will print "av kukade"


12. How to check if the String is empty?
		Java String class has a special method to check if the string is empty or not.

		isEmpty() method internally checks if the length of the string is zero. If it is zero, that means 
		the string is empty, and the isEmpty() method will return true.

		If the length of the string is not zero, then the isEmpty() method will return false.

13. What is the format() method in Java String? What is the difference between the format() method and 
		the printf() method?
		format() method and printf() method both format the string. The only difference is that the format() 
		method returns the formatted string, and the printf() method prints the formatted string.

		So when you want the formatted string to use in the program. you can use the format method. And when you 
		want to just print the formatted string, you can use the printf() method.

14. Can you say String is ‘thread-safe’ in Java?

		Youes, we can say that the string is thread-safe.

		As we know, String is immutable in Java. That means once we created a string, we can not modify it afterword. 
		Hence there is no issue of multiple threads accessing a string object.

15. Why most of the time string is used as HashMap key?

		The string is immutable. So one thing is fixed that it will not be changed once created.

		Hence the calculated hashcode can be cached and used in the program. This will save our effort for 
		calculating the hashcode again and again. So, a string can be used efficiently than other HashMap key objects.		


16. Can you convert String to Int and vice versa?

		Yes, you can convert string to int and vice versa.

		You can convert string to an integer using the valueOf() method and the parseInt() method of the Integer class.

		Also, you can convert an integer to string using the valueOf() method of the String class.

		Below, I have given a program which shows the string to integer and integer to string conversion.

		/*
		 * A Java program to convert String to Integer and vice versa.
		 * 
		 * We are using the valueOf() method and parseInt() method of
		 * the wrapper classes.
		 * 
		 */
		public class Conversion{
			public static void main(String [] args){
				
				String str = "1254";
				
				int number = 7895;
				
				// convert string to int using Integer.parseInt() method
				int parseIntResult1 = Integer.parseInt(str);
				
				// convert string to int using Integer.valueOf() method
				int valueOfResult1 = Integer.valueOf(str);
				
				System.out.println("Converting String to Integer:");
				System.out.println("Using the Integer.parseInt() method : "+parseIntResult1);
				System.out.println("Using the Integer.valueOf() method : "+valueOfResult1);
				
				System.out.println("\n");
				// convert integer to string using String.valueOf() method
				String valueOfResult2 = String.valueOf(number);
				
				System.out.println("Converting Integer to String :");
				System.out.println("Using the String.valueOf() method : "+valueOfResult2);

			}
		}

Output:-
		Converting String to Integer:
		Using the Integer.parseInt() method : 1254
		Using the Integer.valueOf() method : 1254
		 
		 
		Converting Integer to String :
		Using the String.valueOf() method : 7895


17. What is the split() method?

		The split method is used to split the string based on the provided regex expression.

		The Signature of the split method is

		public String[] split(String regex)
		1
		public String[] split(String regex)
		This method will return an array of the split substrings.

		/*
		 * A Java program showing the uses of split method.
		 * 
		 */
		public class SplitExample {

			public static void main(String[] args) {
				String name = "My, name, is ,Gaurav!";

						String [] substringArray = name.split(",");
						
						for(String substring : substringArray) {
							System.out.print(substring);
						}
			}
						
		}
Output:-
		Java
		My name is Gaurav!
		1
		My name is Gaurav!



18. What is the difference between "Gaurav Kukade".equals(str) and str.equals("Gaurav Kukade")?

		Both look the same, and it will check if the content of the string variable str is equal to the string 
		"Gaurav Kukade" or not.

		But their behavior will change suddenly when a string variable str = null. The first code snippet will 
		return false, but the second code snippet will through a NullPointerExpection.

		Below I have given a program which uses both ways to compare string using equals() method.

		/*
		 * A Java program which checks
		 * both ways of string comparison using equals() method.
		 */

		public class StringExample {

			public static void main(String[] args) {
				
				String str = "Gaurav Kukade";
				
				System.out.println("Gaurav Kukade".equals(str)); // true
				
				System.out.println(str.equals("Gaurav Kukade")); // true
			}

		}

Output:-

		true
		true

		It is print true both times because the content of both strings is equal to each other.

		Now, we will check a program where the str=null		



		 /* A Java program which checks
		 * both ways of string comparison using equals() method.
		 * 
		 * This program throws a NullPointerException at second print statement.
		 */
		 
		public class StringNullExample {
		 
		 public static void main(String[] args) {
		 
		 String str = null;
		 
		 System.out.println("Gaurav Kukade".equals(str)); // false
		 
		 System.out.println(str.equals("Gaurav Kukade")); // NullPointerException
		 }
		 
		}

Output:-
		false
		Exception in thread "main" java.lang.NullPointerException
			at StringNullExample.main(StringNullExample.java:14)

		We can see the above output, for first code snippet it is print false but for the second code snippet, 
		it is throwing NullPointerException.

		It is one of the most important tricks to avoid the null pointer exception in java string. So this question is important.

19. Can we use a string in switch case in java?

		Yes, from Java 7 we can use String in switch case.

		Below, I have given a program that shows the use of the string in switch case.

		/*
		 * A Java program showing the use of
		 * String in switch case.
		 */
		public class StringInSwitchExample  
		{ 
		    public static void main(String[] args) 
		    { 
		        String str = "two"; 
		        switch(str) 
		        { 
		            case "one": 
		                System.out.println("January"); 
		                break; 
		            case "two": 
		                System.out.println("February"); 
		                break; 
		            case "three": 
		                System.out.println("March"); 
		                break; 
		            default: 
		                System.out.println("Invalid month number"); 
		        } 
		    } 
		}

Output:-

		February
		1
		February


20. How string concatenation using the + operator works in Java?
		+ operator is the only overloaded operator. You can use it for both adding two numbers as well as for string 
		concatenation purposes.

		If you are using the Java version 1.5 or above, string concatenation internally uses the append() method 
		of the StringBuilder. And for versions lower than 1.5, it uses the append() method of the StringBuffer class.

		If you think any other question should be in the list above, please write them down in the comment section below.







Top 50 String Questions:-

(1).Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

		Example 1:

		Input:
		S = i.like.this.program.very.much
		Output: much.very.program.this.like.i
		Explanation: After reversing the whole
		string(not individual words), the input
		string becomes
		much.very.program.this.like.i


Code:-

		import java.util.Scanner;

		public class ReverseWords {
			
			static String ReverseWord(String S)
			{
				String [] arr=S.split("\\.");		// Storing the given String in a array without "."
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				StringBuilder Builder=new StringBuilder();		// Creating a muttable String
				
				for(int i=arr.length-1;i>=0;i--)
				{
					Builder.append(arr[i]);		// Storing the given String of array to Builder String object
					if(i>0)
					{
						Builder.append(".");	// putting dot (.)
					}
				}
				return Builder.toString();
			}
			
			public static void main(String[] args) {
				
				// Scanner sc=new Scanner(System.in);
				// String str=sc.nextLine();
				String Str= "much.very.program.this.like.i";
				System.out.print(ReverseWord(str));

			}

		}

	Output:-

	i.like.this.program.very.much



Method-2:- to reverse a sentence:-

Code:-// "static void main" must be defined in a public class.
public class Main {
    
    static String reverse(String str){
        String arr[]=str.split(" ");
        for(String s:arr){
            System.out.print(s+" ");
        }
        StringBuilder bdr=new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            bdr.append(arr[i]);
            if(i>=0){
                bdr.append(" ");
            }
        }
        return bdr.toString();
    }
        // Method-2
        
        static String revrse2(String str){
            
            String arr[]=str.split(" ");
            for(String s:arr){
            System.out.print(s+" ");
            }
            Stack<String> st=new Stack<>();
            for(String s:arr){
                st.push(s);
                }
            String ans="";
            for(int i=0;i<arr.length;i++){
                ans+=st.pop();
                ans+=" ";
             }
            return ans;
        }

    public static void main(String[] args) {
        String str= "I love my country";
        
        // Method-1
        String ans=reverse(str);
         System.out.println();
         System.out.print(ans);
        
        // Method-2
        System.out.println();
        String ans2=reverse(str);
         System.out.println();
         System.out.print(ans2);        
    }
}

Output:-

I love my country 
country my love I 
I love my country 
country my love I 




Method--(2):-

Algorithm:  


Initially, reverse the individual words of the given string one by one, for the above example, 
						after reversing individual words the string should be "i ekil siht margorp yrev hcum".
						
Reverse the whole string from start to end to get the desired output "much very program this like i" 
				in the above example.


		Code:-
		

		public class ReverseSentence {
			
			// Reverse the letters of the word
			
			static void reverseChar(char []str,int start,int end)
			{
				char temp;
				while(start<=end)
				{
					// Swapping the first 
				    // and last character 
					temp=str[start];
					str[start]=str[end];
					str[end]=temp;
					start++;
					end--;
				}
			}
			
			// Function to reverse words
			static char[] reverseWords(char []s)
			{
				// If we see a space, we reverse the previous word (word between the indexes start and end-1
				//i.e., s[start..end-1]
				
				int start =0;
				for(int end=0;end<s.length;end++)
				{
					if(s[end]==' ')
					{
						reverseChar(s, start, end);
						start = end + 1;			// if we here it will Reverese whole String only
					}
					//start = end + 1;		// If we use it here it will give Reverse String with Reverse words of String//

				}
				// Reverse the last word
				  reverseChar(s, start, s.length - 1);

				  // Reverse the entire String
				  reverseChar(s, 0, s.length - 1);
				  return s;
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String s = "i like this program very much ";
				  char []p = reverseWords(s.toCharArray());
				  System.out.print(p);

			}

		}

		Output:-

		much very program this like i 

		//hcum yrev margorp siht ekil i

Method-03:-

		Code:-

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class ReverseSentence2 {
			
			static void ReverseSentence(String S)
			{
				String s[]=S.split(" ");		// putting String in a String array
				String ans="";
				for(int i=s.length-1;i>=0;i--)
				{
					ans+=s[i]+" ";
				}
				System.out.println("Reversed String:");
				System.out.println(ans.substring(0, ans.length()-1));
			}

			public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub
				
				
				BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				String str=br.readLine();
				ReverseSentence(str);

			}

		}

		Input:- Deepak Kumar
		Output:- Kumar Deepak

		TC: o(n)



			
Method-04:-Without using any extra space:

		Code:-

		// Java code to reverse a string
		class GFG{
		    
		// Reverse the string
		public static String[] RevString(String[] s,
		                                 int l)
		{
		    
		    // Check if number of words is even
		    if (l % 2 == 0)
		    {
		        
		        // Find the middle word
		        int j = l / 2;
		        
		        // Starting from the middle
		        // start swapping words at 
		        // jth position and l-1-j position
		        while (j <= l - 1)
		        {
		            String temp;
		            temp = s[l - j - 1];
		            s[l - j - 1] = s[j];
		            s[j] = temp;
		            j += 1;
		        }
		    }
		    // Check if number of words is odd
		    else 
		    {
		        
		        // Find the middle word
		        int j = (l / 2) + 1;
		        
		        // Starting from the middle start
		        // swapping the words at jth 
		        // position and l-1-j position
		        while (j <= l - 1) 
		        {
		            String temp;
		            temp = s[l - j - 1];
		            s[l - j - 1] = s[j];
		            s[j] = temp;
		            j += 1;
		        }
		    }
		    
		    // Return the reversed sentence
		    return s;
		}
		// Driver Code
		public static void main(String[] args)
		{
		    String s = "getting good at coding " + 
		               "needs a lot of practice";
		    String[] words = s.split("\\s");
		    
		    words = RevString(words, words.length);
		    
		    s = String.join(" ", words);
		    
		    System.out.println(s);
		}
		}

		Output:-

		practice of lot a needs coding at good getting



(2) Longest Substring Without Repeating Characters   (LC):-

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.


Solution:-


Code:-

//Method-(1):-Brute Force

// Longest Substring Without Repeating Characters

import java.io.*;
import java.util.*;
public class StringLengthWithUniqueChar {
	
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {									// here i= start and j= end
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }
    static boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }

        return true;
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		System.out.println("The unique length of String ="+lengthOfLongestSubstring(S));

	}

}


// Method-2: Sliding Window


    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		System.out.println("The unique length of String ="+lengthOfLongestSubstring(S));

	}

}


//Method-(3): Sliding Window Optimized
	
	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		System.out.println("The unique length of String ="+lengthOfLongestSubstring(S));

	}

}


// Method-(4): Java (Assuming ASCII 128)

public static int lengthOfLongestSubstring(String s) {
	        Integer[] chars = new Integer[128];

	        int left = 0;
	        int right = 0;

	        int res = 0;
	        while (right < s.length()) {
	            char r = s.charAt(right);

	            Integer index = chars[r];
	            if (index != null && index >= left && index < right) {
	                left = index + 1;
	            }

	            res = Math.max(res, right - left + 1);

	            chars[r] = right;
	            right++;
	        }

	        return res;
	    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		System.out.println("The unique length of String ="+lengthOfLongestSubstring(S));

	}

}










Qs:- Character Frequency in a string:-

Code:-

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate {
    static void countDuplicateChar(String str){
        HashMap<Character, Integer> map=new HashMap<>();
        char arr[]=str.toCharArray();
        for(char c:arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        String str="Deepak kumar";
        countDuplicateChar(str);
    }
}


Output:-
a: 2
e: 2
k: 2
