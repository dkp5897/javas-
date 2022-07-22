import java.lang.Thread.State;
import java.util.Stack;

public class ReverseSentence {

    // method-1 
    static void reverse(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[arr.length-1-i]);
        }
    }

    // method-2
    static void reverse2(String arr[]){
        String ans="";
        Stack<String> st= new Stack<>();
        for(String s:arr){
            st.push(s);
        }
        while(!st.empty()){
            ans+=st.pop();
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // a program which reverse sentence with charecter
        String str="I am deepak kumar prajapati";
        String ans="";
        String arr[]=str.split("");
        String arr2[]={"Deepak","Kumar","Prajapati"};
        for(String s:arr){
            System.out.print(s);
        }
        System.out.println();
        reverse2(arr);
        reverse(arr);
       
    }
}
