package level1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painter extends JPanel implements MouseListener, MouseMotionListener, KeyListener {

	JFrame window;

	ArrayList<Dot> dots = new ArrayList<Dot>();
	Color r = new Color(0, 0, 0);

	public static void main(String[] args) {
		new Painter();
	}

	public Painter() {
		window = new JFrame();
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		window.addMouseListener(this);
		window.addMouseMotionListener(this);
		window.addKeyListener(this);
		// 1. Make the window respond to mouse clicks
		// 2. Use the addDot() method to create a new dot at the mouse's x and y position when the mouse is clicked.
	}

	public void paintComponent(Graphics g) {
		for (Dot d : dots) {
			d.draw(g);
		}
	}

	private void addDot(int x, int y) {
		dots.add(new Dot(x - 25, y, 50, 50));
	}

	private class Dot {
		int x;
		int y;
		int width;
		int height;

		public Dot(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		public void draw(Graphics g) {
			g.setColor(r);
			g.fillRect(x, y, width, height);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			addDot(e.getX(), e.getY());
			repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_1) {
			r = new Color(255, 0, 0);
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			r = new Color(0, 255, 0);
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			r = new Color(0, 0, 255);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}