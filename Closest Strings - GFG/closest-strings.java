//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int ans=Integer.MAX_VALUE;
        int first=-1;
         int last=-1;
        for(int i=0;i<s.size();i++)
        {
            if(s.get(i).equals(word1))
            {
            first=i;
           // break;
            }
        //}
       
        
        // for(int i=s.size()-1;i>=0;i-- )
        // {
            if(s.get(i).equals(word2))
            {
                last=i;
                //break;
            }
            if(first != -1 && last != -1)
            {
                ans = Math.min(ans,Math.abs(first-last));
            }
    }
       // }
       // return Math.abs(last-first);
       return ans;
    }
};


// int ans = Integer.MAX_VALUE;
//         int first = -1;
//         int second = -1;
//         for(int i=0;i<s.size();i++){
//             if(s.get(i).equals(word1)){
//                 first = i;
//             }
//             if(s.get(i).equals(word2)){
//                 second = i;
//             }
            
//             if(first != -1 && second != -1)
//             {
//                 ans = Math.min(ans,Math.abs(first-second));
//             }
//         }
//         return ans;