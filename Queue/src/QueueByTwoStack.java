import java.util.Stack;

public class QueueByTwoStack{

    static class Queue{
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // Enqueue
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //Dequeue

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        // peek
        public int peek(){
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}