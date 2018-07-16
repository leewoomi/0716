package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class Window extends Frame {
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
		// add(button);
		
		panel.add(button);
		
		Button button2 = new Button("button2");
		panel.add(button2);
		
		//패널에 프레임을 추가
		add(panel);
		
		setVisible(true);
	
		
	}
}
//한글 인코딩하려면 MS949로 바꿔서 
