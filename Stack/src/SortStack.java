import java.util.Arrays;
import java.util.Stack;

public class SortStack {

    static Stack<Integer> sort(Stack<Integer>st){
        if(!st.empty()){
            int x=st.pop();
            sort(st);
            sortedIndex(x,st);
        }
        return st;
    }

    static void sortedIndex(int x, Stack<Integer>s){
        if(s.empty() || x>=s.peek()){
            s.push(x);
            return;
        }

        int temp=s.pop();
        sortedIndex(x, s);
        s.push(temp);
    }
    public static void main(String[] args) {

        Stack<Integer> st= new Stack<>();
        for(int i=0;i<5;i++){
            st.push(i);
        }
        st.push(20);
        st.push(45);
        st.push(10);

        System.out.println(st);
        //sort(st);
        //System.out.println(sort(st)); 

        Object arr[]= st.toArray();
        Arrays.sort(arr);
        for(Object e:arr){
            System.out.print(e+" ");
        }  
    }
}
