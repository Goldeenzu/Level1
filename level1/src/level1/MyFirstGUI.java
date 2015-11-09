import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFirstGUI implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton button;
	JButton button2;
	JTextField jtf;
	JLabel label;
public static void main(String[] args) {
	MyFirstGUI x = new MyFirstGUI();
}
MyFirstGUI(){
	System.out.print  ("hello");
	window = new JFrame("stuff");
	panel=new JPanel();
	button=new JButton("hi");
	button2=new JButton("hi 2");
	jtf=new JTextField(5);
	label=new JLabel("Username");	
	window.setVisible(true);
	window.setSize(500,500);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.add(panel);
	panel.add(button);
	button.addActionListener(this);
	panel.add(button2);
	button2.addActionListener(this);
	panel.add(jtf);
	panel.add(label);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("button");
	System.out.println("button2");
	if(e.getSource()==button){
		System.out.println("jldfvhugsahjdfudh");
	}
	if(e.getSource()==button2){
		System.out.println("hhhhhhhhhhhhhh");
	}
	if(e.getSource()==button){
		jtf.setText("bob");
	}
	if(e.getSource()==button2){
		JOptionPane.showMessageDialog(null, jtf.getText());
	}
}
}
