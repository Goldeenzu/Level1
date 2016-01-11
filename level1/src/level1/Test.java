package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Test implements ActionListener{
JFrame frame;
JPanel panel;
JButton one;
JButton two;
public static void main(String[] args){
	Test x = new Test();
}
Test(){
	frame = new JFrame("Hudhsgdvfvetd");
	panel = new JPanel();
	one = new JButton("HI");
	two = new JButton("BYE");
	frame.setVisible(true);
	frame.setSize(200, 200);
	frame.add(panel);
	panel.add(one);
	one.addActionListener(this);
	panel.add(two);
	two.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==one){
		JOptionPane.showMessageDialog(null, "hi");
	}
	if(e.getSource()==two){
		JOptionPane.showMessageDialog(null, "Bye");
	}
}
}
