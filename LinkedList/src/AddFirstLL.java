import java.util.LinkedList;

public class AddFirstLL {

   static Node head;
    // Node calss
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

    // add-First 

    public void push(String new_data)
    {
        // Allocate the node

        Node new_node=new Node(new_data);

        // Linking the new node with head i.e. it will be at first positon
        new_node.next=head;

        // making new_node as head
        head=new_node;
    }
    
    // Printing LL
    public void printLL(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        /* method to create a simple linked list with nodes*/

        AddFirstLL LList=new AddFirstLL();

        LList.head=new Node("is");
        Node second=new Node("a");
        Node Third =new Node("Linked");

        head.next=second;
        second.next=Third;

        LList.printLL(head);    // print LL before adding new node

        LList.push("This");
        LList.printLL(head);        // print LL after adding new node

    }
}
