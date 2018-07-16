package account;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		ThreadEx3 th3 = new ThreadEx3(account);
		ThreadEx4 th4 = new ThreadEx4(account);
		th3.start();
		th4.start();

	}

}
