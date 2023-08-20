//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.lastIndex( s));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution 
{
    public int lastIndex( String s) 
    {
         char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == '1') {
                return s.lastIndexOf('1', i);
            }
        }
        return -1;  // If no '1' is found
    }
    }