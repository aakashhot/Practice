/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long calGcd(long a, long b) {
        if(b == 0){
            return a;
        }
        return calGcd(b, a%b);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long gcd = calGcd(a,b);
		   
		    long lcm = (a * b)/gcd;
		    System.out.println(gcd+" "+lcm);
		}
	}
}
