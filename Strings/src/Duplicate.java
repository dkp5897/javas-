import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate {
    static void countDuplicateChar(String str){
        HashMap<Character, Integer> map=new HashMap<>();
        char arr[]=str.toCharArray();
        for(char c:arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        String str="Deepak kumar";
        countDuplicateChar(str);
    }
}
