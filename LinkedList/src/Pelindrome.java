import java.util.*;
public class Pelindrome {static Node head;
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public boolean isPelindrome(Node head){
        Stack<Integer> stk=new Stack<>();
        Node temp=head;
        while(temp!=null){
            stk.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=(int)stk.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
public static void main(String[] args) {
    Pelindrome LList=new Pelindrome();
    LList.head=new Node(1);
    Node second=new Node(2);
    Node third=new Node(2);
    Node fourth=new Node(1);

    head.next=second;
    second.next=third;
    third.next=fourth;

    System.out.println(LList.isPelindrome(head));
        
    }
}
