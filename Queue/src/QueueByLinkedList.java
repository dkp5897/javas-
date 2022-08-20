public class QueueByLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        public boolean isEmpty(){
            return (head==null && tail==null);
        }

        //enqueue
        public void add(int data){
            Node new_node=new Node(data);
            if(isEmpty()){
                head=tail=new_node;
            }

            tail.next=new_node;
            tail=new_node;
        }

        //dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            int front=head.data;
            
            //for single element
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }

        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            if(head==tail){
                tail=null;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
