package graphic2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class G2DPanel extends JPanel {

	//화면에 보여질 때나 repaint메소드를 호출하면 
	//화면에 출력되는 메소드 
	@Override 
	public void paint(Graphics g) {
        //Image객체 만들기 
		Image image = 
				Toolkit.getDefaultToolkit()
				.getImage(
						"/Users/a503-22/Documents/style_5d1c45bd707ed.jpg");
		
		//그림 출력 - 좌표만 입력해서 출력: 원본크기 그대로 
//	    g.drawImage(image,  
//		100, 100, this );
		
		//100,100에 200, 200크기로 원본을 출력 
//	    g.drawImage(image, 
//		100, 100,  200, 200, this);	
	  
		//0,0에서 100,100만큼 분할해서 
		//100,100부터 200,200까지 출력 
/*
		g.drawImage(image, 
				100, 100, 200, 200, 
				0,0, 100,100, 
		this);
*/
	
	
		//출력 영역을 수정 
		g.setClip(0, 0, 150, 300);
		
		g.drawImage(image, 
				100, 100, 200, 200, 
				0,0, 100,100, 
		this);
		g.drawImage(image, 
				100, 300, 200, 200, 
				0,0, 100,100, 
		this);
	
		
		/*		
		//그림 그리기 
		g.fillRect(100, 100, 50, 50);
		
		//그래픽스 객체 변환 
		Graphics2D g2 = (Graphics2D)g;
		
       //그라데이션 설정
		g2.setPaint(new GradientPaint(
				5, 30, Color.RED,
				10, 50, Color.YELLOW, true));
		g2.fill(new Rectangle2D.Double(
				200, 200, 70, 85));
		
		//선 두께 수정 
		g2.setStroke(new BasicStroke(10));
		g2.draw(new Ellipse2D.Double(
				200, 300, 100, 100));
		
		//색상 변경 
		g2.setPaint(Color.DARK_GRAY);
		float[] dashes = {10};
		g2.setStroke(new BasicStroke(
				5, BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_ROUND,
				10, dashes,0));
		g2.draw(new Ellipse2D.Double(100, 300, 100, 100));
*/
		
/*	
		// 색상 설정 
		g2.setColor(Color.BLUE);
		g2.fill(new Rectangle2D.Double(
				200, 200, 70, 85));
		
		
		g2.setColor(Color.ORANGE);
		g2.fill(new Ellipse2D.Double(
				200, 200, 30, 30));
//		g2.draw(new Ellipse2D.Double(
//						200, 200, 30, 30));
*/				
	}
	
}
