import javax.swing.plaf.synth.SynthTextAreaUI;

public class InsertionLL {
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


    // Adding front element
    public void AddFront(int new_dat)
    {
        Node new_node = new Node(new_dat);

        // Linking the new node with head i.e. it will be at first positon
        new_node.next=head;
        head=new_node;
    }

    // adding element after e given node
    public void Append(Node pre_node, int new_data)
    {
        if(pre_node==null)
        {
            System.out.println("previous node can't be null ");
            return;
        }

        // Allocating node for new data
        Node new_node= new Node(new_data);

        new_node.next=pre_node.next;
        pre_node.next=new_node;
    }

    // adding Node in last

    public void AppendLast(int new_data)
    {
        Node new_node= new Node(new_data);
        if(head==null)
        {
            head=new_node;
            return;
        }

        /* 4. This new node is going to be the last node, so
		make next of it as null */
        new_node.next=null;

        Node last=head;
        /* 4. If the Linked List is empty, then make the
		new node as head */
        while(last.next!=null)
        {
            last=last.next;
        }
         /* 6. Change the next of last node */
        last.next=new_node;
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

        InsertionLL LList=new InsertionLL();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node Third=new Node(4);

        // linking the Nodes
        head.next=second;
        second.next=Third;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        System.out.println("\nThe Linked list after adding front element: ");
        LList.AddFront(0);
        LList.printLL(head);

        System.out.println("\nThe Linked list after adding front element and element after a node: ");
        LList.Append(second, 3);
        LList.printLL(head);

        System.out.println("\nThe Linked list after adding front element, element after a node and last node: ");
        LList.AppendLast(5);
        LList.printLL(head);
    }
}
