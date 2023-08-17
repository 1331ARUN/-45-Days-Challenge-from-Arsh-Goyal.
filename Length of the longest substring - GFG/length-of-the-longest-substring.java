//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String s){
        int[] chars = new int[256];
Arrays.fill(chars, -1);
 int maxlen=0;
        int start=-1;
        for(int i=0;i<s.length();i++)
        {
        if (chars[s.charAt(i)] > start)
        {
        start = chars[s.charAt(i)];
        }
        chars[s.charAt(i)] = i;
        maxlen = Math.max(maxlen, i - start);
     }
        return maxlen;
    }
}