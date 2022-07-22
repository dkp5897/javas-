Q-1: Pattern Printing:



N = 5 

*****
****
***
**
*



N = 6

******
*****
****
***
**
*


Template: (N = 5)


Row = 1, Col = 5  1+5 = 6 
Row = 2, Col = 4  2+4 = 6
Row = 3, Col = 3  3+3 = 6
Row = 4, Col = 2  4+2 = 6 
Row = 5, Col = 1  5+1 = 6 




TWO LOOPS:

First Loop: Outer Loop: Row

for (i=0; i<5; i++) 


Second Loop: Inner Loop: Col

for (j=0; i+j<5; j++)




for (i=0; i<5; i++)  i = 0
{
    for (j=0; i+j<5; j++) i =0, j=0 ---> i =1, j=0
    {
        System.out.println(i, j);
    }
}


Condition: i + j < 5

i = 0
j = 0,1,2,3,4 (5 Times)

i = 1
j = 0,1,2,3  ( 4 Times)

i = 2
j = 0,1,2  ( 3 Times)

i = 3
j = 0,1  ( 2 Times)



---> Decreasing Pattern: Col Decreases


CODE:


// "static void main" must be defined in a public class.
public class Main {
    
    public static void pattern(int n)
{
        int i=0, j=0;
        
        for (i=0; i<n; i++) 
    {
        for (j=0; i+j<n; j++)
        {
        System.out.print("* ");
        }
        System.out.println("");
    }
}
    
    public static void main(String[] args) {
       pattern(5);
       //pattern(6);

    }
}



















Q-2: Pattern Printing:

N = 5 

*
**
***
****
*****

N = 6

*
**
***
****
*****
******


Template: (N = 5)

Row = 1, Col = 1  i == j
Row = 2, Col = 2  i == j
Row = 3, Col = 3  i == j
Row = 4, Col = 4  i == j
Row = 5, Col = 5  i == j



Cols Increasing --> Increasing



TWO LOOPS:

First Loop: Outer Loop: Row

for (i=0; i<5; i++) 


Second Loop: Inner Loop: Col

for (j=0; j<=i; j++)


for (i=0; i<5; i++)
{
    for (j=0; j<=i; j++)
    {
        s.o.p(i,j)
    }
}


DRY RUN:

Condition: j<=i


i = 0
j = 0 (1 Time)

i = 1
j = 0,1 (2 Times)


i = 2
j = 0,1,2 (3 Times)




CODE:


// "static void main" must be defined in a public class.
public class Main {
    
    public static void pattern(int n)
{
        int i=0, j=0;
        
        for (i=0; i<n; i++) 
    {
        for (j=0; j<=i; j++)
        {
        System.out.print("* ");
        }
        System.out.println("");
    }
}
    
    public static void main(String[] args) {
       //pattern(5);
       pattern(6);

    }
}








Q-4:  Pattern:

N = 4
OP:

*
*^*
*^^*
*****

N = 3
Sample Output:-
*
*^*
****

N = 6
Sample Output:-
*
*^*
*^^*
*^^^*
*^^^^*
******



^^ Pattern: N-2 Rows

N = 6 (0 Based Indexing)

Row :1   No of ^: 1  i == j
Row :2   No of ^: 2  i == j
Row :3   No of ^: 3  i == j
Row :4   No of ^: 4  i == j




Observations:

(1) Increasing

(3) Last Row: N+1 Stars: DONE

(3) First Row: 1 Star: DONE

(4) ^^ Pattern: N-2 Rows: DONE
    - Outer Loop: Rows: N-2
    - Inner Loop: Cols: i == j

CODE:

// "static void main" must be defined in a public class.
public class Main {
    
 static void pattern(int n)
{
     int i=0,j=0;
System.out.println("*");

// N-2 Pattern
for (i=0; i<n-2; i++)
{
   System.out.print("*");
    for (j=0; j<=i; j++)
    {
        System.out.print("^");
    }
     System.out.println("*");
}

for(i=0; i<=n; i++) 
{
    System.out.print("*");
}


}

    public static void main(String[] args) 
    {
        pattern(6);
    }    
}





Qs:(1):- Double Triangle

Code:-
import java.util.Scanner;

public class double_triangle {
    
    // for pyramid
    static void pyramid(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  "); // without space it will print Triangle         
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int num=sc.nextInt();
        pyramid(num);
    }
}


Output:-
Enter the number of pattern: 6
          * * 
        * * * * 
      * * * * * * 
    * * * * * * * * 
  * * * * * * * * * * 
* * * * * * * * * * * * 




Qs:(2):-Increasing Pattern

Code:-
import java.util.Scanner;

public class Incresing_pattern {
    
    public static void patterns(int n)
    {
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to print pattern: ");
        int num=sc.nextInt();
        patterns(num);

    }

}




Output:-
Enter the number to print pattern: 5
* 
* * 
* * * 
* * * * 
* * * * * 





Qs:(3):-Decreasing Pattern

Code:-
import java.io.InputStream;
import java.util.Scanner;

public class pat_01 {
    
    public static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;i+j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of line to print:");
        int num=sc.nextInt();
        pattern(num);

    }    
}


