package Basic_Java_Programs;

class Gamed{
	void start(){
		System.out.println("game start");
	}
	void end(){
		System.out.println("game end");
	}
}
class Gamed1 extends Gamed{
	void run1(){
		System.out.println("game 1 is run");
	}
}
class Gamed2 extends Gamed{
	void run2(){
		System.out.println("game 2 is run");
	}
	void end(){
		System.out.println("G2 game end");
	}
}

public class Overriding {
	public static void main(String arg[]){
		Gamed1 g1=new Gamed1();
		g1.start();
		g1.run1();
		g1.end();
		Gamed2 g2=new Gamed2();
		g2.start();
		g2.run2();
		g2.end();
	}
}