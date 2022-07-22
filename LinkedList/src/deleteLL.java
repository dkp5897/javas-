public class deleteLL {
    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // delete LL 
    static void deleteLL(){
        head=null;
        return;
    }

    //printLL

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
    public static void main(String[] args) {
        deleteLL LList=new deleteLL();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third= new Node(3);
        Node fourth= new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println("The Old Linked list: ");
        LList.printLL(head);


        System.out.println("Now new Linked List: ");
        LList.deleteLL();
        LList.printLL(head);
    }
}