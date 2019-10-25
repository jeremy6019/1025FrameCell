package graphic;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
	   
		setTitle("그래픽 출력");
		setBounds(0,0,300,300);
		setDefaultCloseOperation(
				EXIT_ON_CLOSE);
		setVisible(true);
		System.out.printf("생성자\n");
	}
	@Override
	public void paint(Graphics g) {
		g.drawString("안녕하세요", 100, 90);
		g.drawRect(100, 100, 100, 50);
	}
}
