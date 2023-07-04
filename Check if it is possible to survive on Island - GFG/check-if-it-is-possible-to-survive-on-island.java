//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String arr[] = in.readLine().trim().split("\\s+");
            int S = Integer.parseInt(arr[0]);
            int N = Integer.parseInt(arr[1]);
            int M = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.minimumDays(S, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int minimumDays(int S, int N, int M)
    {
        // code here
        
        int days;
        if(((N*6)<(M*7) && S>6)||M>N)
        {
            return -1;
        }
        else{
            days=(M*S)/N;
            if(((M*S)%N)!=0)
            {
            days+=1;
            }
        }
        
        return days;
    }
}