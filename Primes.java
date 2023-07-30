/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static final int MAX = 10000000;
    static BitSet isPrime;
    static List<Integer> primes = new ArrayList<>();

    static void getPrimes() {
        isPrime = new BitSet(MAX);
        isPrime.set(0,MAX);
        isPrime.set(0,false);
        isPrime.set(1,false);
        for(int i = 2; i*i <= MAX; i++){
            if(isPrime.get(i)) {
                for(int j = i; j * i <= MAX; j++) {
                    isPrime.set(j*i,false);
                }
            }
        }
        primes.add(2);
        for(int i = 3; i <= MAX; i+=2) {
            // System.out.println(isPrime.get(i));
            if(isPrime.get(i)) primes.add(i);
        }
        
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		getPrimes();
		for (int i = 0; i < 100; i++) {
            System.out.print(primes.get(i) + " ");
        }
		
	}
}
