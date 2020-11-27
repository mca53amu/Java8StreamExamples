package top50javaprograms;

public class FactorialExample {

	public static void main(String[] args) {

		long n = 10L;

		long fact = factorial(n);
		System.out.println(fact);

		long sqrSum = squareSum(n);
		System.out.println(sqrSum);

	}

	private static long squareSum(long n) {
		if (n == 1)
			return 1;
		return n * n + squareSum(n - 1);
	}

	private static long factorial(long n) {

		if (n ==1)
			return 1;
		return n * factorial(n - 1);
	}

}
