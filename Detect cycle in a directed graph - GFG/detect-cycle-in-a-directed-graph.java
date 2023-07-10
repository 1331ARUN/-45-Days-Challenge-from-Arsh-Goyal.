//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
         int[] visited = new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                if(bfs(i,visited,adj)){
                    return true;
                }
            } 
        }
        return false;
    }
    public boolean bfs(int src,int[] visited,ArrayList<ArrayList<Integer>> adj){
        visited[src]=2;
        ArrayList<Integer> temp = adj.get(src);
        for(int i:temp){
            if(visited[i]==0){
                if(bfs(i,visited,adj)) return true;
            }
            else if(visited[i]==2) return true;
        }
        visited[src]=1;
        return false;
    }
}