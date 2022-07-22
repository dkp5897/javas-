public class MiddleNodeLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // 
    public int middlNode(Node head){
        Node temp=head;
        //Node temp2=head;
        int count=0;
        int index=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            int middle=count/2;
            if(middle==index){
                return temp.data;
            }
            index++;
            temp=temp.next;
        }
       return -1;
    }
    public static void main(String[] args) {
        MiddleNodeLL LList=new MiddleNodeLL();
        LList.head=new Node(100);
        Node second=new Node(200);
        Node third =new Node(300);
        Node fourth=new Node(400);
        Node fifth=new Node(500);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        int ans=LList.middlNode(head);
        System.out.print("The middle Node data is "+ans);
    }
}
