package bank;

public class MutexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		// 스레드 인스턴스 만들기
		ThreadEx2 atm = new ThreadEx2(bank, "ATM");
		atm.start();

		ThreadEx2 internet= new ThreadEx2(bank, "internet");
		internet.start();
	}

}
