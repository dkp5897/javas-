public class deleteLLposition {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // printLL
    public void printLL(Node head){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    //delete node by position

    public void deleNode(Node position){
        Node temp=head;
        Node prev=null;
        // If head node itself holds the key to be deleted
        if(temp!=null && temp==position){
            head=temp.next;
            return ;
        }
        if(temp.next==null){
            head=null;
            return;
        }

        while(temp!=null && temp!=position){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
        return;
        prev.next=temp.next;


    }
    public static void main(String[] args) {
        deleteLLposition LList=new deleteLLposition();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("The Old Linked list: ");
        LList.printLL(head);
        System.out.println("\nThe Linked list after deleting a partincular node: ");
        LList.deleNode(third);
        LList.printLL(head);
    }
}
