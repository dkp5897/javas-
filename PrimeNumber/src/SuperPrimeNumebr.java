import java.util.ArrayList;

public class SuperPrimeNumebr {
	
	// optimized Solution for returning prime number
	
//	static boolean isPrime(int n){
//	      if(n%2==0){
//	          return false;
//	      }
//	      for(int i=3;i<=Math.sqrt(n);i++){
//	          if(n%i==0){
//	              return false;
//	          }
//	      }
//	      return true;
//	   }
	
	// method-2 for returning prime number
	static boolean isPrime(int n){
	      if(n<2){
	          return false;
	      }
	      for(int i=2;i<n;i++){
	          if(n%i==0){
	              return false;
	          }
	      }
	      return true;
	   }
	
	// method -01 for super prime
	static int SuperPrime(int n)
	{
		int count=0;
		for(int i=5;i<=n;i++)
		{
			if(isPrime(i)&&isPrime(i-2))
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\nThe total number of super prime between 1 to %d\n",n);
		return count;
	}
	
	
	// method-02 for super prime
	static int SuperPrimes(int n) {
        // code here
        int count=0;
       ArrayList<Integer> A=new ArrayList<Integer>();
       for(int i=1;i<n;i++)
       {
           if(isPrime(i))
           {
               A.add(i);
           }
       }
       System.out.println();
       for(int i=0;i<A.size();i++)
       {
           if(isPrime(i+1))
           {
               count++;
               System.out.print(A.get(i)+" ");
           }  
       }
       System.out.printf("\nThe total number of super prime between 1 to %d\n",n);
       return count;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(SuperPrime(25));
		System.out.print(SuperPrimes(25));
	}

}
