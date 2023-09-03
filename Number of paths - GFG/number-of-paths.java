//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}




// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int m, int n) {
        // Code Here
        long[][]dp=new long[m][n];
        
        for(int i=0;i<m;i++)
        {
            dp[i][0]=1;
        }
        
        for(int j=0;j<n;j++)
        {
            
            dp[0][j]=1;
        }
        
        for(int i=1;i<m;i++)
        {
            
            for(int j=1;j<n;j++)
            {
                
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    
}