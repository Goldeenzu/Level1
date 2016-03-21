package level1;

public class Spongebob {
	public static void main(String[] args) {
		SeaCreature x = new SeaCreature("SpongeBob");
		x.eat();
		x.laugh();
		SeaCreature y = new SeaCreature("Patrick");
		y.getName();
		y.eat();
		y.laugh();
		SeaCreature z = new SeaCreature("Squidward");
		z.getName();
		z.eat();
		z.laugh();
	}
}
