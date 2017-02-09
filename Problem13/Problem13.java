import java.util.*;
import java.io.*;

/*
  Idea: I could be using biginteger datatype. But since it might run out of 
        memory space, I will be using Linked Lists to do the operation.

  Special: I will be populating Linked List in a reverse order of original number.
           ex) 12345 -> [5, 4, 3, 2, 1]
*/

public class Problem13 {
  
  public static void main(String[] args) {
    String filePath = "../textFiles/100numbers.txt";
    
    calculateSum(filePath);
  }

  private static void calculateSum(String filePath) {
    List<Integer> sum = new LinkedList<Integer>();

    try {
      File fopen = new File(filePath);
      Scanner fScan = new Scanner(fopen);

      while( fScan.hasNext() ) {
        List<Integer> cur = new LinkedList<Integer>();
        String line = fScan.nextLine();
        
        for (char digit : line.toCharArray())
          cur.add(0, Integer.parseInt(Character.toString(digit)));
        
        sum = addLists(sum, cur);
      }// End of while.

      fScan.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }

    String result = "";

    for(int i = sum.size() - 1 ; i >= sum.size() - 10; i--) {
      result += sum.get(i);
    }
    
    System.out.println("The result is : " + result);
  }// End of readFile();

  private static List<Integer> addLists(List<Integer> list1, List<Integer> list2) {
    List<Integer> total = new LinkedList<Integer>();

    int maxLength = list1.size() > list2.size() ? list1.size() : list2.size();

    for(int i = 0; i < maxLength; i++) {
      int digit1 = 0, digit2 = 0, digit3 = 0;

      if(i < list1.size())
        digit1 = list1.get(i);
      
      if(i < list2.size())
        digit2 = list2.get(i);
      
      if(i < total.size())
        digit3 = total.get(i);
      
      if(digit1 + digit2 + digit3 >= 10) {
        if(i == total.size() - 1) {
          total.set(i, (digit1 + digit2 + digit3) % 10);
          total.add(i + 1, (digit1 + digit2 + digit3) / 10);
        }
        else {
          total.add(i, (digit1 + digit2 + digit3) % 10);
          total.add(i + 1, (digit1 + digit2 + digit3) / 10);
        }
      }
      else {
        if(i == total.size() - 1)
          total.set(i, (digit1 + digit2 + digit3));
        else
          total.add(i, (digit1 + digit2 + digit3));
      }
    }

    return total;
  }// End of addLists().
}