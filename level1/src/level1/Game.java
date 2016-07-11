package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton special;
	public static void main(String[] args) {
		Game x = new Game();
	}
Game(){
	frame = new JFrame("jwduwby3");
	frame.setVisible(true);
	frame.setSize(350, 100);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel = new JPanel();
	special = new JButton();
	frame.add(panel);
	Random r = new Random();
	int rand = r.nextInt(8);
	for (int i = 0; i < 8; i++) {
		if (i == rand){
			panel.add(special);
			special.addActionListener(this);
		}
		else{
			JButton one = new JButton();
			one.addActionListener(this);
			panel.add(one);
		}
		panel.removeAll();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(special==e.getSource()){
		JOptionPane.showMessageDialog(null, "you win");
	}
	else{
		JOptionPane.showMessageDialog(null, "nope");
	}
}
}
