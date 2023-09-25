//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] vac = new int[n];
            int[] per = new int[n];
            
            for (int i = 0; i < n; ++i)
                vac[i] = sc.nextInt ();
            for (int i = 0; i < n; ++i)
                per[i] = sc.nextInt ();

    		System.out.println (new Solution().isPossible (per, vac, n));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int isPossible (int per[], int vac[], int n)
    {
        // your code here
        Arrays.sort(per);
        Arrays.sort(vac);
        for(int i=0;i<n;i++)
        {
            if(vac[i]<per[i])
            {
                return 0;
            }
        }
        return 1;
    }
}