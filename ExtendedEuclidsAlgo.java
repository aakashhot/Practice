/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Coefficients {
        int x, y, gcd;
        
        Coefficients(int x, int y, int gcd) {
            this.x = x;
            this.y = y;
            this.gcd = gcd;
        }
    }
    
     static Coefficients extendedEuclidean(int a, int b) {
        if (b == 0) {
            return new Coefficients(1, 0, a);
        }
        
        Coefficients prevCoeff = extendedEuclidean(b, a % b);
        int x = prevCoeff.y;
        int y = prevCoeff.x - (a / b) * prevCoeff.y;
        
        return new Coefficients(x, y, prevCoeff.gcd);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}
