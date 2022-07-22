public class DeleteLast {
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


     // function for deleting last element in LL
     public void deleLast()
     {
        // Corner Condition
        if(head==null)
        {
            System.out.println("The Linked List is empty");
            return;
        }

        // if only one node present in LL
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node secondLast=head;   // secondLst point fisrt(head) Node
        Node lastNode=head.next;     // lastNode point second element (Node)

        /*at the end of the loop secondLast  will reach at second last element and lastNode at last element  */
        while(lastNode.next !=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;   // Now second last become last element of theLL

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
        
        DeleteLast LList=new DeleteLast();

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

        System.out.println("\nThe Linked list after deleting last element: ");
        LList.deleLast();
        LList.printLL(head);
    }
}
