public class ReverseLL {

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

    // Reverse
    public void reverse(){
        Node prevNode=head;
        Node currentnode=head.next;
        if(head==null || head.next==null){
            return;
        }

        while(currentnode!=null){
            Node nextNode=currentnode.next;
            currentnode.next=prevNode;

            // update
            prevNode=currentnode;
            currentnode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    //printLL

    public static void main(String[] args) {

        ReverseLL LList=new ReverseLL();

        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        head.next= second;
        second.next=third;

        LList.printLL(head);
        LList.reverse();
        LList.printLL(head);
        
    }
}
