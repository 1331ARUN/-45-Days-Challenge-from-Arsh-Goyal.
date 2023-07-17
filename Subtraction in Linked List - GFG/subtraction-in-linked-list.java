//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.subLinkedList(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* Structure of Linked list node

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

*/

class Solution
{

    static Node subLinkedList(Node l11, Node l22)

    {

     

       ///// Removing first zeros

       while(l11.data==0&&l11.next!=null){l11=l11.next;}

       while(l22.data==0&&l22.next!=null){l22=l22.next;}

       

       int first=0;

       int second=0;

      

      Node l1=l11;

      Node l2=l22;

      

      int i=0;

      

      //storing both lists first 4 digits in number for :(if both list have same size

      // then we will compare which lists first 4 number is graeter   )

      

      while(i<4&&l1!=null&&l2!=null){

          first=first*10+l1.data;

          second=second*10+l2.data;

          i++;

          l1=l1.next;

          l2=l2.next;

      }

      

      // reverse both list 

      

        l11=reverse(l11);

        l22=reverse(l22);

        

        int substract=0;

        

        // creating dummy node for reference of new list

        

        Node dummy=new Node(0);

        Node curr=dummy;

        

        int borrow=0;

        int l1size=0,l2size=0;

        

         l1=l11;

         l2=l22;

         

         // calculating both lists length

         

        while(l1!=null){l1size=l1size+1;; l1=l1.next;}

         

        while(l2!=null){l2size=l2size+1; l2=l2.next;}

        

        // checking which list size is greater 

        //which list size is greater that will be l1 and other is l2

        //If both have same size then compare it by first and second number ie. initially we have stored

        if(l1size>l2size ||l1size==l2size&&first>second ) {l1=l11; l2=l22;}

        else{l1=l22; l2=l11;}

        

        // substracting lists

        

        while(l1!=null || l2!=null){

            int a=(l1!=null)?l1.data:0;

            int b=(l2!=null)?l2.data:0;

            

            substract=borrow+a-b;

            if(substract<0){

                borrow=-1;

                substract=substract+10;

            }

            else{borrow=0;}

            Node nNode=new Node(substract);

            curr.next=nNode;

            curr=nNode;

           if(l1!=null){ l1=l1.next;}

            if(l2!=null){l2=l2.next;}

        }

       

        // reversing final list with refernce of dummy node

        dummy.next= reverse(dummy.next);

        curr=dummy.next;

        

        //removing initial zeros if present in final list 

         while(curr.data==0&&curr.next!=null){

             curr=curr.next;

         }

      

       // returning new list

         return curr;

        

        

    }

    static Node reverse(Node head){

        if(head==null || head.next==null){return head;}

        

        Node prev=head;

        Node curr=head.next;

        while(curr!=null){

            Node next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;

        }

        head.next=null;

        head=prev;

        return head;

    }

    

}





















// class Solution
// {
//      public  static Node reverse(Node head)
//     {

//         Node output=null;
//         while(head!=null)
//         {

//             Node temp=head.next;
//             head.next=output;
//             output=head;
//             head=temp;
//         }
//         return output;

//     }
//     static Node subLinkedList(Node l1, Node l2)
//     {
//         // code here
//         if(l2==null)
//         return l1;
//         if(l1==null)
//         {
//             l2.data=-l2.data;
//             return l2;
//         }
        
//         l1=reverse(l1);
//         l2=reverse(l2);
        
//         Node head=new Node (-1);
//         Node itr=head;
        
//         Node c1=l1;
//         Node c2=l2;
        
//         int borrow=0;
//         while(c1!=null)
//         {
//             int diff=borrow+c1.data-(c2!=null?c2.data:0);
            
//             if(diff<0)
//             {
//                 borrow=-1;
//                 diff+=10;
                
//             }
//             else{
//                 borrow=0;
//             }
//             itr.next=new Node(diff);
//             itr=itr.next;
//             c1=c1.next;
            
//             if(c2!=null)
//             {
//             c2=c2.next;
//             }
//         }
//      return    reverse(head.next);
        
//     }
// }