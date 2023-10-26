//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String S, String P)
    {
        // Your code here
        Map<Character, Integer> charFreqS = new HashMap<>();
        Map<Character, Integer> charFreqP = new HashMap<>();

        // Initialize character frequencies for string P
        for (char c : P.toCharArray()) {
            charFreqP.put(c, charFreqP.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int foundChars = 0;
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0;

        while (right < S.length()) {
            char charRight = S.charAt(right);
            charFreqS.put(charRight, charFreqS.getOrDefault(charRight, 0) + 1);

            if (charFreqP.containsKey(charRight) && charFreqS.get(charRight) <= charFreqP.get(charRight)) {
                foundChars++;
            }

            while (foundChars == P.length()) {
                if (right - left + 1 < minWindowLength) {
                    minWindowLength = right - left + 1;
                    minWindowStart = left;
                }

                char charLeft = S.charAt(left);
                charFreqS.put(charLeft, charFreqS.get(charLeft) - 1);

                if (charFreqP.containsKey(charLeft) && charFreqS.get(charLeft) < charFreqP.get(charLeft)) {
                    foundChars--;
                }

                left++;
            }

            right++;
        }

        if (minWindowLength == Integer.MAX_VALUE) {
            return "-1";
        }

        return S.substring(minWindowStart, minWindowStart + minWindowLength);
    }
    }