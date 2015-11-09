package level1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class keyboard implements KeyListener{
	JFrame f;
public static void main(String[] args) {
	keyboard x = new keyboard();
}
keyboard()
{
	f = new JFrame();
	f.setVisible(true);
	f.addKeyListener(this);
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
