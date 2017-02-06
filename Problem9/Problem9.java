//Project Euler Problem #9
//Special Pythagorean triplet

// A Pythagorean triplet is a set of three natural numbers, 
// a < b < c, for which,
// 
// a2 + b2 = c2
// For example, 32 + 42 = 9 + 16 = 25 = 52.
// 
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

import java.util.*;

public class Problem9
{
   public static void main(String[] args)
   {
      int a;
      int b;
      int c;
      
      for(a = 0; a < 497; a++)
      {
         for(b = a + 1; b < 498; b++)
         {
            c = 1000 - a - b;
            
            if(a*a + b*b == c*c)
            {
               System.out.println("a: "+a+" b: "+b+" c: "+c+" = "+a*b*c);
            }
         }
      }
   }
}