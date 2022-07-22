void printList(Node head)
{
	node.head=new node(1);
	node.second=new node(2);
	node.third=new node(3);
	node.forth=new node(4);
	node.tail=new node(5);
	for(int e:node)
	{
		System.out.print(e+" ");
	}
}


int getCount(Node head)
{
    int temp=head;
    int count=0;
    while(temp!=null)
    {
    	count++;
    	temp=temp.next;
    }
    return count;

}


boolean searchNode(Node head, int key)
{
    Node temp=head;
    while(temp!=null)
    {
    	if(temp.data==key)
    		return true;
    	temp=temp.next;
    }
    return false;
}



int KthNode(Node head, int K)
{
    Node temp=head;
    while(temp!=null)
    {
    	if(temp==key)
    		return temp.data;
    	temp=temp.next;
    }
    return -1;
}


int  getMiddle(Node head)
{
    Node temp=head;
    int count=0;
    while(temp!=null)
    {
        count++;
        temp=temp.next;
    }
    return (count/2).data;
}






Qs : flames


Code:-1

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    
    String res[]={"Siblings","Friends","Love","Affection","Marriage","Enemy"};
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1=sc.nextLine();
    char c[]=s.toCharArray();
    char c1[]=s1.toCharArray();
    Arrays.sort(c);
    Arrays.sort(c1);

    int i=0,j=0,c11=0;
    while(i<c.length && j<c1.length)
    {
        int ii=c[i];
        int jj=c1[j];
        if(ii==jj)
        {
            c11++;
            i++;
            j++;
        }
        else if(ii<jj)
        i++;
        else
        j++;
    }

    int sl=c.length+c1.length;
    sl-=2*c11;
    System.out.println(res[sl%6]);
    }
}



Code:-2

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1;
        String str2;
        str1=sc.next();
        str2=sc.next();

        int count1[]=new int[26];
        int count2[]=new int[26];

        for(int i=0;i<str1.length();i++){
            count1[str1.charAt(i)-'a']++;
            // System.out.println(count1[i]+"   count 1");
        }

        for(int i=0;i<str2.length();i++){
            count2[str2.charAt(i)-'a']++;
            // System.out.println(count2[i]+"  count 2");
        }

        int sum=0;
        for(int i=0;i<26;i++){
            sum+=Math.abs(count2[i]-count1[i]);
        }

        sum=sum%6;

        switch(sum){
            case 1:
                System.out.println("Friends");
                break;

            case 2:
                System.out.println("Love");
                break;

            case 3:
                System.out.println("Affection");
                break;

            case 4:
                System.out.println("Marriage");
                 break;
                
            case 5:
                System.out.println("Enemy");
                break;

            case 0:
                System.out.println("Siblings");
        }
    }
}




Code:-3



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                Scanner sc=new Scanner(System.in);
        StringBuffer s1=new StringBuffer(sc.next());
        StringBuffer s2=new StringBuffer(sc.next());
        
        char c,d;
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            for(int j=0;j<s2.length();j++)
            {
                d=s2.charAt(j);
                if(c==d)
                {
                    s1.deleteCharAt(i);
                    s2.deleteCharAt(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
         int sum = s1.length() + s2.length();
         sum = sum % 6;
         if(sum == 0){
         System.out.println("Siblings");     
         }
         else if(sum==1){
            System.out.println("Friends"); 
         }
         else if(sum==2)
         {
            System.out.println("Love");
         } 
        else if(sum==3)
            {
            System.out.println("Affection"); 
            }
        else if(sum==4)
            {
            System.out.println("Marriage"); 
            }
        else if(sum==5){
            System.out.println("Enemy"); 
            }
        
    }
}