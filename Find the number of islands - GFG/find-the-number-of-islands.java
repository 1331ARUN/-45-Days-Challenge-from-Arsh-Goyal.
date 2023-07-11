//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends
class Solution 
{
    // Function to find the number of islands.
    public int numIslands(char[][] grid) 
    {
        // Code here
        int rows=grid.length;
        
        if(rows==0)
        {
            return 0;
        }
        
        int cols=grid[0].length;
        int noislands=0;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                
                if(grid[i][j]=='1')
                {
                    founded(grid,i,j,rows,cols);
                    noislands++;
            
                }
            }
        }
        return noislands;
    }
    private void founded(char grid[][],int i,int j,int rows,int cols)
    {
        
        if(i<0||i>=rows||j<0||j>=cols||grid[i][j]!='1')
        {
            
            return ;
        }
        grid[i][j]='0';
        
        founded(grid,i+1,j,rows,cols);
        founded(grid,i,j+1,rows,cols);
        founded(grid,i-1,j,rows,cols);
        founded(grid,i,j-1,rows,cols);
        
        founded(grid,i+1,j+1,rows,cols);
        founded(grid,i-1,j-1,rows,cols);
        founded(grid,i-1,j+1,rows,cols);
        founded(grid,i+1,j-1,rows,cols);

    }
}


