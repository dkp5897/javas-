public class AddLastLL {

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

    public void pushLast(String new_data)
    {
        /* 1. Allocate the Node &
	        2. Put in the data
	        3. Set next as null */
        Node new_node=new Node(new_data);
        /* 4. If the Linked List is empty, then make the
		new node as head */
        if(head== null)
        {
            head= new Node(new_data);
            return;
        }
        	/* 4. This new node is going to be the last node, so
		make next of it as null */
        new_node.next=null;
        /* 5. Else traverse till the last node */
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        /* 6. Change the next of last node */
        last.next=new_node;
        return;
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
        
        AddLastLL LList= new AddLastLL();
        LList.head=new Node("This");
        Node second=new Node("is");
        Node third = new Node("Linked");

        head.next=second;
        second.next=third;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);

        LList.pushLast("List");
        System.out.println("\nThe new Linked list:");
        LList.printLL(head);
    }
}
