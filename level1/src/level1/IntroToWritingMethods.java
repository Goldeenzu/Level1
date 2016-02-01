package level1;

import javax.swing.JOptionPane;

public class IntroToWritingMethods {
	public static void main(String[] args) {
		IntroToWritingMethods x = new IntroToWritingMethods();
		System.out.println(x.sum(4, 5));
		
	}

	void irocks() {
		System.out.println("Catherine" + " Rocks");
	}

	void rocker(String z) {
		System.out.println(z + " rocks");
	}

	void truth(String c) {
		if (c == "Justin Beiber") {
			System.out.println(c + " sucks");
		}
		if (c == "Tyler Joseph") {
			System.out.println(c + " is awesome");
		}
	}

	void echo(String b) {
		System.out.print(b + " " + b);
	}

	void repeat(String a, int v) {
		for (int i = 0; i < v; i++) {
			System.out.println(a + " ");
		}
	}

   String getTheBestCoder(){
		return "nick";
   }   
   
   int sum(int f, int c){
	   return f+c;
   }
}
