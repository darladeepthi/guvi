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
		int n,i,d;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean flag=true;
		while(n>1)
		{
			d=n%2;
			if(d%2!=0)
			{
				flag=false;
				break;
			}
			n=n/2;
		}
		if(flag==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
		}
			
