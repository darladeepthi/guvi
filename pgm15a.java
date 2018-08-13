/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,s,e;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		e=sc.nextInt();
		for(i=s+1;i<e;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"\t");
				
			}
		}
	}
}

