public class NodeAddition {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // add last
    public void addLast(int new_data){
        Node new_node=new Node(new_data);
        if (head==null){
            head=new_node;
            return;
        }
        new_node.next=null;

        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=new_node;
    }

    // add after node
    public void addNode(Node prev_node,int new_data){
        if(prev_node==null){
            System.out.println("can't");
            return;
        }
        Node new_node=new Node(new_data);

        prev_node.next=new_node.next;
        prev_node.next=new_node;
    }

    // adding Node 
    public void addfront(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
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

        NodeAddition LList=new NodeAddition();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        head.next= second;
        second.next=third;

        LList.printLL(head);
        LList.addfront(0);
        LList.printLL(head);
        

        LList.addLast(5);
        LList.printLL(head);

        LList.addNode(third, 4);
        LList.printLL(head);


        
    }
}
