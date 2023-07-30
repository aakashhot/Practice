import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
  
public static final int MAX = 10000000;
    static BitSet isPrime;
    static List<Integer> primes = new ArrayList<>();
    static int[] sieve;//basically storing smallest common factor
    static void optimisedGenPrimes() {
        sieve = new int[MAX];
        for(int i = 1; i < MAX; i++){
            sieve[i] = i;
        }
        
        for(int i = 2; i < MAX; i++) {
            if(sieve[i] == i){
                primes.add(i);
            }                                      //factor of a number a[i] * prime == p only if prime<smallest factor of a[i]
            //                                   prime <= smalles factor of i
            /*
            for example
            if i =  12 = 4*3 4= a[i] 
                             3= prime 
                             a[i] * prime will only be == prime when  prime<=a[i]
                             a[i]= 4 = smallest factor of 4 ie. 2
                                3 !< 2 there for we only traverse primes smaller than sieve[i                             
            */
            for(int j = 0; j < primes.size() && primes.get(j) <= sieve[i] && i*primes[j] < MAX; j++) {
                sieve[i*primes.get(j)] = primes.get(j);
            }
        }
    }


public static void main (String[] args) throws java.lang.Exception
	 {
        
  	}
}
