/*
	Idea: This sounds like a perfect recursion problem.
				I will be implementing finding term logic in recursion.
*/

public class Problem14 {
	
	public static void main(String[] args) {
		long maxNumber = 0;
		long maxTerms = 0;

		for(long i = 999999; i > 1; i--) {
			long curTerms = findTerms(i);

			if(curTerms > maxTerms) {
				maxNumber = i;
				maxTerms = curTerms;
			}
		}
		System.out.println("Max Number : "+maxNumber+", Max Terms : "+maxTerms);
	}

	private static long findTerms(long startingNumb) {
		// Base case.
		if(startingNumb == 1)
			return 1;
		
		// Recursive case.
		if(startingNumb % 2 == 0)
			return 1 + findTerms(startingNumb / 2);
		else
			return 1 + findTerms((startingNumb * 3) + 1);
	}// End of findTerms()
}