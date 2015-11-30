package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SlotMachine implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton spin;
    JLabel one;
	JLabel two;
	JLabel three;
	JTextField bet;
public static void main(String[] args) {
	SlotMachine x = new SlotMachine();
}
SlotMachine(){
	frame = new JFrame();
	panel = new JPanel();
	spin = new JButton("spin");
	one = new JLabel();
	two = new JLabel();
	three = new JLabel();
	bet = new JTextField(5);
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(spin);
	spin.addActionListener(this);
	panel.add(one);
	panel.add(two);
	panel.add(three);
	panel.add(bet);
}
@Override
public void actionPerformed(ActionEvent e){
	int x = new Random().nextInt(3);
	int y = new Random().nextInt(3);
	int z = new Random().nextInt(3);
	if (e.getSource()==spin){
		one.setText(""+ x);
		two.setText(""+ y);
		three.setText(""+ z);
	}
	if (x==y&&y==z){
		JOptionPane.showMessageDialog(null, "You Win");
	}
}
}
