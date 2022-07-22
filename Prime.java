





-----> Prime Numbers:

Only 2 Factors, 1 and the Number Itself

Eg: 2,3,5,7,11,13,17......



------> Primality Test

To Check if a Number is Prime or Not?

Q: Check if a Number N is Prime or Not?

(1) Check for All Numbers from 2 to N-1

Prime: Only 2 Factors: 1 and N

Run a Loop from 2 to N-1: 
- If any number is factor: NOT PRIME
- Else: PRIME



CODE:


public class Main {
    
static boolean isPrime(int N)
{
    for (int i=2;i<N; i++) // 2 To N-1
    {
        if (N % i == 0)
            return false;
    }

    return true;
}
    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
    }
}


TC: O(N)
SC: O(1)


(2) Check for All Numbers from 1 to N -- Count the Number of Factorss

Prime: Only 2 Factors: 1 and N

Run a Loop from 1 to N: 
- If Count == 2: Prime
- Else: Not Prime


CODE:


public class Main {
    
static boolean isPrime(int N)
{
    int cnt=0;
    for (int i=1;i<=N; i++) // 1 To N
    {
        if (N % i == 0)
            ++cnt;
    }

    if (cnt == 2)
        return true;
    else
        return false
}
    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
    }
}


TC: O(N)
SC: O(1)


(3) Check for All Numbers from 2 to N/2
2 to N-1: Factor

Approach/Intuition: 
If N is NOT Prime, Its factor MUST lie between 2 to N/2

Reason: N/2 is the Biggest Factor of Any Number N (2 to N/2)

N: 20 
N/2: 10


N = 10
N/2 = 5

i = Loop from 2 to N/2
N % i == 0

CODE:

public class Main {
    
static boolean isPrime(int N)
{
    for (int i=2;i<=N/2; i++) // 2 To N/2
    {
        if (N % i == 0)
            return false;
    }

    return true;
}    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
        System.out.println(isPrime(74));

    }
}


TC: O(N/2)
SC: O(1)



(4) Check for All Numbers from 2 to Sqrt(N)


Euclid Theorem:
- Any Number if its does not have any factor till sqrt(N), 
It wont have Any Factor after.


N = 10
sqrt(10) = 3.1868

2...3: 2 is factor of 10 and 2 < sqrt(10)


N = 50
sqrt(N) = 7.18

2...7: 5 is a factor of 50 and 5 < sqrt(50)


N = 41
sqrt(41) = 6.487

2...6: No Factor of 41 till sqrt(41)
Hence, 41 is a prime






CODE:


public class Main {
    
static boolean isPrime(int N)
{
    for (int i=2; i*i<=N; i++) // 2 To sqrt(N)
    {
        if (N % i == 0)
            return false;
    }

    return true;
}    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
        System.out.println(isPrime(74));

    }
}



TC: O(sqrt(N))
SC: O(1)


i^2 = N
i = sqrt(N)

i^2 <= N: i*i<=N
i <= sqrt(N)



(5) Sieve of Eratosthenes

Eratosthenes: Mathematician
Use Case: Find Count of Prime Numbers between Range of Values: [L,R]


- Print Prime Numbers Until N (2 to N)

N = 5
OP: [2 3 5]

N = 11
OP: [2 3 5 7 11]



Approach:
(1) Use Euclid Theorem for Optimisation
(2) If a Number is Prime, Its Multiple CANNOT be Prime
(3) ANY Number which is NOT PRIME MUST HAVE atleast 1 Prime Factor

Code:


void seiveofEratosthenes(int N)
{
boolean[] prime = new boolean[N+1]; //To keep in index range: 2 to 11
for (int i=0; i<=N; i++)
    prime[i] = true;

for (int p=2; p*p<=N; p++) // p = 2, p = 3
{
    if (prime[p] == true) // p = 2, p = 3
    {
        for (int i = p*p; i<=N; i+=p) //p = 2, i = 4, i = 6, i = 8, i = 10
            // p = 3, i = 9
            prime[i] = false;
    }
}

for (i=2; i<=N; i++)
    if (prime[i] == true) // N+1 because of keeping in index
        System.out.print(i + " ");
}


TC: O(N*log(log N))
SC: O(N)








DRY RUN:

N = 10
OP: [2 3 5 7]


for (int p=2; p*p<=10; p++)
----> p = 2, p = 3



2: TRUE
3: TRUE
4: FALSE
5: TRUE
6: FALSE
7: TRUE
8: FALSE
9: FALSE
10: FALSE






CODE:

public class Main {
    
static void seiveofEratosthenes(int N)
{
boolean[] prime = new boolean[N+1]; //To keep in index range: 2 to 11
int i=0;
    
    for (i=0; i<=N; i++)
        prime[i] = true;

for (int p=2; p*p<=N; p++) // p = 2, p = 3
{
    if (prime[p] == true) // p = 2, p = 3
    {
        for (i = p*p; i<=N; i+=p) //p = 2, i = 4, i = 6, i = 8, i = 10
            // p = 3, i = 9
            prime[i] = false;
    }
}

for (i=2; i<=N; i++)
    if (prime[i] == true) // N+1 because of keeping in index
        System.out.print(i + " ");
    
    System.out.println(" ");  
}
    public static void main(String[] args) 
    {
        seiveofEratosthenes(10);
        seiveofEratosthenes(15);
        seiveofEratosthenes(20);

    }
}



