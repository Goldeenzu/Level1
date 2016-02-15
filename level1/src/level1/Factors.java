package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Factors implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField text;
	String s = "";

	public static void main(String[] args) {
		Factors x = new Factors();
	}

	Factors() {
		frame = new JFrame("AMAZING");
		panel = new JPanel();
		button = new JButton("SUBMIT");
		text = new JTextField(5);
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		panel.add(text);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button){
		int x = Integer.parseInt(text.getText());
		for (int i = 1; i < x ; i++) {
		if (x % i == 0) {
		s += "" + i + ", ";
		}
		}
		JOptionPane.showMessageDialog(null, s + x);
	}
	s = "";
	
}
}
