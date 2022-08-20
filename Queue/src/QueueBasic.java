import java.util.*;

public class QueueBasic {
    public static void main(String[] args) {
        
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<=5;i++){
            q.add(i);
        }
        System.out.println("The element of queue are: "+q);
        // to remove the head of the queue
        System.out.println("the removable element: "+q.remove());
        System.out.println("the head (the removable element) of the queue: "+q.poll());
        System.out.println("Npw the element of queue are: "+q);

        // to view the head of queue
        System.out.println("the head of the queue: "+q.peek());
        System.out.println("The element of queue are: "+q);

        //size of the queue
        System.out.println("Size of queue-" + q.size());
    }
}