[L,R]: Closed Interval: L and R Both are Included
(L,R): Open Interval: L and R are Not Included



Code of printing prime numbers:-


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintPrimeNumber {
    
    //Method-01 TC:O(n^2) SC: O(1) 
    static boolean isPrime(int n){
          if(n<2){
              return false;
          }
          for(int i=2;i<n;i++){
              if(n%i==0)
                  return false;
          }
          return true;
       }
    
    static void PrintPrime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }

    
    // method-02 seiveofEratosthenes
    
    static void seiveofEratosthenes(int n)
    {
        boolean [] prime=new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            prime[i]=true;
        }
        for(int i=2;i*i<n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=false;
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==true)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
       
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(r);
        System.out.println("Enter a Number to print prime number from 2 to n: ");
        int n=Integer.parseInt(br.readLine());
        PrintPrime(n);
        System.out.println();
        seiveofEratosthenes(n);
    }
}





Q: Leetcode 204- Count Numbers: https://leetcode.com/problems/count-primes/

Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:

Input: n = 0
Output: 0

Example 3:

Input: n = 1
Output: 0
 

Constraints:

0 <= n <= 5 * 10^6




Solutions:

(1) O(N): From 1 to N
(2) O(N/2): From 1 to N/2
(3) O(sqrt(N)): From 1 to sqrt(N)
(4) O(N*log(log N)): Seive of Eratosthenes


