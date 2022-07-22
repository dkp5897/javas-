import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Deepak");
		map.put(2, "Kumar");
		map.put(3, "Prajapati");
		
		// Iterate the map using for-each loop
		
		for(Entry<Integer, String> e:map.entrySet())
		{
			System.out.println("Key: "+e.getKey()+" ,Value: "+e.getValue());
		}
		
		for(Map.Entry<Integer, String> e:map.entrySet())
		{
			System.out.println("Key: "+e.getKey()+" ,Value: "+e.getValue());
		}

	}

}
