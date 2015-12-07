package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton submit;
	JTextField one;
	JTextField two;
	JTextField three;
	JTextField four;
	JTextField five;
	JTextField six;
	JTextField seven;
	JTextField eight;
	JTextField nine;

	public static void main(String[] args){
		TicTacToe x = new TicTacToe();
	}

	TicTacToe() {
		frame = new JFrame("Tic Tac Toe");
		panel = new JPanel();
		submit = new JButton("PUPPIES");
		one = new JTextField(1);
		two = new JTextField(1);
		three = new JTextField(1);
		four = new JTextField(1);
		five = new JTextField(1);
		six = new JTextField(1);
		seven = new JTextField(1);
		eight = new JTextField(1);
		nine = new JTextField(1);
       frame.setVisible(true);
       frame.setSize(100, 165);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(panel);
       panel.add(one);
       panel.add(two);
       panel.add(three);
       panel.add(four);
       panel.add(five);
       panel.add(six);
       panel.add(seven);
       panel.add(eight);
       panel.add(nine);
       panel.add(submit);
       submit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent r){
		String a = one.getText();
		String b = two.getText();
		String c = three.getText();
		String d = four.getText();
		String e = five.getText();
		String f = six.getText();
		String g = seven.getText();
		String h = eight.getText();
		String i = nine.getText();
		if (a.equals(b)&&a.equals(c)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
		if(d.equals(e)&&d.equals(f)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
		if (g.equals(h)&&g.equals(i)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
		if(a.equals(d)&&a.equals(g)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
		if(b.equals(e)&&b.equals(h)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
		if(c.equals(f)&&c.equals(i)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
		if(a.equals(e)&&a.equals(i)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
		if(c.equals(e)&&c.equals(g)){
			JOptionPane.showMessageDialog(null, "Such Wow");
		}
	}
}