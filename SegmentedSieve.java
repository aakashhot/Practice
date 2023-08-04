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
    // Number of prime numbers form a to b
    static void segmentedSieve(int a, int b){
        int range = b-a+1;
        BitSet seg = new BitSet(range);
        seg.set(0,range);
        if(a==1){
            a++;
        }
        // we only case about multiples of i because we want 1st prime multiple of a to get stored in 0th index 
        // and so on for all multiples of prime
        for(int i = 0; primes.get(i)*primes.get(i) <= b; i++) {
            int prime = primes.get(i);
            int j = (a/prime)*prime;
            if(j<a){
                j+=prime;
            }
            //traversing all multiples of prime and marking them 
            for(; j <= b; j+=prime){
                if(j != prime){
                    //j-a so that 0th index fills then 1st and so on
                    seg.set(j-a,false);
                }
            }
            
            
            for(int i = a; i <= b; i++) {
                if(seg.get(i-a) or i == 2) {
                     System.out.println(i);
                }
            }
        }
        
        
        
    }

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
	}
	
	
	
	
}
