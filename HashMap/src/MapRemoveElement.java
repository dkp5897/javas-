import java.util.*;
public class MapRemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Deepak");
		map.put(2, "Kumar");
		map.put(3, "Prajapati");
		
		System.out.println("Initial map: "+map);
		
		map.remove(3);
		System.out.println("Updated map: "+map);
		
		map.remove(2, "Kumar");
		System.out.println("Updated map: "+map);
		
		map.remove(1,"Kumar");// 1st element will not remove because it is not right value
		System.out.println("Updated map: "+map);
		
		map.remove(1,"Deepak");
		System.out.println("Updated map: "+map);

	}

}
