
public class ThreadEx extends Thread {

	//스레드로 동작할 메소드
	@Override
	public void run() {
	
		//1초마다 Thread라는 글자를 10번 출력
		int i= 0;
		do {
			System.out.println(i+"Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("스레드 종료");
				//스레드를 강제 종료 할 수 있도록
				//예외가 발생하면 run 메소드 종료
				return;
			}
			i+=1;
		}while(i<10);
	}
}
