package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaculatorGUI implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField one;
	JTextField two;
	JButton add;
	JButton sub;
	JButton multi;
	JButton divide;

	public static void main(String[] args) {
		CaculatorGUI x = new CaculatorGUI();
	}

	CaculatorGUI() {
		frame = new JFrame("wow");
		panel = new JPanel();
		one = new JTextField(5);
		two = new JTextField(5);
		add = new JButton("ADD");
		sub = new JButton("SUBTRACT");
		multi = new JButton("MULTIPLY");
		divide = new JButton("DIVIDE");
		frame.setVisible(true);
		frame.setSize(100, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		panel.add(add);
		add.addActionListener(this);
		panel.add(sub);
		sub.addActionListener(this);
		panel.add(multi);
		multi.addActionListener(this);
		panel.add(divide);
		divide.addActionListener(this);
	}
	Caculator2 c = new Caculator2();

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String g = one.getText();
        int o = Integer.parseInt(g);
        String h = two.getText();
        int t = Integer.parseInt(h); 
		if (e.getSource() == add) {
			int x = c.add(o,t);
			System.out.println(x);
		}
		if(e.getSource()==sub){
			int y = c.sub(o,t);
			System.out.println(y);
		}
		if(e.getSource()==multi){
			int z = c.multi(o, t);
			System.out.println(z);
		}
		if(e.getSource()==divide){
			int w = c.divide(o,t);
			System.out.println(w);
		}
	}
}
