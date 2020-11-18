package examples.concurrency;

import java.util.concurrent.TimeUnit;

public class TransferBalance {

	public static void transer(Account fromAccount, Account toAccount, Long amount) {

		try {
			fromAccount.lock.tryLock(10, TimeUnit.SECONDS);
			System.out.println("from account lock accuired "+Thread.currentThread());
			toAccount.lock.tryLock(10, TimeUnit.SECONDS);
			System.out.println("toAccount lock accuired "+Thread.currentThread());
			fromAccount.debit(amount);
			toAccount.credit(amount);
		} catch (InterruptedException e) {
			System.err.println("error");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("error");
			e.printStackTrace();
		} finally {
			if (fromAccount.lock.isHeldByCurrentThread()) {
				fromAccount.lock.unlock();
			}
			if (toAccount.lock.isHeldByCurrentThread()) {
				toAccount.lock.unlock();
			}

		}

	}

}
