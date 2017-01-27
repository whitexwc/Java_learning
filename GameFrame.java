package test;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * ��Ϸ������
 * @author simor
 *
 */
public class GameFrame extends Frame {
	Image img=GameUtil.getImage("images/hello.jpg");
/**
 * ���ش���	
 */
	public void langchFrame(){
		setSize(1000,1000);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();//�����߳�
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	private double x,y; 
	@Override
	public void paint(Graphics g) {
		System.out.println("paint!!!");
		Color c=g.getColor();
		g.setColor(Color.BLUE);
		g.drawImage(img, (int)x,(int)y, null);
		x+=3;
		y+=3;
		Font f=new Font("����",Font.ITALIC,100);
		g.setFont(f);
		g.drawString("very hi", 200, 200);
		
	}
	
/**
 * �ػ��̷߳���
 * @author simor
 *
 */
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String []args){
		GameFrame gf=new GameFrame();
		gf.langchFrame();
	}
}
