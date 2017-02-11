/*
	Idea: My initial thought is to just code brute force way.
				Calculating actual answer of power then sum the digits.
				Problem would be that 2^1000 will take forever to finish.
*/
public class Problem16 {
	public static void main(String[] args) {
		double power = 15;
		double base = 2;
		long sum = 0;
		long result = (long) Math.pow(base, power);

		for(int index = 0; index < Long.toString(result).length(); index++)
			sum += Long.parseLong(Character.toString(Long.toString(result).charAt(index)));
		System.out.println("The actual numb : " + result);
		System.out.println("The result is   : " + sum);
	}// End of main().
}// End of Problem16 class.