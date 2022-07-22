import java.util.Arrays;
import java.util.Stack;

public class MinElement {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(8);
        st.push(10);
        st.push(4);
        st.push(13);

        Object arr[]=st.toArray();
        Arrays.sort(arr);
        System.out.println(st);
        System.out.println("minmum element="+arr[0]);
    }
}
