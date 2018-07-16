package account;

public class Account<synchronizedvoid> {

	private int balance;

	// 잔액을 추가하는 메소드
	public synchronized void save() {

		
		
		System.out.println("입금 전 잔액 : " + balance);
		balance += 1000;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입금 후 잔액 : " + balance);
	}

	// 잔액을 감소시키는 메소드
	public synchronized void depo() {

		if(balance<1000) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("출금 전 잔액 : " + balance);
		balance -= 1000;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("출금 후 잔액 : " + balance);
	}
}
