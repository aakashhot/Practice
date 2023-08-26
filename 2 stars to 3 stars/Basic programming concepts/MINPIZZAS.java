/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef

{
    public static long gcd(long a, long b){
        if(a%b==0){
            return b;
        }else{
            return gcd(b,a%b);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- >0){
		    long n = sc.nextLong();
		    long k = sc.nextLong();
		    long ans = (n/gcd(n,k));// lcm  but we need to find number of pizzas not number of clices
		    //there we divide common lowest multiple with k which will give us numbe of pizza he willneed to buy
		    System.out.println(ans);
		} 
	}
}
