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
        int minDistance = Integer.MAX_VALUE;
        int word1Index = -1;
        int word2Index = -1;

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1)) {
                word1Index = i;
                if (word2Index != -1) {
                    minDistance = Math.min(minDistance, Math.abs(word1Index - word2Index));
                }
            } else if (s.get(i).equals(word2)) {
                word2Index = i;
                if (word1Index != -1) {
                    minDistance = Math.min(minDistance, Math.abs(word1Index - word2Index));
                }
            }
        }

        // Check if both words were found in the list
        if (word1Index == -1 || word2Index == -1) {
            return 0; // Return -1 if either word is missing
        }

        return minDistance;
    }
}
