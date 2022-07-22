public class MiddleNodeLL02 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // Middle Node by two pointers method

    public void middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
           fast=fast.next.next;
            slow=slow.next;
        }
        System.out.print("The middle Node is: "+slow.data);
    }
    public static void main(String[] args) {

        MiddleNodeLL02 LList=new MiddleNodeLL02();

        LList.head=new Node(100);
        Node second=new Node(200);
        Node third=new Node(300);
        Node fourth=new Node(400);

        head.next=second;
        second.next=third;
        third.next=fourth;

        LList.middleNode(head);
        
    }
}
