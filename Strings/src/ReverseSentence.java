
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
				//start = end + 1;			// if we here it will Reverese whole String only
			}
			start = end + 1;		// If we use it here it will give Reverse String with Reverse words of String//

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
