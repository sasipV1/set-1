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
		int number, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
		for(i = 1; i <= number; i++)
		{
			sum = sum + i; 
		}	
		System.out.println(sum);

	}
}
