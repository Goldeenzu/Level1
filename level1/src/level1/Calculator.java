package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame Frame;
	JPanel Panel;
	JButton Add;
	JButton Sub;
	JButton Mult;
	JButton Divide;
	JTextField One;
	JTextField Two;

	public static void main(String[] args) {
		Calculator bob = new Calculator();
	}

	Calculator() {
		Frame = new JFrame("Jurassic Park");
		Panel = new JPanel();
		Add = new JButton("ADD");
		Sub = new JButton("SUB");
		Mult = new JButton("MUTI");
		Divide = new JButton("DIVE");
		One = new JTextField(5);
		Two = new JTextField(5);
		Frame.setVisible(true);
		Frame.setSize(500, 500);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.add(Panel);
		Panel.add(One);
		Panel.add(Two);
		Panel.add(Add);
		Add.addActionListener(this);
		Panel.add(Sub);
		Sub.addActionListener(this);
		Panel.add(Mult);
		Mult.addActionListener(this);
		Panel.add(Divide);
		Divide.addActionListener(this);

	}

	float add(float x, float y) {
		float z = x + y;
		return z;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String doge = One.getText();
		String dogey = Two.getText();
		float Rouya = Integer.parseInt(doge);
		float Dave = Integer.parseInt(dogey);
		if(e.getSource() == Add)
			JOptionPane.showMessageDialog(null, ""+ add (Rouya, Dave));
		if (e.getSource() == Sub) {
			JOptionPane.showMessageDialog(null, Rouya - Dave);
		}
		if (e.getSource() == Mult) {
			JOptionPane.showMessageDialog(null, Rouya * Dave);
		}
		if (e.getSource() == Divide) {
			JOptionPane.showMessageDialog(null, Rouya / Dave);
		}
	}
}
