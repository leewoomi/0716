package account;

public class ThreadEx4 extends Thread {
	private Account acc;

	public ThreadEx4(Account acc) {
		this.acc = acc;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			acc.depo();
		}
	}
}
