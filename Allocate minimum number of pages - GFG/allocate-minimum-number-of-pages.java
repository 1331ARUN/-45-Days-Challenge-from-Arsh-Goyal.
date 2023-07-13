//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    
    public static int countstudents(int []arr,int pages)
    {

        int students=1;
        long pagestudents=0;

        for(int i=0;i<arr.length;i++)
        {

            if(pagestudents+arr[i]<=pages)
            {
                pagestudents+=arr[i];
            }
            else{
                students+=1;
                pagestudents=arr[i];                            
                }
        }
        return students;
    }
    public static int findPages(int[]arr,int n,int m)
    {
        //Your code here
         if(m>n)
        {
            return -1;
        }

        int low=Integer.MIN_VALUE;
        int high=0;
        
        for(int i=0;i<n;i++)
        {
        
        high+=arr[i];
        if(arr[i]>low)
        {
            low=arr[i];
        }
        }
        while(low<=high)
        {

            int mid=(low+high)/2;
            
            int students=countstudents(arr, mid);

            if(students>m)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return low;
    }
}