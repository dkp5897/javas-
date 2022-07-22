public class SearchKeyLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // check a key is present in the LL or not
    public boolean searchLL(Node head, int key){
        Node new_node=new Node(key);
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {

        SearchKeyLL LList= new SearchKeyLL();
        LList.head=new Node(1);
        Node second=new Node(2);
        Node third =new Node(3);
        Node fourth=new Node(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println(LList.searchLL(head, 2));
    }
}
