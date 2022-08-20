public class CircularQueueByArray {

    static class CircularQueue{
        int arr[];
        int size;
        int rear=-1;
        int front=-1;
        CircularQueue(int n){
            arr=new int[n];
            this.size=n;
        }
        
        // to check empty
        public boolean isEmpty(){
            return (rear == -1 && front == -1);
        }

        // to check full
        public boolean isFull(){
            return (rear+1)%size== front;
        }

        // Enqueue
        public void add(int data){
            if(isFull()){
                System.out.println("The circular Queue is full");
                return;
            }
            // for first element addition
            else if(front ==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //Dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("The circular queue is empty");
                return -1;
            }
            int res=arr[front];
            // single element condition
            if(rear==front){
                rear=front=-1;
            }
            else{

                front=(front+1)%size;
            }
            
            return res;
        }

        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);

        System.out.println("first remove element:"+cq.remove());
        cq.add(12);
        System.out.println("second remove element:"+cq.remove());
        cq.add(15);

        while(!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
