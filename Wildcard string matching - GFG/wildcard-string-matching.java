//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
static boolean memo(int i,int j,String s,String t,boolean [][]dp)
{

    if(i<0&&j<0)
    {
        return true;
    }
    if(i<0&&j>=0)
    {
        return false;
    }
    if(i>=0&&j<0)
    {
        for(int k=0;k<=i;k++)
        {
            if(s.charAt(k)!='*')
            {
                return false;
            }
        }
        return true;
    }
    if(dp[i][j]==true)
    {
        return true;
    }
    
    if(s.charAt(i)==t.charAt(j)||s.charAt(i)=='?')
    {
        return dp[i][j]=memo(i-1,j-1,s,t,dp);
    }
    if(s.charAt(i)=='*')
    {
        return dp[i][j]=memo(i-1,j,s,t,dp)||memo(i,j-1,s,t,dp);
    }
    return dp[i][j]=false;
 }
    static boolean match(String wild, String pattern)
    {
        // code here
      int n=wild.length();
      int m=pattern.length();
       
      boolean [][]dp=new boolean[n][m];
       
      return memo(n-1,m-1,wild,pattern,dp);
    }
}