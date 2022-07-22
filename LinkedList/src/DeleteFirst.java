public class DeleteFirst {

    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    // function for deleting fisrt element in LL

    public void deleFirst()
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        // just change head position from first to second node first node will be deleted
        head=head.next;
    }

    // print LL

    public void printLL(Node head)
    {
        if(head==null)
        {
            System.out.println("The Linked List is empty");
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

        DeleteFirst LList=new DeleteFirst();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node forth =new Node(4);
        Node fifth=new Node(5);

        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fifth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("\nThe Linked list after deleting front element: ");
        LList.deleFirst();
        LList.printLL(head);
        
    }
}
