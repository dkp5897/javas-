
public class MutableString {

	public static void main(String[] args) {
		
		//(1) StringBuffer Class append() Method
		
//		StringBuffer sb =new StringBuffer("Deepak");
//		sb.append(" Kumar");		//now original string is changed  
//		System.out.println(sb);
//		sb.append(" Prajapati");
//		System.out.println(sb);
		
		
		
		
		//2) StringBuffer insert() Method
		
//		StringBuffer sb2=new StringBuffer("Hello");
//		sb2.insert(2, " Deepak");	// it insert Deepak into sb2 at 2 position
//		System.out.println(sb2);
		
		
		
		
		//3) StringBuffer replace() Method
		
//		StringBuffer sb3=new StringBuffer("Pradip");
//		sb3.replace(4, sb3.length(),"eep");
//		System.out.println(sb3);
		
		
		
		
		//4) StringBuffer delete() Method
		
//		StringBuffer sb4=new StringBuffer("Priyansh");
//		sb4.delete(5, sb4.length());
//		System.out.println(sb4);	
		
		
		
		//5) StringBuffer reverse() Method
		
//		StringBuffer sb5 =new StringBuffer("Divyansh");
//		sb5.reverse();
//		System.out.println(sb5);
		
		//6) StringBuffer capacity() Method
		
//		StringBuffer sb6=new StringBuffer("");
//		System.out.println(sb6.capacity());// Default capacity=16
//		sb6.append("Hello");
//		System.out.println(sb6.capacity());// now capacity=16
//		sb6.append(" I am Deepak Kumar");
//		System.out.println(sb6);
//		System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		//(7) StringBuffer ensureCapacity() method
		
		StringBuffer sb7=new StringBuffer("");
		System.out.println(sb7.capacity());		// Default capacity=16
		sb7.append("Varya");
		System.out.println(sb7.capacity());// now capacity=16
		sb7.append(" will become a Doctor");
		System.out.println(sb7.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb7.ensureCapacity(10);
		System.out.println(sb7.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb7.ensureCapacity(50);
		System.out.println(sb7.capacity());// now (34*2)+2=70 i.e (oldcapacity*2)+2
	}
}
