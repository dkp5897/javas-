public class string {
    public static void main(String[] args) {
        String str= new String("DEEPAK");       //String declearation
        String str1 = "DEEPAK";                 //String declearation
        System.out.println(str);
        System.out.println(str1);

        int l=str.length();
        int L=str1.length();
        System.out.println(l);
        System.out.println(L);

        System.out.println(str1.toUpperCase());     //this print lower case to upper case
        System.out.println(str.toLowerCase());      // this print upper case to lower case
        
        /*this will show not equal because both are stored in different variables*/
        if(str==str1)
        {
            System.out.println("Both are Equal..");
        }
        else 
        {
            System.out.println("not equal.."); 
        }

        /*this will show equal because this compare String in the variable*/

        if(str.equals(str1))
        {
            System.out.println("Both are Equal..");
        }
        else 
        {
            System.out.println("not equal.."); 
        }

        /*check imutibility*/

        str.concat(" kumar");
        System.out.println(str);      // it is show that kumar is not added in str because it is not allow//

        String str2=str.concat(" kumar");
        System.out.println(str2);       //we acn copy in another variable then it will add kumar//

        //Advantages
        // 1. no different memory location is allow fow same string
        // 2. excusion will be fast
        
    }
    
}
