public class MiddleNode03 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void middleNode(Node head){
        Node mid=head;
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(count%2==1){
                mid=mid.next;
            }
            count++;
            temp=temp.next;
        }
        System.out.print("The middle Node is: "+mid.data);

    }
    public static void main(String[] args) {
        MiddleNode03 LList=new MiddleNode03();
        
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
