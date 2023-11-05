//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n)
    {
        
        // code here
       // ArrayList<Integer>ans=new ArrayList<>();
       
//         int ans []=new int [2];
//         int xor=0;
//         for(int i =0;i<n;i++)
//         {
//             xor^=arr[i];
//         }
        
//         for(int i=0;i<=n;i++)
//         {
//             xor^=i;
//         }
        
//         int ans2=xor & -xor;
        
//         int x=0;
//         int y=0;
        
//         for(int val:arr)
//         {
//             if((val&ans2)==0)
//             {
//                 x=x^val;
//             }
//             else
//             {
//                 y=y^val;
//             }
//         }
        

// for(int i=0;i<=n;i++)
// {
//     if((i& ans2)==0)
//     {
//         x^=i;
//     }
//     else
//     {
//         y^=i;
//     }
// }
// for(int val:arr)
// {
//     if(x==val)
//     {
//         ans[0]=x;
//         ans[1]=y;
//         break;
//     }
//     else if(y==val)
//     {
//         ans[0]=y;
//         ans[1]=x;
//         break;
//     }
// }
// return ans;

Arrays.sort(arr);
int []ans=new int[2];
int res=-1;
int count=1;

for(int i=0;i<n;i++)
{
    if(arr[i]==count)
    {
        count++;
    }
    if(i!=0&&arr[i-1]==arr[i])
    {
        res=arr[i];
    }
}
ans[0]=res;
ans[1]=count;

return ans;
        
    }
}