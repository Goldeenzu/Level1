package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DateAndTime implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton dat;
	JButton time;
	
	public static void main(String[] args) {
		DateAndTime x = new DateAndTime();
	}
DateAndTime(){
	frame = new JFrame("WOWOOWOWOWOOWOWOWO");
	panel = new JPanel();
	dat = new JButton("DATE");
	time = new JButton("TIME");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(200, 100);
	frame.add(panel);
	panel.add(dat);
	dat.addActionListener(this);
	panel.add(time);
	time.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Calendar cal = Calendar.getInstance();
	String date = cal.getTime().toString();
	String y = date.substring(0, 10);
	String z = date.substring(13,19);
	String i = date.substring(11,13);
	int w = Integer.parseInt(i);
	if (w > 12){
	   w -= 12;
	}
	if(e.getSource()==dat){
		System.out.println(y);
	}
	if(e.getSource()==time){
		System.out.println(w + z);
	}
}
}

