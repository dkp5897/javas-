// Longest Substring Without Repeating Characters


import java.io.*;
import java.util.*;
  
public class StringLengthWithUniqueChar {


/*
//Method-(1):Brute Force
	
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    static boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }

        return true;
    }

*/
	
	
	
	// Method-2: Sliding Window

/*
    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }

*/
	
	//Method-(3): Sliding Window Optimized
	
/*	
	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	
*/

	
	// Method-(4): Java (Assuming ASCII 128)
	
	    public static int lengthOfLongestSubstring(String s) {
	        Integer[] chars = new Integer[128];

	        int left = 0;
	        int right = 0;

	        int res = 0;
	        while (right < s.length()) {
	            char r = s.charAt(right);

	            Integer index = chars[r];
	            if (index != null && index >= left && index < right) {
	                left = index + 1;
	            }

	            res = Math.max(res, right - left + 1);

	            chars[r] = right;
	            right++;
	        }

	        return res;
	    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		System.out.println("The unique length of String ="+lengthOfLongestSubstring(S));

	}

}



