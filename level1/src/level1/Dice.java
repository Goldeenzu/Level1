package level1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dice implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton roll;
	JButton reset;
	JLabel number;
	JLabel total;

	public static void main(String[] args) {
		Dice x = new Dice();
	}

	Dice() {
		frame = new JFrame("DINOSAUR");
		panel = new JPanel();
		roll = new JButton("ROLL");
		number = new JLabel();
		reset = new JButton("RESET");
		total = new JLabel("0");
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(roll);
		roll.addActionListener(this);
		panel.add(number);
		panel.add(reset);
		reset.addActionListener(this);
		panel.add(total);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int random = new Random().nextInt(6)+1;
		if (e.getSource()==roll) {
			number.setText(""+random);
			int old = Integer.parseInt(total.getText());
			total.setText(""+ (random + old));
		}
		if(e.getSource()==reset){
			total.setText(""+ 0);
		}
	}
}
