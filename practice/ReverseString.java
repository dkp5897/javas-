import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseString {
    // method-1
    static void reverse(String s){
        StringBuffer str=new StringBuffer();
        str.append(s);
        str.reverse();
        System.out.println(str.toString());
    }
    // Method-2
    static void reverse2(String s){
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[arr.length-1-i]);
        }
    }
    //method-3
    static void reverse3(String s){
        Stack<Character> st=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while(!st.empty())
        {
            str+=st.pop();
        }
        System.out.println(str);
    }
    //Method-04
    static void reverse4(String s, int start,int end){
        char arr[]=s.toCharArray();
        char temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(char e:arr){
            System.out.print(e);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        // reverse(str);
        // reverse2(str);
      //  reverse3(str);
      reverse4(str, 0,str.length()-1);
    }
}
