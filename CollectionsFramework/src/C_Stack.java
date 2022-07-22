import java.util.Iterator;
import java.util.Stack;

public class C_Stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<String> st2=new Stack<>();

        for(int i=1;i<=5;i++){
            st.add(i);
        }

        System.out.println(st);

        st2.push("Deepak");
        st2.push("Pradeep");
        st2.push("Prajapati");

        System.out.println(st2);

        st.remove(1);
        st2.remove(1);
        System.out.println(st);
        System.out.println(st2);

        System.out.println(st.peek());
        System.out.println(st2.peek());

        st.pop();
        st2.pop();

        System.out.println(st);
        System.out.println(st2);

        Iterator<Integer>itr = st.iterator();
        Iterator<String>itr2 = st2.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        while(itr.hasNext()){
            System.out.print(itr2.next()+" ");
        }

        for(int i=0;i<st.size();i++){
            System.out.print(st.get(i)+" ");
        }
        System.out.println();

        for(int i=0;i<st2.size();i++){
            System.out.print(st2.get(i)+" ");
        }

        System.out.println("\n"+st.toString());

        st2.push("Aditya");
        st2.push("Adarsh");
        Object stack []=st2.toArray();
        for(Object e:stack){
            System.out.println(e+" ");
        }
    }
}
