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
		String player1,player2;
		Scanner sc=new Scanner(System.in);
		player1=sc.next();
		player2=sc.next();
		int rock=1,paper=2,scissor=3;
		System.out.println("enter 1 for rock 2 for paper 3 for scissor");
		System.out.println("enter player1 choice");
		int ch1=sc.nextInt();
		System.out.println("enter player2 choice");
		int ch2=sc.nextInt();
		if(ch1==1 && ch2==2)
		{
			System.out.println(player2+"wins");
		}
		else if(ch1==1 && ch2==3)
		{
			System.out.println(player1+"wins");
		}
		else if(ch1==2 && ch2==1)
		{
		System.out.println(player1+"wins");
		}
		else if(ch1==2 && ch2==3)
		{
			System.out.println(player2+"wins");
		}
		else if(ch1==3 && ch2==1)
		{
			System.out.println(player2+"wins");
		}
		else if(ch1==3 && ch2==2)
		{
			System.out.println(player1+"wins");
		}
		else
		{
			System.out.println("tie or draw");
		}
		}
}
