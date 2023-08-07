/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
publci class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int a = sc.nextInt();
		    String b = sc.next();
		    if(a == 0) {
		        System.out.println(b);
		        continue;
		    }
		    System.out.println(gcd(a,mod(b.toCharArray(),a)));
		}
	}
	
	public static int mod(char[] s, int divisor) {
	    int n = s.length;
	    int multiplier = 1;
	    int res = 0;
	    for(int i = n-1; i>=0; i--) {
	        int cur = s[i]-'0';
	       // System.out.println(cur+" "+multiplier);
	        res  += (multiplier*cur)%divisor;
	        multiplier *= 10; 
	    }
	    return res;
	}
	
	public static int gcd(int a, int b) {
	    if(b == 0){
	        return a;
	    }
	    return gcd(b, a%b);
	}
}
