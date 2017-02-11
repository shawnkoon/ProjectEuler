/*
	Idea: First determine what unique cases there are.
				For example, one - ten are unique.
										 Eleven, Twelve, Thirteen are unique.
										 14 ~ 19 = unique + (teen).
										 Twenty is unique.
										 21 ~ 29 = unique + (twenty).
										 ...
				Now, let me look at example run.
				ex) 374.
				1. 374 / 1000 = 0 skip.
				2. 374 / 100 = 3 -> three hundred
				3. 74  / 10 = 7 -> seventy ( if 1, special case )
				4. 4 -> four.
				total = 23 letters.

				Going to be using Hashtable for the mapping.
*/
import java.util.*;
public class Problem17 {
	public static void main(String[] args) {
		int start = 1, end = 1000, count = 0;
		Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
		initUniqueKeys(hashTable);

		for(int num = end; num >= start; num--) {
			int cur = num;
			if(cur / 1000 != 0)
				count += (hashTable.get(cur/1000) + hashTable.get(1000));
			
			cur %= 1000;
			if(cur / 100 != 0)
				count += (hashTable.get(cur/100) + hashTable.get(100));

			cur %= 100;
			if(cur > 0 && num >= 100)
				count += "and".length();
			if(cur / 10 != 0) {
				if(cur / 10 != 1)
					count += hashTable.get((cur / 10) * 10);
				else {
					if(hashTable.get(cur) != null)
						count += hashTable.get(cur);
					else
						count += (hashTable.get(cur % 10) + "teen".length());
					continue;
				}
			}
			cur %= 10;
			if(cur != 0)
				count += hashTable.get(cur);
		}// End of for().

		System.out.println("Total letters are : " + count);
	}// End of main().

	private static void initUniqueKeys(Hashtable<Integer, Integer> hashTable) {
		hashTable.put(1,3);
		hashTable.put(2,3);
		hashTable.put(3,5);
		hashTable.put(4,4);
		hashTable.put(5,4);
		hashTable.put(6,3);
		hashTable.put(7,5);
		hashTable.put(8,5);
		hashTable.put(9,4);
		hashTable.put(10,3);
		hashTable.put(11,6);
		hashTable.put(12,6);
		hashTable.put(13,8);
		hashTable.put(15,7);
		hashTable.put(18,8);
		hashTable.put(20,6);
		hashTable.put(30,6);
		hashTable.put(40,5);
		hashTable.put(50,5);
		hashTable.put(60,5);
		hashTable.put(70,7);
		hashTable.put(80,6);
		hashTable.put(90,6);
		hashTable.put(100,7);
		hashTable.put(1000,8);
	}// End of initUniqueKeys().
}// End of Problem17 class.