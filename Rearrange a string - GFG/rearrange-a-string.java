//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            
             int sum = 0;
            String res = "";
            for(int i = 0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    sum += s.charAt(i)-'0';
                }else{
                    res += s.charAt(i)+"";
                }
            }
            // System.out.println(res);
            char[] arr = res.toCharArray();
            Arrays.sort(arr);
            String res1 = new String(arr);
            if(sum!=0){
                res1+=Integer.toString(sum);
            }
            return res1;
            // String alpha="";
            
            // String res="";
            // for(int i=0;i<s.length();i++)
            // {
            //     if(s.charAt(i)>='A'  && s.charAt(i)<='B')
            //     {
            //         alpha=alpha+s.charAt(i);
            //     }
            //     else
            //     {
            //         res=res+s.charAt(i);
            //     }
            // }
            // int  n=Integer.parseInt(res);
            // int sum=0;
            // while(n>0)
            // {
            //     int k=n%10;
            //     sum=sum+k;
            //     n=n/10;
            // }
            // char c[]= alpha.toCharArray();
            // Arrays.sort(c);
            //   String str = String.copyValueOf(c);
            //   String ans=Integer.toString(sum);
            //   return str+ans;
        }
        }

