//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends




/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
       
        Node rev (Node head)
        {
            Node curr=head;
            Node prev=null;
            Node next=null;
            
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            
            return prev;
            
        }
    Node compute(Node head)
    {
        // your code here
        
        // Stack<Node> s=new Stack<>();
        // s.add(head);
        // Node p=head.next;
        
        // while(p!=null)
        // {
        //     while(!s.empty() && s.peek().data<p.data)
        //     s.pop();
        //     s.add(p);
        //     p=p.next;
        // }
        // Node pre=new Node(0);
        
        // while(!s.empty())
        // {
        //     Node q=s.pop();
        //     q.next=pre.next;
        //     pre.next=q;
        // }
        // return pre.next;
     
        Node temp=rev(head);
        Node ans=temp;
        int max=temp.data;
        
        while(temp !=null&& temp.next!=null)
        {
            if(temp.next.data<max)
        {
            temp.next=temp.next.next;
        }
        else
        {
            temp=temp.next;
            max=Math.max(max,temp.data);
        }
        }
        return rev(ans);
        
    }
}
  