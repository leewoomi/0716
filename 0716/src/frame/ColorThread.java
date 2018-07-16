package frame;

import java.awt.Button;
import java.awt.Color;



public class ColorThread extends Thread {

	private Button button;

	public ColorThread(Button button) {
		this.button = button;
	}


}
