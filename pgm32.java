/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pgm32
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s = "welcome to candid java tutorial";
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println(count);
	}
}
	
