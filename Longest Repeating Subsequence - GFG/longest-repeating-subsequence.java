//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int n=str.length();
        return lcs(n,n,str,str);
    }
    
     static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][]=new int [x+1][y+1];
        return lcstab(x,y,s1,s2,dp);
    }
    static int lcstab(int x,int y,String s1,String s2,int dp[][])
    {
        
        for(int i=1;i<=x;i++)
        {
            
            for(int j=1;j<=y;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1)&&i!=j)
                {
                    
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    
                }
                
            }
            
        }
        return dp[x][y];
    }
}