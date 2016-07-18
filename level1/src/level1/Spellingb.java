package level1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Spellingb {
	int lines;
	ArrayList<String> words = new ArrayList<>();

	/*
	 * Get a random word using the randomWord() method and ask the user how to
	 * spell it using the speak() method. If the user spells it right move on to
	 * a new word, but if they do not spell it right ask again. The only place
	 * that you need to write code in is the stuffForYouToDo() Method
	 */
	public void stuffForYouToDo() {
		//You write code in here
		String word = randomWord();
		Speak(word);
		System.out.println(word);
		String answer = JOptionPane.showInputDialog(null,"How do you spell the word");
		if(answer == word){
			word = randomWord();
			Speak(word);
		}
		else{
			JOptionPane.showMessageDialog(null, "nope");
		}
	}

	public String randomWord() {
		return words.get(new Random().nextInt(lines));
	}

	public Spellingb() {
		System.out.println(" /--------------------------------------------\\ ");
		System.out.println(" | Warning: Some of the words are super hard! | ");
		System.out.println(" \\--------------------------------------------/ ");
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("/usr/share/dict/words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			System.out.println("Number of words: " + lines);
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/words")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new Spellingb();
	}

	public void Speak(String text) {
		try {
			Runtime.getRuntime().exec("say " + text).waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public void speakNoWait(String text) {
		try {
			Runtime.getRuntime().exec("say " + text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


