package top50javaprograms;

public class PallandromeExample {

	public static void main(String[] args) {

		int sample = 121;
		checkPallandromeOfInteger(sample);

		checkPallandromeUsingString(sample);

	}

	private static void checkPallandromeUsingString(int sample) {
		String number = sample + "";
		StringBuilder reverse = new StringBuilder(number).reverse();
		System.out.println("Reverse of the number " + reverse);
		System.out.println("Given number " + number);
		System.out.println("The Number is pallandrome " + (number.contentEquals(reverse)));
	}

	private static void checkPallandromeOfInteger(int sample) {
		int number = sample;
		int pall = 0;

		do {
			int rem = number % 10;
			pall = pall * 10 + rem;
			number = number / 10;
		} while (number > 0);
		System.out.println("Reverse of the number " + pall);
		System.out.println("Given number " + sample);
		System.out.println("The Number is pallandrome " + (pall == sample));
	}

}
