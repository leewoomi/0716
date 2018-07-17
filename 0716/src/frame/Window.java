package frame;

import java.awt.Button;
import java.awt.Color;
//import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class Window<TextThread> extends Frame {
	// 생성자
	public Window() {
		// Dialog dialog = new Dialog(this, "dialogTitle");
		// dialog.setTitle("dialog.setTitle");
		// dialog.setSize(200, 200);
		setSize(500, 500);
		setLocation(100, 300);
		setTitle("WindowTest");
		setVisible(true);
		setBackground(Color.BLUE);
		Panel panel = new Panel();
		Button button = new Button("button");

		// 버튼의 배경색을 변경하는 스레드
		// ColorThread th =new ColorThread(button);
		Thread th = new Thread() {

			public void run() {
				Color[] color = { Color.CYAN, Color.BLUE,Color.PINK, Color.darkGray };

				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						button.setBackground(color[idx % color.length]);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		th.start();
		panel.add(button);

		Button button2 = new Button("button2");
		// 버튼의 텍스트를 변경하는 스레드
		Thread th2 =new Thread() {
			public void run() {
				String[] ar = {" Java ", "Oracle", "FrontEnd", "BankEnd", "Android", "iOS"};
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx += 1;
						button2.setLabel(ar[idx % ar.length]);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};

		th2.start();
		// 페널을 프레임에 추가
		panel.add(button2);

		add(panel);

		setVisible(true);

	}
}
// 한글 인코딩하려면 MS949로 바꿔서
