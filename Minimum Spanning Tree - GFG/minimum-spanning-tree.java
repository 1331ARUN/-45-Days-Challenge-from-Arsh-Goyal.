//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java
class Pair implements Comparable<Pair>
{
    int v;
    int wt;
    Pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
    public int compareTo(Pair that){
        return this.wt-that.wt;
    }
}
class Solution{
    static int spanningTree(int V, int E, int edges[][]){
        // Code Here. 
        boolean vis[]=new boolean[V];
        int ans=0;
        PriorityQueue<Pair> q=new PriorityQueue<>();
        ArrayList<ArrayList<Pair>> a=new ArrayList<ArrayList<Pair>>();
        for(int i=0;i<V;i++)
        a.add(new ArrayList<>());
        
        
        for(int[] i:edges){
            a.get(i[0]).add(new Pair(i[1],i[2]));
            a.get(i[1]).add(new Pair(i[0],i[2]));
            
        }   
         q.add(new Pair(0,0));
         while(!q.isEmpty()){
             Pair curr=q.poll();
             int u=curr.v;
             if(vis[u]){
                 continue;
             }
             vis[u]=true;
             ans+=curr.wt;
             for(Pair n:a.get(u)){
                 if(!vis[n.v])
                  q.add(new Pair(n.v,n.wt));
             }
         }
         return ans;
    }

}