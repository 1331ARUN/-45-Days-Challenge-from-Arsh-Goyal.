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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countNumberswith4(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countNumberswith4(int N) {
        // code here
         int count = 0;
        for (int num = 1; num <= N; num++) {
            if (containsDigit4(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean containsDigit4(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 4) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
};