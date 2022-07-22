package javaEclips;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Deepak!";
		String name4="DEEPAK";
		String name6="abcd#@67189q!";
		System.out.println(name);
		int len=name.length();			//String_name.length()
		System.out.println(len);
		
		
		
		String lower=name6.toLowerCase();
		System.out.println(lower);
		
		String upper=name.toUpperCase();
		System.out.println(upper);
		
		
		
		
		//trimming of string//
		
		String name2="   Deepak kumar    ";
//		System.out.println("\n"+ name2);
//		System.out.println(name2.trim());//this will trimmed the unusual space//
		
		
		
		
		
		
		//substring-->to print index no.(given) to the last of string//
		
		System.out.println(name.substring(2)); // it start printing form position 2 to last
		System.out.println(name.substring(1,4));// it print from 1 to 3 position
		
		
		
		
		
		
		
		//name.replace--->this is use for replacing a character//
		String name3="Dipak";
		System.out.println(name.replace('e', 'i'));// it will replace all 'e' to 'i'
		System.out.println(name.replace("pak", "dak"));// this will replace a sequence of character//
		System.out.println(name3.replace("i", "ee"));
		
		
		
		
		
		System.out.println(name2.replaceAll(name2, name));//this will replace all string with other string 
		System.out.println(name2);							// but not change the string
		
		
		
		
		
		
		/*startsWith --->it will check that string strat with*/
		
		System.out.println(name.startsWith("Dee"));	// if it is right than it will give true
		System.out.println(name.startsWith("ee"));
		
		
		
		
		
		/*endsWith--->*/
		
		System.out.println(name.endsWith("r"));// it will check end with
		
		
		
		
		/* charAt() --> it will give the character at a specified position*/
		
		System.out.println(name.charAt(2));//----->e at third not second position
		
		
		
		
		
		/* indexOf(str)---> this will return the first position of a charater or group of char..*/
		
		System.out.println(name.indexOf('e'));			// position of 'e'
		System.out.println(name.indexOf("pak"));		// position of "pak"
		System.out.println(name.indexOf("ka"));			// if string or char is not present than it will return -1
		System.out.println(name.lastIndexOf('k'));		//it start searching from last but give position from start
		
		System.out.println(name.equals(name3));			// it will compare two string 
		System.out.println(name.equalsIgnoreCase(name4));// It compare without caring about case is upper or lower 
			

	}

}
