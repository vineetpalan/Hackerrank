import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        char unencrypted[] = in.next().toCharArray();
        StringBuffer result = new StringBuffer();
        int k = in.nextInt();
        for (char c: unencrypted)
        {
            if(Character.isLetter(c))
            {
                char a = Character.isUpperCase(c)?'A':'a';
                result.append((char)(a + (c - a + k)%26));
            }
            else
                result.append(c);
        }
        System.out.println(result);
    }
}