/*
	Idea: So, the first thing that popped up in my mind is to use 
				recursively go through each possible routes and find the maximum sum route.
				This may take some time to computate the sum, however, it offers great 
				first approach of this problem.
*/
import java.io.*;
import java.util.*;

public class Problem18 {
	private static int max = 0;
	private static ArrayList<int[]> numberArrayList = new ArrayList<int[]>();

	public static void main(String[] args) {
		String filePath = "../textFiles/triangleNumbers.txt";
		findMax(filePath);
		System.out.println("The max is : " + max);
	}

	private static void findMax(String filePath) {
		try {
			File file = new File(filePath);
			Scanner fopen = new Scanner(file);

			while(fopen.hasNextLine()) {
				String line = fopen.nextLine();
				String[] lineArray = line.split(" ");
				int[] numberArray = new int[lineArray.length];
				for(int index = 0; index < lineArray.length; index++)
					numberArray[index] = Integer.parseInt(lineArray[index]);
				numberArrayList.add(numberArray);
			}
			int row = 0, col = 0, sum = 0;
			recFindMaxRoute(row, col, sum);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void recFindMaxRoute(int row, int col, int sum) {
		// base case
		if(row == numberArrayList.size() - 1) {
			sum += numberArrayList.get(row)[col];
			if(sum > max)
				max = sum;
		}
		else {
			sum += numberArrayList.get(row)[col];
			// go left
			recFindMaxRoute(row + 1, col, sum);
			// go right.
			recFindMaxRoute(row + 1, col + 1, sum);
		}
	}

}