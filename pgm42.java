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
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		int n1,n2;
		n1=str1.length();
		n2=str2.length();
		if(n1>n2)
		{
			System.out.println(str1);
		}
		else 
		{
			System.out.println(str2);
		}
	}
}
