package level1;

public class Rocketlauncher{
	public static void main(String[] args){
		//All code goes here.
		Rocket bob = new Rocket(); 
		bob.launch();
	}
}

class Rocket{
	Rocket(){
		System.out.println("You’ve just built a new rocket!!");
	}
	public void launch(){
		System.out.println("ZOOOOOOM!");
	} 
}
