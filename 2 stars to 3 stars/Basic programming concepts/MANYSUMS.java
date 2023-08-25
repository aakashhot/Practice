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
		while(T-->0) {
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    //when we mannuly try some cases we observe that only cases can be 
		    //continous as the range is continous and l will be the lowest element always 
		    //therefore starting of the ans range will be 2* lowesest
		    // and max element of answere will be 2*r (as we can multiply with own digit)
		    
		    System.out.println(2*r  - 2*l + 1);
		}
		    
	}
}
