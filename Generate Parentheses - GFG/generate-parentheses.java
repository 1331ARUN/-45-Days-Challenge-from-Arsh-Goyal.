//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        
        List<String>ans=new ArrayList<>();
        
        helper("(",1,0,ans,n);
        return ans;
    }
    
    void helper(String current,int open,int closed,List<String>ans,int n)
    {
        
        if(current.length()==2*n)
        {
            
            ans.add(current);
            return ;
        }
        
        if(open<n)
        {
            helper(current+"(",open+1,closed,ans,n);
        }
        if(closed<open)
        {
            helper(current+")",open,closed+1,ans,n);
        }
    }
}