import java.util.*;

public class LinkedList_Basic_2 {
    static Node head;
    static class Node
    {
        String data;
        Node next;

        Node(String data)   // COntructor
        {
            this.data=data;
            this.next=null;     // means null will be for every nodes
        }
    }

    // Add- first and last

    // Add-first

    public void addfirst(String data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    // add-last
    public void addLast(String data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node temp= head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    // print list

    public void printList()
    {
        if(head==null)
        {
            System.out.print("List is empty");
            return ;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.next+ " -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    

    public static void main(String[] args) {

        //LinkedList_Basic_2 list=new LinkedList_Basic_2();       // creating a object of own class

        //LinkedList list = new LinkedList();

        // list.addfirst("is");
        // list.addfirst("a");
        // list.addfirst("Linked");
        list.head=new Node("a");

        list.printList();


        
    }

}
