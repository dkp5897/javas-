public class AddNodeLL {
    static Node head;

    static class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }


    // this function add a node after a given node

    public void pushNode(Node pre_node ,String new_data)
    {
        if(pre_node==null)
        {
            System.out.println("previous node can't be null");
            return;
        }

        Node new_node=new Node(new_data);

        // replacing pre_node.next to new_node.nex
        /* means the node connected to previous node now connected to new node */
        new_node.next=pre_node.next;
        // Linking previous node to new node
        pre_node.next=new_node;
    }


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

        AddNodeLL LList=new AddNodeLL();

        // putting element in Linked List
        LList.head=new Node("This");
        Node second=new Node("is");
        Node third = new Node("Linked");
        Node forth =new Node("List");

        // Linking the element
        head.next=second;
        second.next=third;
        third.next=forth;
        System.out.println("The Old Linked list: ");
        LList.printLL(head);    // print old LL

        LList.pushNode(second, "a");
        System.out.println("\nThe new Linked list:");
        LList.printLL(head);
        
    }
}
