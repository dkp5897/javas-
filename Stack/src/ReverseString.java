import java.util.Stack;

public class ReverseString {
    static String Rstring(String str){

        Stack<Character>st=new Stack<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        while(!st.empty()){
            ans+=st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abcdefgh";

        System.out.print(Rstring(s));
    }
}
