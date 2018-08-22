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
		int temp,a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if((a>b)|(a<b)|(a==b))
		{
			temp=a;
			a=b;
			b=temp;
		}
			System.out.println(a+"\t"+b);
	}
}