Code:-

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countPrimelessThan_N {
    
    static boolean prime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    static int count(int n)
    {
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(prime(i))
            {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(r);
        System.out.print("Enter a Number: ");
        int n=Integer.parseInt(br.readLine());
        System.out.printf("Total Number of PrimeNumberts from 2 to %d = %d",n,count(n));
        //System.out.print(prime(4));
    }
}








Q: Codechef: https://www.codechef.com/problems/EXCG1806


Sexy primes Problem Code: EXCG1806

Sexy prime is a prime number n such that n+6 is also prime.

Input: A single integer n
Output: The number of sexy prime factors of the given number n.

Constraints: 1≤n≤100


Eg: N = 5: PRIME
    N+6 = 11: PRIME

Hence, 5 is Sexy Prime Number



Eg: N = 17: PRIME
    N+6 = 23: PRIME

Hence, 23 is Sexy Prime Number


5-11, 11-17, 13-19, 17-23, 23-29 etc


Sexy Prime: 5, 7, 11, 13, 17, 23 etc







Solution:

int solution(int N)
{
boolean[] prime = new boolean[N+1]; //To keep in index range: 2 to 11
int i=0;
    
    for (i=0; i<=N; i++)
        prime[i] = true;

for (int p=2; p*p<=N; p++) // p = 2, p = 3
{
    if (prime[p] == true) // p = 2, p = 3
    {
        for (i = p*p; i<=N; i+=p) //p = 2, i = 4, i = 6, i = 8, i = 10
            // p = 3, i = 9
            prime[i] = false;
    }
}

int countofSexyPrimes=0;
for (i=2; i<=N-6; i++)
{
    if (prime[i] && prime[i+6]) // Both are Prime and Diff is 6
        ++countofSexyPrimes;
}

return countofSexyPrimes;
}



TC: O(N*log(logN)) + O(N)
SC: O(N)

Q: Generator - Super Prime

For a given integer N, super primes are those integers from 1 to N whose multiples (other than themselves) 
do not exist in the range [1, N].
Your task is to generate all super primes <= N in sorted order.

Note: Super primes are not related to primes in any way.


Sample Input:-
5

Sample Output:-
3 4 5

Sample Input:-
4

Sample Output:-
3 4


Factors of N:

N: 1,____,N

Super Prime Numbers: 1, No MULTIPLE,N


Dry Run:


Input: N = 5

5: 1 2 3 4 5

1: NEVER a Superprime
2: Multiple 4 in Range[1,5]: Not a Superprime
3: NO Multiple in Range[1,5]: YES
4: NO Multiple in Range[1,5]: YES
5: NO Multiple in Range[1,5]: YES


OP: 3 4 5



Solution:

(1) Brute Force Way:

Loop i from 2 to N:
If i has multiple apart from i itself --> Superprime


(2) Smart Way:

Biggest Factor of a Number, apart from itself: N/2

[1................N/2...................N] 


N/2 is the BIGGEST Value for Which a Multiple can Exist in [1,N]

[1....N/2]: Multiple WILL Exist in [1,N]
[N/2+1....N]: Multiple WILL NOT Exist in [1,N] --> Superprimes





CODE:

for (int i = N/2+1; i<=N; i++)
    System.out.print(i, " ");



N = 5
OP: 3 4 5

N = 4
OP: 3 4








-------->Qs: Divisors Of N

Problem Statement
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.

Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
1 <= T <= 50
1 <= N <= 10^9


Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2

Example

Input:
2
9
8

Output
0
3



Understanding:
Count Number of Factors which are divisible by 2 in [1,N]


Edge Case:

N : Odd
Ans: 0


N: Even
Count of Factors divisible by 2 : Optmised Approach: Seive Code







------->Qs.Prime Number Greater than the given number

Code:-

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterClosesPrimeNumber {
    
    static boolean isPrime(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    static void GreaterPrime(int n)
    {
        for(int i=n; ;i++)
            if(isPrime(i))
            {
                System.out.printf("The next prime number after %d is %d",n,i);
                break;
            }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n=Integer.parseInt(br.readLine());
        GreaterPrime(n);
    }
}




------->Qs.Prime Number Greater than the given number


Code:-

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LesserPrimeNumber {
    
    static boolean isPrime(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    static void LessPrime(int n)
    {
        for(int i=n; ;i--)
        {
            if(isPrime(i))
            {
                System.out.printf("The previous prime number Before %d is %d",n,i);
                break;
            }
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n=Integer.parseInt(br.readLine());
        LessPrime(n);
    }
}











-------->Qs: 
Closest Prime (Contest)

Problem Statement

Given an integer N, find the closest prime number to N. 
If there are multiple print the smaller one.


Input
The input contains a single integer N.

Constraints:
1 <= N <= 1000000000

Output
Print the closest prime to N.

Example
Sample Input 1
12

Sample Output 1
11

Explanation: Closest prime to 12 is 11 and 13 smaller of which is 11.

Sample Input 2
17

Sample Output 2
17

Explanation: Closest prime to 17 is 17.




Prime Numbers: 2,3,5,7,11,13...

12: Nearest: 11 and 13, Both are at diff: 1
OP: 11: Smaller



(1) If Number is Prime: 
OP: Number Itself

(2) Else:
OP: Closest Prime


Solution:


Pseudo Code:


         5 7 11 12 13 17 19
.............. Num................
      v1                v2

v1: Biggest Prime Number less than Num (11)
v2: Smallest Prime Number Greater than Num (13)


(1) Both v1 and v2 are Prime: sqrt(N)
(2) Ans = Min(Num-v1, v2-Num)
(3) If Ans == Same (12-11 = 1, 13-12 =1)
(2) Ans = Min(v1,v2) //Min(11,13): 11

Edge Case: 
if (n==1), ans = 2



DSA:

Leetcode
GFG
Newton School

CP:

Beginner: Codechef
Intermediate: Codeforces
Advanced: Google Code Jam, Hacker Cup, Kick Start, Hash Code
Experts: Topcoder



Code:-

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosestPrime_Contest {
    
    static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number: ");
        int n=Integer.parseInt(br.readLine());
        int diff1=0,diff2=0;
        int p=0,q=0;
        for(int i=n; ;i++)
        {
            if(isPrime(i))
            {
                diff1=i-n;
                p=i;
                break;
            }
        }
        
        for(int i=n; ; i--)
        {
            if(isPrime(i))
            {
                diff2=n-i;
                q=i;
                break;
            }
        }
        System.out.println("The closest Prime Number to the given Number is: ");
        if(diff1<diff2)
            System.out.print(p);
        else if(diff2<diff1)
            System.out.print(q);
        else
            System.out.print(Math.min(p, q));
    }
}



























































































 static int MAX_SIZE = 1000005;
     
    // To store all prime numbers
    static ArrayList<Integer> primes =
       new ArrayList<Integer>();
     
    // Function to generate N prime numbers
    // using Sieve of Eratosthenes
    static boolean isPrime(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    static void PrintPrime()
    {
        int n=50000;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
                primes.add(p);
        }
    }
     
        // Store all prime numbers
        // for (int p = 1; p < MAX_SIZE; p++)
        // if (IsPrime[p] == true)
        //         primes.add(p);
    }








    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
                      int L,R;
                      long sum=0;
                      while(t-->0)
                      {
                          L=sc.nextInt();
                          R=sc.nextInt();
                          PrintPrime();
                          sum=0;
                          for(int i=L;i<=R;i++)
                          {
                              sum+=primes.get(i);
                          }
                          System.out.println(sum);
                      }









                      static void SieveOfEratosthenes()
    {
        // Create a boolean array "IsPrime[0..MAX_SIZE]"
        // and initialize all entries it as true.
        // A value in IsPrime[i] will finally be false
        // if i is Not a IsPrime, else true.
        boolean [] IsPrime = new boolean[MAX_SIZE];
         
        for(int i = 0; i < MAX_SIZE; i++)
            IsPrime[i] = true;
         
        for (int p = 2; p * p < MAX_SIZE; p++)
        {
            // If IsPrime[p] is not changed,
            // then it is a prime
            if (IsPrime[p] == true)
            {
                // Update all multiples of p greater than or
                // equal to the square of it
                // numbers which are multiple of p and are
                // less than p^2 are already been marked.
                for (int i = p * p; i < MAX_SIZE; i += p)
                    IsPrime[i] = false;
            }
        }
     
        // Store all prime numbers
        for (int p = 1; p < MAX_SIZE; p++)
        if (IsPrime[p] == true)
                primes.add(p);
    }