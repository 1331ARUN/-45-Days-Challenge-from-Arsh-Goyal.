//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.sum(head, k));
		}
	}
}
// } Driver Code Ends


/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution 
{
    
    //Return the sum of last k nodes
    public int sum(Node head, int k)
    {
      //write code here
      Node curr=head;
      int totalsum=0;
      int sum=0;
      
      int size=0;
      while(curr!=null)
      {
          totalsum=totalsum+curr.data;
          size++;
          curr=curr.next;
      }
      curr=head;
      int i=(size-k);
      
      while(i>0)
      {
          
          sum=sum+curr.data;
          curr=curr.next;
          i--;
      }
      return (totalsum-sum);
    }
}