/*

Simple Text Editor
https://www.hackerrank.com/challenges/simple-text-editor/

Sample Input

8
1 abc
3 3
2 3
1 xy
3 2
4 
4 
3 1

Sample Output

c
y
a

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleTextEditor 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        long q = in.nextInt();
        String s = new String();
        int input;
        List<String> stack = new ArrayList<String>();
        
        for (long i=0;i<q;i++)
        {
           input = in.nextInt(); 
           switch(input) 
           {
                case 1 :
                    s += in.nextLine().trim();
                    stack.add(s);
                    break;
                case 3 :
                    if(s.length() > 0)
                        System.out.println(s.charAt(in.nextInt()-1));
                    break;
                case 2 :
                    if(s.length() > 0)
                    {
                    s = s.substring(0,s.length() - in.nextInt()).trim();
                    stack.add(s);
                    }
                    break;
                case 4 :
                    if(stack.size()>0)
                    {
                        stack.remove(stack.size()-1);
                        if(stack.size()==0)
                            s = "";
                        else
                            s = stack.get(stack.size()-1);
                    }
                    break;
               default :
                    break;
               
            }
        }
    }
}

