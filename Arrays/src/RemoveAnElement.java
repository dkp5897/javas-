import java.util.ArrayList;

public class RemoveAnElement {
    static void remove(int arr[],int val){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                list.add(arr[i]);
            }
        }
        
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,2,4,5,};
        int val=4;
        remove(arr, val);
        
    }
  
}
