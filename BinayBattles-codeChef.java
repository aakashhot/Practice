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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int setBit = 0;
		    while(n != 1){
		        if((n&1) != 1){
		            n >>= 1;
		            setBit++;
		        }
		    }
		    long res = (setBit*a) + ((setBit-1)*b);
		    System.out.println(res);
		}
	}
}
