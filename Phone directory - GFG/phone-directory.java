//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String contact[] = in.readLine().trim().split("\\s+");
            String s = in.readLine();
            
            Solution ob = new Solution();
            ArrayList<ArrayList<String>> ans = ob.displayContacts(n, contact, s);
            for(int i = 0;i < ans.size();i++){
                for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n,String contact[], String s)
    {
        // code here
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            ArrayList<String> arr=new ArrayList<>();
            String str=s.substring(0, i+1);
            for(String st : contact)
            {
                if(i<st.length() && st.substring(0, i+1).equals(str) && !arr.contains(st)){
                    arr.add(st);
                }
                
            }
            i++;
            if(arr.isEmpty())
                arr.add("0");
            
            Collections.sort(arr,new Comparator<String>()
                {
                    public int compare( String a, String b ){
                    return a.compareTo(b);     
                }
            });
        
            ans.add(arr);
            
        }
        
        return ans;
    }
}