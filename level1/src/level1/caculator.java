package level1;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class caculator implements ActionListener{
	JFrame f;
	JPanel p;
	JButton a;
	JButton m;
	JTextField b;
	JTextField y;
public static void main(String[] args) {
 caculator x = new caculator();
} 

caculator()
{
f = new JFrame();
f.setVisible(true);
p = new JPanel();
a = new JButton("Add");
a.addActionListener(this);
m = new JButton("Multiply");
b = new JTextField();
y = new JTextField();
f.setSize(500, 500);
f.add(p);
p.add(a);
p.add(m);
p.add(b);
p.add(y);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
