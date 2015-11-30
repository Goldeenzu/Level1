package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Contol implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton up;
	JButton down;
	JButton right;
	JButton left;
	int u = 1;
	int d = 2;
	int r = 3;
	int l = 4;
	int lastclicked = 5;
public static void main(String[] args) {
	Contol x = new Contol();
}
Contol(){
frame = new JFrame();
panel = new JPanel();
up = new JButton("up");
down = new JButton("down");
left = new JButton("left");
right = new JButton("right");
frame.setVisible(true);
frame.setSize(300, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
panel.add(left);
left.addActionListener(this);
panel.add(up);
up.addActionListener(this);
panel.add(right);
right.addActionListener(this);
panel.add(down);
down.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e){	
	if(e.getSource()==up){
		if(lastclicked != u){
		System.out.println("up");
		lastclicked = u;
		}
	}
	if(e.getSource()==down){
		if(lastclicked != d){
		System.out.println("down");
		lastclicked = d;
		}
	}
	if(e.getSource()==left){
		if(lastclicked != l){
		System.out.println("left");
		lastclicked = l;
		}
	}
	if(e.getSource()==right){
		if(lastclicked != r){
		System.out.println("right");
		lastclicked = r;
		}
	}
}
}

