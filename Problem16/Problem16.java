import java.math.BigInteger;
/*
	Idea: My initial thought is to just code brute force way.
				Calculating actual answer of power then sum the digits.
				Problem would be that 2^1000 will take forever to finish.
				Possibliy use BigInteger class for higher max value.
				Or could use linked list operation similar to Prob #13 (Large sum)
*/
public class Problem16 {
	public static void main(String[] args) {
		int power = 1000, base = 2;
		long sum = 0;
		BigInteger result = new BigInteger(Integer.toString(base));
		result = result.pow(power);

		for(int index = 0; index < result.toString().length(); index++)
			sum += Long.parseLong(Character.toString(result.toString().charAt(index)));

		System.out.println("The actual numb : " + result);
		System.out.println("The result is   : " + sum);
	}// End of main().
}// End of Problem16 class.