import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="My name is Deepak Kumar";
		String [] sentences=s.split("\\.");
		System.out.println(Arrays.toString(sentences));

	}

}
