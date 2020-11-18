package examples.concurrency;

public class ReentrantLockExample {

	public static void main(String... s) {

		Account a = new Account("A", 2000L);
		Account b = new Account("B", 2000L);
		System.out.println("calling transfer method");
		TransferBalance.transer(a, b, 100L);
		System.out.println(a);
		System.out.println(b);
	}
}
