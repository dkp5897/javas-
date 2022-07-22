public class control_flow {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++)
        {
            //if we want that noone digit print aftre 5 then we use
            if(i==5)
            {
                break;
            }
            System.out.print(i+" ");
            
        }   
        System.out.println();
        for(int i=1; i<=10;i++)
        {
            if(i==7)
            {
                continue;       //continue--->skip that number if condition satisfied//
            }
            System.out.print(i+" ");
        }   
    }
    
}
