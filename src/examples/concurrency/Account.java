package examples.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private Long balance;
	private String name;

	public ReentrantLock lock=new ReentrantLock();
	
	public Account(String name, Long balance) {
		this.name = name;
		this.balance = balance;
	}

	public void debit(Long amount) throws InterruptedException {

		balance = balance - amount;

	}

	public void credit(Long amount) throws InterruptedException {

		balance = balance + amount;

	}

	@Override
	public String toString() {
		return name + "_ " + balance.toString();
	}

}
