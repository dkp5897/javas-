package javaEclips;

public class Practice_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* problem-02//-->replace spaces between string to __*/
		String str="I am Deepak kumar";
		System.out.println(str.replace( " " , "_"));
		
		/*problem-03 /-->>print a letter templete like-letter="Dear<|name|>,thank a lot*/
		String letter="Dear <|name|>, Thanks a lot";
		letter=letter.replace("<|name|>" , "Deepak");
		System.out.println(letter);
		
		/*problem-04/-->>  program to find double and treple Spaces */
		String str2="Hello  I am Deepak   Kumar";
		System.out.println(str2.indexOf("  ")); 		// it will give the position of double space
		
		System.out.println(str2.indexOf("   "));
		
		/* problem-05/ --> a program to formate a letter*/
		String str3="Dear Deepak, You have completed my java course.COngratualation";
		String str4="Dear Deepak,\n\tYou have completed my java course.\n\n\tCongratualation";
//		System.out.println(str3);
		System.out.println(str4);
		

	}

}
