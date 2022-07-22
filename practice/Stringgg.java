import java.lang.String;
public class Stringgg {
    public static void main(String[] args) {
        
        String s1= "Deepak Kumar";
        String s2="Deepak Kumar";
        char [] ch={'P','A','R','I'};
        String s3=new String(ch);
        String s4=new String("Pradeep");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.concat(s2));
        String s=s2.concat(s3);
        System.out.println(s);
        System.out.println(s1==s2);

    }
}
