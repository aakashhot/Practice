/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    //the observation here is we can see that every alternative element is indivisible
		    //and as the numbers are 1st natural numbers starting from one ,
		    //we will loop from 2 to n and add 1 at last and every number will not be divisible and will give us perfect permutation
		    for(int i = 2; i <= n; i++){
		        System.out.print(i + " ");
		    }
		    System.out.println(1);
		}
	}
}
