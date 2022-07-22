public class DeleteNode {
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
        
    
    
    // deleteifirst

    public void deleteFist(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        head=head.next;
    }

    //deletyelast
    public void deleteLast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        else if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }

    public void delete(int key){
        Node temp=head;
        Node prev=null;
        if(head!=null &&  temp.data==key ){
            head=temp.next;
            return;
        }
        while(temp!=null && temp.data!=key){
            prev=head;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Not present");
            return ;
        }
        prev.next=temp.next;
    }

    public static void main(String[] args) {

        DeleteNode LList=new DeleteNode();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        head.next= second;
        second.next=third;

        LList.printLL(head);

        LList.deleteFist();
        LList.printLL(head);

        LList.deleteLast();
        LList.printLL(head);

        LList.delete(3);
        LList.printLL(head);
        
    }
}
