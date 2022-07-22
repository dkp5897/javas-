
public class Graycode {
	static int graycode(int n)
	{
		// Right Shift the number
        // by 1 taking xor with
        // original number
		return n^(n>>1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(graycode(10));

	}

}
