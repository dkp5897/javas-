import java.util.*;
public class StackBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> S=new Stack<Integer>();
		
		S.push(1);
		S.push(2);
		S.push(6);
		S.push(5);
		System.out.print("The element in the Stack: ");
		System.out.print(S+" "+"\n");
		System.out.println("Size of Stack :  "+S.size());
		
		System.out.println("The top most Elements:  "+S.peek());
		
		System.out.println("Deleted Element:  "+S.pop());
		System.out.print("The element in the Stack after removing the top element: ");
		System.out.print(S+" "+"\n");
		
		System.out.println("Stack is Empaty: "+S.isEmpty());
		
		System.out.println("Stack Traversal");
		
		while(!S.isEmpty())
		{
			System.out.print(S.pop()+" ");
		}
		
	}

}
