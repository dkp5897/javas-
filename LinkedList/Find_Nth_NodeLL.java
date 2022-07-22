public class Find_Nth_NodeLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // find nth Node

    public int findNode(int index){
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

    // Nth Node from end Method-01
    public int NthfromEnd(int endIndex){

        int count=0,index=0;
        Node temp=head;
        while(temp!=null){      // it will give size of LL
            count++;                
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if((count-index)==endIndex){
                return temp.data;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }

    //Method-02 end index

    public int NthfromEnd2(int endIndex){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len<endIndex)
        return -1;

        temp=head;
        for(int i=1;i<len-endIndex+1;i++){
            temp=temp.next;
        }
        return temp.data;
    }

public void printNthFromLast(Node head, int n)
{
	int i = 0;
	if (head == null)
		return;
	printNthFromLast(head.next, n);

	if (++i == n)
		System.out.print(head.data);
}

    public static void main(String[] args) {

        Find_Nth_NodeLL LList=new Find_Nth_NodeLL();

        LList.head=new Node(100);
        Node second=new Node(200);
        Node third =new Node(300);
        Node fourth=new Node(400);

        head.next=second;
        second.next=third;
        third.next=fourth;

        int index=3;
        int ans=LList.findNode(index);
        System.out.printf("The value at index %d is %d",index,ans);

        int endIndex=3;
        int ans2=LList.NthfromEnd(endIndex);
        System.out.printf("\nThe value at index %d from end is %d",endIndex,ans2);

        int ans3=LList.NthfromEnd2(endIndex);
        System.out.printf("\nThe value at index %d from end is %d",endIndex,ans3);

        LList.printNthFromLast(head, endIndex);
    }
}
