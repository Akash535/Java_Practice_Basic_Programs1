package Basic_Java_Programs;

interface Gamedemo{
	void start();// public abstract add implecitly by the compiler
	void stop();
	void run();
}
/*abstract class GameNext implements Game{
	abstract void pause();
}*/
class Gamedemo1 implements Gamedemo {
	public void start(){
		System.out.println("game is starting");
	}
	public void stop(){
		System.out.println("game is stoping");
	}
	public void run(){
		System.out.println("game is running");
	}
}
class Interdface{
	public static void main(String arg[]){
		Gamedemo1 g1=new Gamedemo1();
		g1.start();
		g1.run();
		g1.stop();
		Gamedemo g;
		g=new Gamedemo1();
	}
}