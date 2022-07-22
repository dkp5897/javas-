public class DeleteNode {
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

      /* Given a key, deletes the first
       occurrence of key in
     * linked list */
    public void deleNode(int key)
    {
        // Store node
        Node temp=head;
        Node prev=null;

        // If head node itself holds the key to be deleted
        if(temp!=null && temp.data==key)
        {
            head=temp.next;
            return ;
        }
        //Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while(temp!= null && temp.data !=key)
        {
            prev=temp;
            temp=temp.next;
        }
        // If key was not present in linked list
        if(temp== null)
        return;
         // Unlink the node from linked list
        prev.next=temp.next;
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

        DeleteNode LList=new DeleteNode();

        // putting element and linking them
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

        System.out.println("\nThe Linked list after deleting a partincular element: ");
        LList.deleNode(3);
        LList.printLL(head);

        
    }
}
