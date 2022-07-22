import java.util.*;
public class BalancedParentheses {
	
	public static boolean isValid(String s) 
    {
        // Edge Case:
        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')
            return false;
        
        Stack<Character> st = new Stack<Character>();
        int i=0;
        
        for (i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            // Push Opening Brackets to Stack
            if (c == '[' || c=='(' || c == '{')
            {
                st.push(c);
                continue;
            }
            
            if (st.isEmpty()) // No Opening Brackets
                return false;
            
            char check;
            
            switch (c)
            {
                    
                case ')': 
                    check = st.peek();
                    st.pop();
                    if (check == '{' || check == '[' )
                        return false;
                    break;

                case ']':
                    check = st.peek();
                    st.pop();                
                    if (check == '{' || check == '(' )
                        return false;
                    break;     
                    
                case '}': 
                    check = st.peek();
                    st.pop();
                    if (check == '(' || check == '[' )
                        return false;
                    break;                        
                
            }
        }
        
        return st.isEmpty();
        }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[{()}]";
		System.out.print(isValid(str));

	}

}
