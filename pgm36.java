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
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		count(str);
	}
	public static void count(String x)
	{
	int spec=0;
	char[] ch=x.toCharArray();
	for(int i=0;i<x.length();i++)
	{
		if(!(Character.isLetter(ch[i])||Character.isDigit(ch[i])||Character.isSpace(ch[i])))
		{
			spec++;
		}
	}
	System.out.println(spec);
	}
}

