package level1;

public class SKOOGLE {
	static int counter = 0;

	public static void main(String[] args) {
		SKOOGLE x = new SKOOGLE();
	}

	SKOOGLE() {
		System.out.println(counter);
		counter++;
		new SKOOGLE();
	}
}
