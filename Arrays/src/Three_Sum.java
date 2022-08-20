import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Three_Sum {

    static List<List<Integer>> threeSum(int arr[],int n){
        HashSet<List<Integer>> res=new HashSet<>();

        if (arr.length < 3) {
            return Collections.emptyList();
        }

        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    res.add(Arrays.asList(arr[i],arr[j++],arr[k--]));
                }

                // As the array is already sorted. j being the left pointer (pointing to lower numbers ) and k being the right pointer (pointing to higher numbers), with a static index i. If nums[i] + nums[j] + nums[k] is greater than target then we know we need to select the next highest number hence k--. Same way when the sum is lower we need to select a number just higher than the lowest.

                else if(sum>0) k--;
                else if(sum<0) j++;
            }
        }
        return new ArrayList<>(res); 
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4,5};

        List<List<Integer>> list= threeSum(arr, arr.length);
        // for (int i = 0; i < list.size(); i++) {
        //     for (int j = 0; j < list.get(i).size(); j++) {
        //         System.out.print(list.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println(list);
    }
}
