//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
//         if(arr==null||arr.length<=1)
//         return null;
        
//         int i=arr.length-2;
        
//         while(i>=0&&arr[i]>=arr[i+1])
//     {
//             i--;
//     }    
        
//          if(i>=0)
//          {
//             int j=arr.length-1;
            
//             while(arr[j]<=arr[i])
//             {
//             j--;
//             }
//             swap(arr,i,j);
//         }
//         reverse(arr,i+1,arr.length-1);
        
//         ArrayList<Integer>ans=new ArrayList<>();
//         for(int k=0;k<N;k++)
//         {
//             ans.add(arr[k]);
//         }
//         return ans;
        
//     }
//     public static void swap(int arr[],int i,int j )
//     {
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
    
//     public static void reverse(int arr[],int i,int j)
//     {
        
//         while(i<j)
//         {
//             swap(arr,i++,j--);
//         }
//     }
// }

    // if(arr==null||arr.length<=1)
    //   return null;

ArrayList<Integer> al= new ArrayList<Integer>();
        int i=N-2;
          while(i>=0 && arr[i]>=arr[i+1])
          
          {
              i--;
          }
          if(i>=0)
          {
              int j=N-1;
              while(arr[j]<=arr[i])
              {
                  j--;
              }
              swap(arr,i,j);
              
          }
          rev(arr,i+1,N-1);
          for(int p=0;p<N;p++)
          {
              al.add(arr[p]);
          }
          return al;
        
        
    }
    public static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void rev(int arr[],int a,int j)
    {
        while(a<j)
        {
            swap(arr,a++,j--);
        }
    }
}