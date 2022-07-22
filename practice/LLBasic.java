public class LLBasic {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // print LL
    public void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LLBasic LList=new LLBasic();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        head.next= second;
        second.next=third;

        LList.printLL(head);
    }
}
