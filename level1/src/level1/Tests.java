package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tests implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField text;

	public static void main(String[] args) {
		Tests x = new Tests();
	}

	Tests() {
		frame = new JFrame("Square");
		panel = new JPanel();
		button = new JButton("Square");
		text = new JTextField(5);
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(text);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String number = text.getText();
		int y = Integer.parseInt(number);
		JOptionPane.showMessageDialog(null, y * y);

	}
}
