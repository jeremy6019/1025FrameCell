package graphic2;

import javax.swing.JFrame;

public class MouseFrame extends JFrame {

	public MouseFrame() {
		MousePanel p = new MousePanel(); 
		add(p);
		
		setTitle("마우스로 선 그리기 ");
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(
				EXIT_ON_CLOSE);
	}
	
}
