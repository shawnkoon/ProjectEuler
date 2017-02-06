import java.util.*;
import java.io.*;

public class Problem13
{
   public static void main(String[] args)
   {
      ArrayList<Integer> digits = new ArrayList<Integer>();
      
      String fileName = "./textFiles/100numbers.txt";
      Scanner kb;
      File fname;
      
      try{
         fname = new File(fileName);
         
         kb = new Scanner(fname);
         
         digits = solve(kb);
      }
      catch(Exception e)
      {
         System.out.println("Please Check the fileName: "+fileName);
         System.exit(-1);
      }
      
   }
   
   /* Idea: Take String in convert it into Integer arrayList (default start one into curNumber list)
            scaner has next Line grab one more Line, insert it into the temp Integer arrayList
            after that add and make it into new curNumber.
            repeat untill every number has been added.
   */
   
   public static ArrayList<Integer> solve(Scanner kb)
   {
      ArrayList<Integer> curNumber = new ArrayList<Integer>();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      
      while(kb.hasNext())
      {
         String s = kb.nextLine();
         
         for(int i = 0; i < s.length() ; i++)
         {
            
         }
      }
      
      return curNumber;
   }
}