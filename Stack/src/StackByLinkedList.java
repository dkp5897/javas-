public class StackByLinkedList{
    
    static class Node{
        int data;
        Node next;
       
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class Stack{
        static Node head=null;
        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node new_node=new Node(data);
            if(isEmpty()){
                head=new_node;
                return;
            }
            new_node.next=head;
            head=new_node;
        }

        public int pop(){    // it will delete the top element and iturn it
            if(head==null){
                return 0;
            }
            else if(head.next==null){
                int top=head.data;
                head=null;
                return top;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public int peek(){
            if(head==null){
                return -1;
            }
            int top= head.data;
            return top;
        }

        public void display(){
            if(head==null){
                System.out.println("The stack is empty");
            }
            else{
                Node temp=head;
                while(temp!=null){
                    System.out.printf("%d->",temp.data);
                    temp=temp.next;
                }
                System.out.println("null");
            }
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(4);
        s.push(6);
        s.push(8);

        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        // s.display();

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}