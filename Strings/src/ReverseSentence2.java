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
