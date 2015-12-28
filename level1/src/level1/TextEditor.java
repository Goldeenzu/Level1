package level1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextEditor implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel stuff;
	String y = "";

	public static void main(String[] args) {
		TextEditor x = new TextEditor();
	}

	TextEditor() {
		frame = new JFrame();
		panel = new JPanel();
		stuff = new JLabel();
		frame.setVisible(true);
		frame.setSize(1000, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(stuff);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		y += e.getKeyChar();
		stuff.setText(y);
		if (e.getKeyCode() == KeyEvent.VK_E){
			String c = ("POTATO");
			y = c;
			stuff.setText(y);
		}
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			if(y.length() > 1){
				String z = y.substring(0, y.length()-2);
					y = z;
					stuff.setText(y);
				}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