Output:-
Enter the number of line to print:5
* * * * * 
* * * * 
* * * 
* * 
* 




Qs:(4):- Triangle Increasing

Code:-
import java.util.Scanner;

public class triangle_04_incresing {
    
    static void triangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int num=sc.nextInt();
        triangle(num);
    }

}


Output:-
Enter the number of pattern: 10
                    * 
                  * * 
                * * * 
              * * * * 
            * * * * * 
          * * * * * * 
        * * * * * * * 
      * * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * * 





Qs:(5):- Triangle Decreasing

Code:-

import java.util.Scanner;

public class tringle_03 {
    
    static void triangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");   //without space -->tringle with 90 degree in left
            }                           //with one space -->revers pyramid  
            for(int j=0;i+j<n;j++)      //with two space-->tringle with 90 degree in right
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int num=sc.nextInt();
        triangle(num);

    }

}


Output:-

Enter the number of pattern: 10
* * * * * * * * * * 
  * * * * * * * * * 
    * * * * * * * * 
      * * * * * * * 
        * * * * * * 
          * * * * * 
            * * * * 
              * * * 
                * * 
                  * 






Qs:(6):- pyramid

CODE:

import java.util.Scanner;

public class pyramid {
    
    static void pyramid(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");  // withot space it will print Triangle          
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int num=sc.nextInt();
        pyramid(num);

    }
}


Output:-
Enter the number of pattern: 10
          * 
         * * 
        * * * 
       * * * * 
      * * * * * 
     * * * * * * 
    * * * * * * * 
   * * * * * * * * 
  * * * * * * * * * 
 * * * * * * * * * * 




 Qs:(7):-Reverse pyramid

 CODE:-

 import java.util.Scanner;

public class Revers_pyramid {
    
    static void R_pyramid(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");  // without space it will print Revers Triangle          
            }
            for(int j=0;j+i<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int num=sc.nextInt();
        R_pyramid(num);

    }

}



Output:-

Enter the number of pattern: 10
* * * * * * * * * * 
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 




Qs:(8):-Saddled Pattern

Code:-

import java.util.Scanner;

public class saddeled_pattern {
    
    static void sadeled(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;i+j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();   
        }
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* "  );
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int num=sc.nextInt();
        sadeled(num);

    }

}




Output:-

Enter the number of pattern: 10
* * * * * * * * * * 
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 





Qs:(9):- Two opposite pyramid

Code:-

/* in this program if we use 1-star with single space--->Two opposite pyramid
 * in this program if we use 1-star with double space--->two triangle which are horizontally mirror image to each other
 * in this program if we use 1-star with no space--->    two triangle which are horizontally mirror image to each other
 *  */



import java.util.Scanner;

public class Two_opposit_pyramids {
    
    // for pyramid
        static void pyramid(int n)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<n-i;j++)
                {
                    System.out.print(" ");  // without space it will print Triangle         
                }
                for(int j=0;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        // for reverse pyramid
        static void R_pyramid(int n)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(" ");  // without space it will print Triangle         
                }
                for(int j=0;j+i<n;j++)
                {
                    System.out.print("@ ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int num=sc.nextInt();
        pyramid(num);
        R_pyramid(num);

    }

}




Output:-

Enter the number of pattern: 10
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
@ @ @ @ @ @ @ @ @ @ 
 @ @ @ @ @ @ @ @ @ 
  @ @ @ @ @ @ @ @ 
   @ @ @ @ @ @ @ 
    @ @ @ @ @ @ 
     @ @ @ @ @ 
      @ @ @ @ 
       @ @ @ 
        @ @ 
         @ 









Qs:(10):- Pascal's triangle

Pascal’s triangle is a pattern of the triangle which is based on nCr.below is the pictorial representation of 
Pascal’s triangle.

Example:

    Input : N = 5

    Output:
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


    Approach #1: 

    nCr formula:

     n ! / ( n – r ) ! r ! 

After using nCr formula, the pictorial representation becomes:

           0C0
        1C0   1C1
     2C0   2C1   2C2
  3C0   3C1   3C2   3C3 


Algorithm:

(1) Take a number of rows to be printed, assume it to be n
(2) Make outer iteration i from 0 to n times to print the rows.
(3) Make inner iteration for j from 0 to (N – 1).
(4) Print single blank space ” “
(5) Close inner loop (j loop) //it’s needed for left spacing
(6) Make inner iteration for j from 0 to i.
(7) Print nCr of i and j.
(8) Close inner loop.
(9) Print newline character (\n) after each inner iteration.



Code:-

import java.util.Scanner;

public class PascalsPattern {
    
    static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
        
    }

    public static void main(String[] args) {
        
         int n , i, j;
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the number of rows of Pascal's pattern");
         n=sc.nextInt();
         for (i = 0; i <= n; i++) 
         {
            for (j = 0; j <= n - i; j++)
            {
                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) 
            {
                // nCr formula= n!/r!(n-r)! 
                System.out.print("  "+ factorial(i)/ (factorial(i - j)* factorial(j)));
            }
     
            // for newline
            System.out.println();
        }
    }
}

Output:-

Enter the number of rows of Pascal's pattern: 4
        1
      1  1
     1  2  1
    1  3  3  1
   1  4  6  4  1

