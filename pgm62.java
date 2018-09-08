/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	        int r = 0, c = 0, num, b;
        Scanner sl = new Scanner(System.in);
        num = sl.nextInt();
       int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));// i want to get the first digit from the input
        if (firstDigit>0||firstDigit==1 )
        {
            while (num > 0)
            {
                if ((num % 10 == 0) || (num % 10 == 1))
                    c++;
                r++;
                num = num / 10;
            }
            if (c == r)
            {
                System.out.println("yes");
            } 
            else
                System.out.println("no");
        }
        else System.out.printf("WARNING: The number starts with 0");
    }
}
	
