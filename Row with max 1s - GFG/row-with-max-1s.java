//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution 
{
    int rowWithMax1s(int arr[][], int n, int m)
    {
        // code here
    //     int max=0;
    //     int r=0;
        
    //     for(int i=0;i<arr[0].length-1;i++)
    //     {
    //         int ans=binarysearch(arr,i);
            
    //         if(ans>max)
    //         max=ans;
    //         r=i;
    //     }
    // return r;
    // }
    
    // public static int binarysearch(int [][]arr,int r)
    // {
    //     int lo=0;
    //     int hi=arr[0].length-1;
    //     int fil=arr[0].length;
        
    //     while(lo<=hi)
    //     {
    //         int mid=(lo+hi)/2;
            
    //         if(arr[r][mid]==1)
    //         {
    //             fil=mid;
    //             hi=mid-1;
    //         }
    //         else{
    //             lo=mid+1;
    //         }
            
    //     }
    //     int count=arr[0].length-fil;
        
    //     return count;
    //
    
    // int col=m-1;
    // int row=-1;
    // for(int i=0;i<n;i++)
    // {
    //     for(int j=col;j>=0;j--)
    //     {
    //         if(arr[i][j]==1)
    //         {
    //             row=i;
    //             col--;
    //         }
    //         else 
    //         {
    //             break;
    //         }
    //     }
    // }
    // return row;
    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[j][i]==1)
            return j;
        }
    }
    return -1;
    }
}