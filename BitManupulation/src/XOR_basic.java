/*XOR Gate:

0 XOR 1 = 1
1 XOR 0 = 1
0 XOR 0 = 0
1 XOR 1 = 0*/




public class XOR_basic {

	public static void main(String[] args) {
		// (1) A^A = 0
		
		int A=10,B=20;
		System.out.println(A^A);  				// =0
		System.out.println(10^10);
		System.out.println(5^5);
		
		
		// (2) A^B = B^A
		
		int C=A^B;
		int D=B^A;
		System.out.println(C==D);			// true
		
		
		//(3) A^0 = A
		
		System.out.println(A^0);			// 10
		System.out.println(B^0);			// 20
		
		System.out.println(A^A^A);			// 10(A)
		System.out.println(B^B^B^B);		// 0
		
		/*
		 * A^A^A^A........: Even Times: 0 
		 * 					Odd  Times: A 
		 */
		
		
		// (5) A^A^B = B^A^A = A^B^A = B  : Position DOES NOT Matter
		
		System.out.println(A^A^B);
		System.out.println(A^B^A);
		System.out.println(B^A^A);



	}

}
