public class nthNode {
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
        if(head==null){
            System.out.println("Empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
}

    public int nthNode(int index){
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(count==index){
                return temp.data;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {

        nthNode LList=new nthNode();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        head.next= second;
        second.next=third;

        LList.printLL(head);
        int ans=LList.nthNode(2);
       System.out.println(ans);
        
    }
}
