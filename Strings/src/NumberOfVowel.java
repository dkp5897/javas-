
import java.util.Scanner;

public class NumberOfVowel{
	
//	static boolean isVowel(char ch)
//	{
//		ch=Character.toLowerCase(ch);
//		return (ch=='A'||ch=='E' || ch=='I'||ch=='O'||ch=='U');
//	}
//	
//	static int vowel(Strin str)
//	{
//		int count = 0;
//      for (int i = 0; i < str.length(); i++)
//          if (isVowel(str.charAt(i))) 
//              ++count;
//      return count;
//	}
	
	static boolean isVowel(char x){
   
		if (x == 'a' || x == 'e' || x == 'i' ||
         x == 'o' || x == 'u' || x == 'A' ||
         x == 'E' || x == 'I' || x == 'O' || x == 'U')
         return true;
     else
         return false;
  }
	static int count(String str)
	{
		int count=0;
		 for (int i = 0; i < str.length(); i++)
		 {
			 
			 if(isVowel(str.charAt(i)))
				 count++;
		 }
		 return count;
	}
		 public static void main(String args[]){  
		      String s="Deepak Kumar";
		      System.out.println("Number of Vowel present in String :"+count(s));
		 }  
		}  