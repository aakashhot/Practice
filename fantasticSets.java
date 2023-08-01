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
    
    static int fantasticSets(int[] arr){
        HashSet<Integer> as = new HashSet<>();
        int[] freq = new int[MAX];
        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]] = 1;
            as.add(arr[i]);
        }
        
        
        for(int i = 1; i <= 1000000; i++){
            
            //checking if the input array contains 
            if(as.contains(i)){
                
            // starting with second multiple of i go and increase the count of special set for that num
            for(int j = i*2; j <= 1000000; j += i) {
                freq[j] = (freq[j] + freq[i])%MOD;
            }
            }
        }
        // then traverse the array again and sum whole array are the special sets where a[i] divides a[i+1]
    }
    
    static final int MOD = 1000000007;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
// 		getPrimes();
// 		for (int i = 0; i < 100; i++) {
//             System.out.print(primes.get(i) + " ");
//         }

        int n = 100005;
        long[] result = new long[n];
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j += i) {
                result[j] = (result[j] * (i + 1)) % MOD;
                System.out.println(result[j]);
            }
        }
        //System.out.println((result[4] + MOD - 1) % MOD);
		
	}
}
