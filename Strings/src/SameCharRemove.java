import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SameCharRemove {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
        String comchar="";
        System.out.println("Original String: ");
		System.out.println(str1);
		System.out.println(str2);
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                    comchar+=str1.charAt(i);
            }
            
        }
        for(int i=0;i<comchar.length();i++)
            {
                String Rchar=comchar.charAt(i)+"";
                str1=str1.replace(Rchar,"");
                str2=str2.replace(Rchar,"");
            }
        
        System.out.println("String after Removing Common Characters: ");
        System.out.println(str1);
		System.out.println(str2);

	}

}
