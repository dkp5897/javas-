import java.util.ArrayList;
import java.util.Stack;

public class ReverseStack {

    // a function that reverse the stack
    // this funcion take stack and return ArrayList
    // method-1
    static ArrayList<Integer> revStack(Stack<Integer>st) {
       
        ArrayList<Integer> list=new ArrayList<>();
        while(!st.empty()){
            list.add(st.peek());
            st.pop();
        }
        return list;
    }

    // method-2
    static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=5;i++){
            st.push(i);
        }

        System.out.println(st);
        
        //System.out.println(revStack(st)); 
        
        reverse(st);
        System.out.println(st);
        
    }
}
