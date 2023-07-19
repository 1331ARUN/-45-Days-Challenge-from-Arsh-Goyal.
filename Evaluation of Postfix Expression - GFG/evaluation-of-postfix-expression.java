//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
          Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char digit to int and push to stack
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation(ch, num1, num2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static int performOperation(char operator, int num1, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
    