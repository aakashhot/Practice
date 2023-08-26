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
		while(T-- > 0) {
		    int A =  sc.nextInt();
		    int B = sc.nextInt();
		    int P =  sc.nextInt();
		    int Q = sc.nextInt();
		    
		    
		    int one = P/A;
		    int two = Q/B;
		    //the observation here is if alice and bob are divisors and if the diffrence of their quotient is less or equal to 1 then only they can be equal to P and Q, 
      //otherwise one or the other will not bi divisible or become greater as they are taking turns
		    
		    if(P%A==0&&Q%B==0&&Math.abs(one-two)<=1){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
