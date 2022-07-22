
public class StrReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java is a programming language. Java is a platform. Java is an Island";
		String rString=s1.replace("Java","Kava");
		System.out.println(rString);
		System.out.println(rString.replace("Kava", "Java"));
	}
}
