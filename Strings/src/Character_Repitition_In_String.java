import java.util.Arrays;

// this program will show the character which was repeat

public class Character_Repitition_In_String {
	
	
	// to check Repetition of characters in the String
	
	static boolean checkRepetition(String s) {
       // convert String to character array
		char str[]=s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j] && str[i]!=' ')
					return true;
			}
		}
		return false;
   }
	
   static boolean RS(String s)
   {
	char [] ch= s.toCharArray();
	Arrays.sort(ch);
	for(int i=0;i<s.length()-1;i++)
	{
		if(ch[i]==ch[i+1])
		return true;
	}
	return false;
   }



	// to print repeated character of String
	// static void repeatedChar(String s)
	// {
	// 	// convert string to character array
	// 	int count=0;
	// 	char str[]=s.toCharArray();
	// 	for(int i=0;i<str.length;i++)
	// 	{
	// 		for(int j=i+1;j<str.length;j++)
	// 		{
	// 			count=1;
	// 			if(str[i]==str[j] && str[i]!=' ')
	// 				count++;
				
	// 		}
	// 		if(count>1)
	// 			System.out.println(str[i]);
	// 		else
	// 			System.out.println("There is no rtepeating character");
	// 	}
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdb";
		//checkRepetition(s);
		System.out.println(checkRepetition(s));
		System.out.println(RS(s));
		//repeatedChar(s);

	}

}
