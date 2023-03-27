package fizz_buzz;

public class FizzBuzz {

	private static final String	FIZZ		= "Fizz";
	private static final String	BUZZ		= "Buzz";
	private static final String	FIZZ_BUZZ	= "FizzBuzz";

	public static void main(String[] args) {
	
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ":\t" + fizzBuzzOf(i));
		}
	}

	private static String fizzBuzzOf(int number) {
		if (number % 15 == 0) {
			return FIZZ_BUZZ;
		} else if (number % 3 == 0) {
			return FIZZ;
		} else if (number % 5 == 0) {
			return BUZZ;
		} else {
			return Integer.toString(number);
		}
	}

	
	private static String alternativeFizzBuzzOf(int number) {
		boolean isFizzNumber = number % 3 == 0;
		boolean isBuzzNumber = number % 5 == 0;
		
		if (isFizzNumber && isBuzzNumber) {
			return FIZZ_BUZZ;
		} else if (isFizzNumber) { 
			return FIZZ;
		} else if (isBuzzNumber) {
			return BUZZ;
		} else {
			return Integer.toString(number);
		}
	}
	
}
