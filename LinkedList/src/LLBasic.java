public class LLBasic {
    
    static Node head;

    // Creating Node Class
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }// Contructor
    }

    // Printing the LinkedList
    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        LLBasic LList=new LLBasic();    // Creating a object of our class

        LList.head=new Node(1);
        Node second=new Node(2);
        Node Third=new Node(4);

        // linking the Nodes
        head.next=second;
        second.next=Third;

        LList.printLL(head);
        
    }
}
