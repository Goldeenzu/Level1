package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RandomNumberGuesser implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField box;
	Random r;
	int SomeOtherName = 0;
public static void main(String[] args) {
	RandomNumberGuesser x = new RandomNumberGuesser();
}
RandomNumberGuesser(){
	frame = new JFrame();
	panel = new JPanel();
	button = new JButton("GUESS");
	box = new JTextField(3);
	r = new Random();
	frame.setVisible(true);
	frame.setSize(150, 150);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button);
	button.addActionListener(this);
	panel.add(box);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int y = Integer.parseInt(box.getText());
	int w = 0;
	while (y != w) {
	if(e.getSource() == button){
		w = (r.nextInt(100)+1);
		System.out.println(w);
		SomeOtherName += 1;
	if(y == w){
		JOptionPane.showMessageDialog(null, SomeOtherName);
	}
	}
	}
}
}
