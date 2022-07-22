
public class ConvertoOppositeCharacter {
	
	//static void convertyCase

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuffer str=new StringBuffer("DeePak");
		// int n=str.length();
		// for (int i = 0; i < n; i++)
		// {
        //     char C = str.charAt(i);
        //     if (Character.isLowerCase(C))
        //         str.replace(i, i + 1,Character.toUpperCase(C) + "");
        //     else
        //         str.replace(i, i + 1,Character.toLowerCase(C) + "");
		// }
		// System.out.println(str);
		
		
		//method-02
		
		  String r ="ClAsS";
	        char j;
	        for(int i=0;i<r.length();i++)
			{
	            int a=(int)(r.charAt(i));
	            // System.out.println(a);
	            if(a>=65 && a<=92){
	                a=a+32;
	                j=(char)(a);
	                System.out.print(j);
	            }
	            else {
	                a=a-32;
	                j=(char)(a);
	                System.out.print(j);
	            }
	        }

	}

}
