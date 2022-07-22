public class RverseLinkedList {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    // Reverse LL

    public void reverseLL()
    {
        if(head==null || head.next==null)
        {
            return;
        }

        Node preNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=preNode;              // linking current node to previous node

            //update
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }

    // Print LL 

    public void printLL(Node haed)
    {
        if(head==null)
        {
            System.out.println("The linked list is empty");
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

        RverseLinkedList LList=new RverseLinkedList();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third= new Node(3);
        Node fourth= new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("The Reverse Linked list: ");
        LList.reverseLL();
        LList.printLL(head);
        
    }
}
