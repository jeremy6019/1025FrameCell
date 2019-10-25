package graphic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorFrame extends JFrame {

	public ColorFrame() {
		JButton btn1 = new JButton("빨강");
		JButton btn2 = new JButton("녹색");
		JButton btn3 = new JButton("파랑");
	    
		final MyPanel myPanel = new MyPanel(); 
		add("Center", myPanel);
		
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			    myPanel.color =Color.RED;
				//화면을 다시 그려주는 메서드 
				myPanel.repaint();
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			    myPanel.color =Color.GREEN;
				//화면을 다시 그려주는 메서드 
				myPanel.repaint();
				
			}
			
		});
		
		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			    myPanel.color =Color.BLUE;
				//화면을 다시 그려주는 메서드 
				myPanel.repaint();
				
			}
			
		});
		
		JPanel northPanel = 
				new JPanel();
		northPanel.add(btn1);
		northPanel.add(btn2);
		northPanel.add(btn3);
		
		add("North", northPanel);
		
		
		
		setTitle("색상 변경");
		setBounds(0,0,400,400);
		setDefaultCloseOperation(
				EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
