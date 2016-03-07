package level1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomColors implements KeyListener {
	JFrame frame;
	JPanel panel;

	public static void main(String[] args) {
		RandomColors x = new RandomColors();
	}

	RandomColors() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setSize(500, 500);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stu

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		panel.setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		panel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
