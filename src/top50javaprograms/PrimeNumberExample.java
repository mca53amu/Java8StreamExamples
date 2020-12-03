package top50javaprograms;

public class PrimeNumberExample {

	public static void main(String[] args) {

		int n = 871;
		boolean result = checkPrimeNumber(n);
		System.out.println(result);
	}

	private static boolean checkPrimeNumber(int n) {
		if (n == 2) {
			return true;
		}
		int i = 2;
		for (; i < n / 2; i++) {
			if (n % i == 0) {
				System.out.println("First factor "+i);
				break;
			}
		}

		return i == n / 2;
	}

}
