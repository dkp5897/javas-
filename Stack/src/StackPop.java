import java.util.Stack;

class StackPop{
    public static void main(String[] args) {

        Stack<Integer> stack1= new Stack<>();
        Stack<String>stack2=new Stack<>();


        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(8);  // recent element

        stack2.push("Deepak");
        stack2.push("Gudiya");
        stack2.push("Prajapati");

        System.out.println("Stack-1: "+stack1);
        System.out.println("Stack-2: "+stack2);

        System.out.println("The poped or deleted element of stack-1: "+stack1.pop());
        System.out.println("The poped or deleted element of stack-2: "+stack2.pop());
        
        System.out.println("New Stack-1: "+stack1);
        System.out.println("New Stack-2: "+stack2);
    }
}