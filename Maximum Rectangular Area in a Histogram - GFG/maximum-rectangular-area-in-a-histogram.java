//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long maxArea=0;
        long ps[]=prevSmaller(hist);
        long ns[]=nextSmaller(hist);
        
        for(int i=0;i<hist.length;i++)
        {
            long width=ps[i]-ns[i]-1;
            long area=hist[i]*width;
            
            
            if(area>maxArea)
            {
                maxArea=area;
            }
        }
        return maxArea;
    }
   static  long []prevSmaller(long hist[])
    {
        long ps[]=new long[hist.length];
        
        Stack<Integer>s=new Stack<>();
        
        s.push(hist.length-1);
        ps[hist.length-1]=hist.length;
        
        for(int i=hist.length-2;i>=0;i--)
        {
            while(s.size()>0&&hist[s.peek()]>=hist[i])
            {
                s.pop();
            }
    
            if(s.size()==0)
            {
                ps[i]=hist.length;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        
        return ps;
    }
    
   static long []nextSmaller(long hist[])
    {
        long ns[]=new long[hist.length];
        
        Stack<Integer>s=new Stack<>();
        
        s.push(0);
        ns[0]=-1;
        
        for(int i=1;i<hist.length;i++)
        {
            while(s.size()>0&&hist[s.peek()]>=hist[i])
            {
                s.pop();
            }
            
            if(s.size()==0)
            {
                ns[i]=-1;
            }
            else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }
        
}