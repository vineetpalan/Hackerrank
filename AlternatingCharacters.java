/*

------------------------------------------------------------------------------
				Alternating Characters
------------------------------------------------------------------------------

Shashank likes strings in which consecutive characters are different. 
For example, he likes ABABA, while he doesn't like ABAA. 
Given a string containing characters A and B only, he wants to change it into a string he likes. 
To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

---------------------------------------
Example:
---------------------------------------

Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB

Sample Output

3
4
0
0
4

Explanation

AAAA A, 3 deletions
BBBBB B, 4 deletions
ABABABAB ABABABAB, 0 deletions
BABABA BABABA, 0 deletions
AAABBB AB, 4 deletions because to convert it to AB we need to delete 2 A's and 2 B's

------------------------------------------------------------------------------
Problem Page : https://www.hackerrank.com/challenges/alternating-characters
Run Online : http://ideone.com/wnb1oE
------------------------------------------------------------------------------
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       int testCases = in.nextInt();
       String inputString = "";
        
       while(testCases-- > 0)
       {
           inputString = in.next();
           System.out.println(countDeletions(inputString));
       }
    }
    
    private static int countDeletions(String inputString)
    {
        int count = 0;
        char firstChar = inputString.charAt(0);
        
        for(int i=1;i<inputString.length();i++)
        {
            if(inputString.charAt(i)  == firstChar)
                count++;
            else
                firstChar = inputString.charAt(i);
        }
        return count;
    }
}
