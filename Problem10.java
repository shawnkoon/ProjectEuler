//Project Euler Problem #10
//Summation of primes

// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// 
// Find the sum of all the primes below two million.

import java.util.*;

public class Problem10
{
   public static void main(String[] args)
   {
      long sum = 5;
      
      for(int i = 2; i < 2000000; i++)
      {
         if(i % 2 != 0 && i % 3 != 0)
         {
            if(isPrime(i))
            {
               sum += i;
               
               System.out.println(i);
            }
         }
      }  
      
      System.out.println(sum);
   }
   
   private static boolean isPrime(int x)
   {
      boolean result = true;
      
      for(int i = 1; i <= x/2; i++)
      {
         if(x%i == 0 && i != 1)
         {
            result = false;
            break;
         }
      }
      
      return result;
   }
}