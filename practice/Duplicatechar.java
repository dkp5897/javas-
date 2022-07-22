import java.util.HashSet;
import java.util.Iterator;

import javax.swing.text.html.parser.Entity;

public class Duplicatechar {
    //method-1 to find duplicate
    static void duplicate(String str){
        int count=0;
        char string []=str.toCharArray();
        for(int i=0;i<string.length;i++){
            count=1;
            for(int j=i+1;j<string.length;j++){
                if(string[i]==string[j] && string[i]!=' '){
                    count++;
                    string[j]='0';
                }
                
            }
            if(count>1 && string[i]!='0'){
                System.out.println(string[i]);
            }
        }
    }
    // method-2
    static void duplicate2(String str){
        char string[]=str.toCharArray();
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<string.length;i++){
            for(int j=i+1;j<string.length;j++){
                if(string[i]==string[j]){
                    set.add(str.charAt(i));
                }
            }
        }
      Iterator<Character> i=set.iterator();
      while(i.hasNext()){
        System.out.print(i.next()+" ");
      }
        
    }
    public static void main(String[] args) {
        String str="Great responsibility";
        duplicate(str);
        duplicate2(str);
    }
}
