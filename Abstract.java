package Basic_Java_Programs;

abstract class Game{
	
	void start(){
		System.out.println("game is starting");
	}
	void end(){
		System.out.println("game is ending");
	}
	abstract void run();//abstract method -----rule 
}
class Game1 extends Game{
	void run(){
		System.out.println("game 1 is running");
	}
}
public class Abstract{
	public static void main(String arg[]){
		//Game g=new Game();
		Game1 g1=new Game1();
		g1.start();
		g1.run();
		g1.end();
	}
}