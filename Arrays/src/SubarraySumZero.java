import java.util.HashSet;

public class SubarraySumZero {
    static boolean SubArraysExist(int arr[],int n){
        int sum=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            sum+=0;
            set.add(sum);
            if(arr[i]==0||sum==0||set.contains(sum))
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 2, 3, 1, 6 };
        if(SubArraysExist(arr, arr.length))
        System.out.println("The subArray with zero sum exist");
        else
        System.out.println("The sub Array does't exist");
    }
}
