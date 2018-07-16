
public class TheadMain1 {
	public static void main(String[] args) {
		//클래스의 run 메소드 사용
		ThreadEx thread = new ThreadEx();
		//데몬 스레드로 설정
		//다른 스레드가 작업중이 아니면 자동 종료
		thread.setDaemon(true);
		//스레드 시작
		thread.start();
		
		//3초 후 Main 종료
		try {
			Thread.sleep(2000);
			//interrupteException을 발생시킴
			thread.interrupt();
			Thread.sleep(3000);
			System.out.println("메인 종료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
