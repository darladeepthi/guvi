/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pgm127
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String string = "12345";
        boolean numeric = true;

        try 
        {
            Double num = Double.parseDouble(string);
        }
        catch (NumberFormatException e)
        {
            numeric = false;
        }

        if(numeric)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
	
