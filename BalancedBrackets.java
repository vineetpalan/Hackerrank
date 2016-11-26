/*

Balanced Brackets
https://www.hackerrank.com/challenges/balanced-brackets

Sample Input

3
{[()]}
{[(])}
{{[[(())]]}}

Sample Output

YES
NO
YES

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        int t = in.nextInt();
        Map<Character,Character> pairs = new HashMap<Character,Character>();
        pairs.put('}','{');
        pairs.put(')','(');
        pairs.put(']','[');
       
        for(int a0 = 0; a0 < t; a0++)
        {
            String s = in.next();
            
            char ch[] = s.toCharArray();
            stack.clear();
            int flag=1;
            for(char c: ch)
            {
                
                if(c=='{' || c=='(' || c=='[')
                    stack.push(c);
                else
                {
                   if(!stack.isEmpty())
                   {
                      if (stack.peek() == pairs.get(c))
                      {
                          stack.pop();
                      }
                      else
                      {
                           flag=0;
                           break;
                      }
                   } 
                   else
                   {
                      flag=0;
                      break; 
                   }
                }
            }
            if(flag == 1 && stack.isEmpty())
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            } 
        }
    }
}

