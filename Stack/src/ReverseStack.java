import java.util.ArrayList;
import java.util.Stack;

public class ReverseStack {

    static ArrayList<Integer> revStack(Stack<Integer>st) {
       
        ArrayList<Integer> list=new ArrayList<>();
        while(!st.empty()){
            list.add(st.peek());
            st.pop();
        }
        return list;
    }
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=5;i++){
            st.push(i);
        }

        System.out.println(st);
        
        System.out.println(revStack(st));

        
    }
}
