import java.util.Stack;

public class StackPushAtBottom {

    static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        pushAtBottom(4, st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
