package level1;

import javax.swing.JOptionPane;

public class GeniusOrNot {
 String Answer;
	void Question(){
		GetQuestion();
	}
	void GetQuestion(){
		 Answer = JOptionPane.showInputDialog("What does 9+10 equal?");
	}
	void IfRight(){
		int x = Integer.parseInt(Answer);
		if(x == 19){
			System.out.println("No");
			
		}
		if(x == 21){
			System.out.println("No");
			
		}
		if(x == 910){
			System.out.println("Yez! U a GEENIUS! GERD JERB!");
			
		}
		
	}
}
