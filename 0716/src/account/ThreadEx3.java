package account;

public class ThreadEx3 extends Thread {

	private Account acc;
	
	public ThreadEx3(Account acc) {
		this.acc = acc;
	}
	
	public void run() {
		for(int i =0;i<5; i++) {
			acc.save();
		}
	}
}
