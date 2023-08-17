//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String input) {
        // code here
        HashSet<Character> seen = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) 
        {
            char current = input.charAt(i);
            if (!seen.contains(current)) 
            {
                seen.add(current);
                output.append(current);
            }
        }

        return output.toString();
    }
}

