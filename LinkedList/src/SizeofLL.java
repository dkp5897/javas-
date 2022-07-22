
public class SizeofLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void printLL(Node head){
        int count=0;
        if(head==null){
            System.out.println("The Linked List is empty");
            return ;
        }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
                count++;
            }
            System.out.println("Null");
            System.out.println("The size of the Linked List="+count);
           
        }
       
    
    public static void main(String[] args) {

        SizeofLL LList =new SizeofLL();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third =new Node(3);
        Node fourth=new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        LList.printLL(head);
    }
}
