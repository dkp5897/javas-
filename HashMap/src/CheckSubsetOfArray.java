import java.util.HashMap;
import java.util.HashSet;

public class CheckSubsetOfArray {
    // method-1 Bruet force solution
    static boolean subset(int a[],int b[],int n, int m){
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(b[i]==a[j])
                count++;
            }
        }
        if(count==m)
        return true;

        return false;
    }

    // Optimize solution TC: O(n*logn), SC: O(n)
    static boolean subset2(int a[],int b[], int n, int m){
        HashSet<Integer> set=new HashSet<>();
        for(int e:a){
            set.add(e);
        }
        for(int i=0;i<m;i++){
            if(!set.contains(b[i]))
            return false;
        }
        return true;
    }

    // By using mapping TC:O(m+n), SC:(n)

    static boolean subset3(int a[],int b[], int n, int m){
        HashMap<Integer, Integer>map=new HashMap<>();
        //Increase the frequency of each element
        for(int e:a){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int e:b){
            if(map.getOrDefault(e, 0)>0){
                map.put(e, map.get(e)-1);
            }
            else
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[]={14,25,36,78,89,63};
        int arr2[]={25,63,80};

        boolean ans=subset(arr1, arr2, arr1.length, arr2.length);
        System.out.println(ans);

        boolean ans2=subset2(arr1, arr2, arr1.length, arr2.length);
        System.out.println(ans2);

        boolean ans3=subset3(arr1, arr2, arr1.length, arr2.length);
        System.out.println(ans3);


    }
}
