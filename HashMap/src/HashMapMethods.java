import java.util.HashMap;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1=new HashMap<>();
		HashMap<Integer,String> map2=new HashMap<>();
		
		map1.put(1,"I");
		map1.put(2,"am");
		map1.put(3,"Deepak");
		map1.put(4,"Kumar");
		
		map2.put(1,"I");
		map2.put(2,"am");
		map2.put(3,"Pradeep");
		map2.put(4,"Kumar");
		
		System.out.println("Map1: "+map1);
		System.out.println("Map2: "+map2);
		
		// to clear all mapping
		
		map2.clear();
		System.out.println("The map2 after clear(): "+map2);
		
		// to print clone map
		Object map3=new HashMap<>();
		map3=map1.clone();
		System.out.println("The cloned map3 of map1: "+map3);
		System.out.println("The cloned map of map1: "+map1.clone());
		
		
		// Compute Methods to update our map
		
		HashMap<String,String> map4=new HashMap<>();
		map4.put("Name","Deepak");
		map4.put("Sallary", "50000");
		System.out.println("Map4: "+map4);
		// remap the values using compute() method
		
		map4.compute("Name", (key,val)->val.concat(" Kumar") );
		map4.compute("Sallary",(key,val)->val.concat(" Thousands"));
		System.out.println("Map4 after compute methods-1: "+map4);
		
		map4.compute("Name",(key,val)->val.replace("Deepak Kumar", "Pradeep Kumar"));
		System.out.println("Map4 after compute methods-2: "+map4);
		
		map4.compute("Sallary",(key,val)->key.replace("Sallary", "75000 Thousands"));
		System.out.println("Map4 after compute methods-3: "+map4);
		
		map4.compute("Name",(key,val)->key.replace("Name", "Priyansh"));
		System.out.println("Map4 after compute methods-4: "+map4);
		
		
		
		
		// HashMap computeIfAbsent() method
		
		HashMap<String,Integer> map5=new HashMap<>();
		map5.put("key-1", 25000);
		map5.put("key-2", 35000);
		map5.put("key-3", 45000);
		map5.put("key-4", 55000);
		
		System.out.println("map5:\n "+map5);
		
		map5.computeIfAbsent("key-5", k-> 65000);
		map5.computeIfAbsent("key-6",k->65000+10000);
		System.out.println("new map5:\n "+map5);
		
		
		
		
		//HashMap computeIfPresent(key, BiFunction) method
		
		HashMap<Integer,String> map6=new HashMap<>();
		map6.put(1, "Deepak");
		map6.put(2, "Kumar");
		map6.put(3, "Prajapati");
		
		System.out.println("map6:\n "+map6);
		
		map6.computeIfPresent(1 ,(key,val)->val+100);
		map6.computeIfPresent(2 ,(key,val)->val.replace("Kumar", "Singh"));
		map6.computeIfPresent(3 ,(key,val)->val.replace("Prajapati", "Radh"));
		map6.computeIfPresent(3 ,(key,val)->val+"aur");
		
		System.out.println("New map6:\n "+map6);
		
		
		
		//HashMap containsKey() Method
		
		HashMap<Integer,String> map7=new HashMap<>();
		
		map7.put(10, "Deepak");
		map7.put(20, "Kumar");
		map7.put(30, "Prajapati");
		
		System.out.println("Is key 20 present :"+map7.containsKey(20));
		
		System.out.println("Is key 80 present :"+map7.containsKey(80));
		
		
		
		
		//HashMap ContainsValue() Method
		
		HashMap<Integer,String> map8=new HashMap<>();
		
		map8.put(10, "Pradeep");
		map8.put(20, "Kumar");
		map8.put(30, "Prajapati");
		System.out.println("map8:\n"+map8);
		System.out.println("Is value Deepak present : "+map8.containsValue("Deepak"));
		System.out.println("Is value Kumar present : "+map8.containsValue("Kumar"));
		
		
		
		//HashMap entrySet() Method in Java
		
		HashMap<Integer,String> map9=new HashMap<>();
		
		map9.put(10, "Welcome");
		map9.put(20, "Dear");
		map9.put(30, "Pradeep");
		System.out.println("map9:\n"+map9);
		
		System.out.println("The set is:\n"+map9.entrySet());
		
		
		
		// HashMap KeySet() Method
		
		HashMap<Integer,String> map10=new HashMap<>();
		
		map10.put(10, "Welcome");
		map10.put(20, "Dear");
		map10.put(30, "Pradeep");
		System.out.println("map10:\n"+map10);
		
		System.out.println("The KeySet is:\n"+map10.keySet());

		
		//HashMap merge(key, value, BiFunction) method in Java
		
		HashMap<Integer,String> map11=new HashMap<>();
		HashMap<Integer,String> map12=new HashMap<>();
		
		map11.put(1,"I");
		map11.put(2,"am");
		map11.put(3,"Aditya");
		map11.put(4,"Kumar");
		
		map12.put(1,"My");
		map12.put(2,"Name is");
		map12.put(3,"Adarsh");
		map12.put(4,"Kumar");
		
		System.out.println("Map11: "+map11);
		System.out.println("Map12: "+map12);
		
		System.out.println("Map11 to String: "+map11.toString());
		System.out.println("Map11 to String: "+map12.toString());
		

        // provide value for new key which is absent using computeIfAbsent method
		map12.forEach((key,value)->map11.merge(key, value,(v1,v2)
														->v1.equalsIgnoreCase(v2)?v1:v1+","+v2));
		System.out.println("New HashMap: " + map11);
		
		
		//HashMap putAll() Method in Java
		
		HashMap<Integer,String> map13=new HashMap<>();
		
		map13.put(10, "Welcome");
		map13.put(20, "Dear");
		map13.put(30, "Pradeep");
		
		System.out.println("Map13: "+map13);
		HashMap<Integer,String> newMap13= new HashMap<>();
		
		newMap13.putAll(map13);
		System.out.println("newMap13: "+newMap13);
		
		
		
		// remove Method
		
		HashMap<Integer,String> map14=new HashMap<>();
		
		map14.put(10, "Welcome");
		map14.put(20, "Dear");
		map14.put(30, "Deepak");
		System.out.println("Map14: "+map14);
		
		String strr= (String)map14.remove(20);
		System.out.println("String Value : "+strr);
		System.out.println("Updated map14:"+map14);
		map14.remove(10);
		System.out.println("Updated map14:"+map14);
		
		
		
		
		//equals method in java
		
		HashMap<Integer,String> map15=new HashMap<>();
		HashMap<Integer,String> map16=new HashMap<>();
		map15.put(10, "Welcome");
		map15.put(20, "Dear");
		map15.put(30, "Deepak");
		
		map16.put(10, "Welcome");
		map16.put(20, "Dear");
		map16.put(30, "Deepak");		
		
		System.out.println("Map15: \n"+map15);
		System.out.println("Map16: \n"+map16);
		
		System.out.println(map15.equals(map16));
		
		System.out.println("Hashcode of map15: "+map15.hashCode());
		
		
		
		
		// AbstractMap hashCode() Method in Java
		
		
	}

}
