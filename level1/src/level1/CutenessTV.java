package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV  implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton duck;
	JButton frog;
	JButton uni;
public static void main(String[] args){
	CutenessTV x = new CutenessTV();
}
CutenessTV(){
	frame = new JFrame("Cuteness TV");
	panel = new JPanel();
	duck = new JButton("Duck");
	frog = new JButton ("Frog");
	uni = new JButton ("Unicorns");
	frame.setVisible(true);
	frame.setSize(300, 75);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(duck);
	duck.addActionListener(this);
	panel.add(frog);
	frog.addActionListener(this);
	panel.add(uni);
	uni.addActionListener(this);
}
void showDucks() {
	playVideo("MtN1YnoL46Q");
}

void showFrog() {
	playVideo("aSjCb-FfxhI");
}

void showFluffyUnicorns() {
	playVideo("qRC4Vk6kisY");
}

void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource()== duck){
	showDucks();
}
if(e.getSource() == frog){
	showFrog();
}
if(e.getSource() == uni){
	showFluffyUnicorns();
}
}


}
