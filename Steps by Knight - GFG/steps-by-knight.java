//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
     static class Point 
     {
        int x, y, steps;

        Point(int x, int y, int steps) 
        {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }
    
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n)
    {
        // Code here
        int[][] moves = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
        boolean[][] visited = new boolean[n][n];

        int knightX = knightPos[0] - 1;
        int knightY = knightPos[1] - 1;
        int targetX = targetPos[0] - 1;
        int targetY = targetPos[1] - 1;

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(knightX, knightY, 0));
        visited[knightX][knightY] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == targetX && current.y == targetY) {
                return current.steps;
            }

            for (int[] move : moves) {
                int newX = current.x + move[0];
                int newY = current.y + move[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < n && !visited[newX][newY]) {
                    queue.add(new Point(newX, newY, current.steps + 1));
                    visited[newX][newY] = true;
                }
            }
        }

        return -1; // If no valid path is found
    }
}