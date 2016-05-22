package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel riddle;
	JTextField answer;
	JButton submit;
	JButton hint;
	String personAnswer = " ";
public static void main(String[] args){
	PracticeTest x = new PracticeTest();
}
PracticeTest(){
	JFrame frame = new JFrame("oh wow it's a riddle");
	JPanel panel = new JPanel();
	JLabel riddle = new JLabel("What's 2 + 2?");
	JTextField answer = new JTextField(5);
	JButton submit = new JButton("SUBMIT");
	JButton hint = new JButton("HINT");
	frame.setVisible(true);
	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(riddle);
	panel.add(answer);
	panel.add(submit);
	submit.addActionListener(this);
	panel.add(hint);
	hint.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == hint){
		System.out.println("sdkjfhv");
		JOptionPane.showMessageDialog(null, "Okay listen buddy, I couldn't think of a riddle. Use a calculator or someting.");
	}
	String y = answer.getText();
	if(e.getSource()==submit){
		if(y.equals ("4")) {
			JOptionPane.showMessageDialog(null, "wow");
		}
		else{
			JOptionPane.showMessageDialog(null, "nope");
		}
	}
}
}
