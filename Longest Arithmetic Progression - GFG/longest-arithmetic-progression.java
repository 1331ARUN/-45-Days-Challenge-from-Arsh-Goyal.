//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().lengthOfLongestAP(a, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int lengthOfLongestAP(int[] A, int n) 
    {
        if (n <= 2) {
            return n;
        }

        // Initialize a 2D table to store the length of the longest AP ending at index i and j
        // table[i][j] will store the length of LLAP ending with elements A[i] and A[j]
        int[][] table = new int[n][n];

        // Initialize the result to 2 (minimum LLAP length)
        int max_length = 2;

        // Initialize a HashMap to store the index of elements in A for efficient lookup
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        // Fill the indexMap
        for (int i = 0; i < n; i++) {
            indexMap.put(A[i], i);
        }

        // Fill the table for LLAPs ending at A[i] and A[j]
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = A[j] - A[i];
                int prev = A[i] - diff; // Find the previous element in the AP

                // If prev exists in A and is before A[i]
                if (indexMap.containsKey(prev) && indexMap.get(prev) < i) {
                    table[i][j] = table[indexMap.get(prev)][i] + 1;
                } else {
                    table[i][j] = 2; // At least two elements in the AP (A[i] and A[j])
                }

                max_length = Math.max(max_length, table[i][j]);
            }
        }

        return max_length;
    }
}
