//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution 
{
    public static ArrayList<String> findPath(int[][] m, int n) 
    {
        // Your code here
        ArrayList<String>al=new ArrayList<>();
        helper(m,al,0,0,"",n);
        
        return al;
    }
    
//   static void helper(int arr[][],ArrayList<String>al,int i,int j,String path,int n)
//     {
        
//         if(i<0||i>=n||j<0||j>=n||arr[i][j]==0)
//         {
//             return ;
//         }
        
//         if(i==n-1||j==n-1)
        
//         {
//             al.add(path);
//             return ;
//         }
        
//         arr[i][j]=0;
        
//         helper(arr,al,i+1,j,path+"D",n);
        
//         helper(arr,al,i,j-1,path+"L",n);
        
        
//         helper(arr,al,i,j+1,path+"R",n);
        
//         helper(arr,al,i-1,j,path+"U",n);
        
//         arr[i][j]=1;
        
        
//         return ;
//     }


private static void helper(int[][] m, ArrayList<String> al, int i,int j,String path,int n)
{

    if(i<0 || i>=n || j<0 || j>=n || m[i][j]==0)
    {
        return ;
    }

    if(i==n-1 && j==n-1)
    {

    al.add(path);

    return ;

    }

    m[i][j]=0;

    helper(m,al,i+1,j,path+"D",n);

    helper(m,al,i,j-1,path+"L",n);

    helper(m,al,i,j+1,path+"R",n);

    helper(m,al,i-1,j,path+"U",n);

    m[i][j]=1;

    return;

    }
}