package Basic_Java_Programs;

/*class Shape//parent    -----------Single Inheritance-----------
{
	float pi=3.14f;	
	void show(float area){
		System.out.println("Area="+area);
	}
}
class Circle extends Shape//child
{
	float circleArea(float r){
		return(pi*r*r);
	}
}
public class Inheritance{
	public static void main(String arg[]){
	Circle c=new Circle();
	float area=c.circleArea(2f);
	c.show(area);
	}
}
*/
class Game0//	------Hierarchical Inheritance--------
{
	void start(){
		System.out.println("game start");
	}
	void end(){
		System.out.println("game end");
	}
}
class Game01 extends Game0{
	void run1(){
		System.out.println("game 1 is run");
	}
}
class Game2 extends Game0{
	void run2(){
		System.out.println("game 2 is run");
	}
}
public class Inheritance{
	public static void main(String arg[]){
		Game01 g1=new Game01();
		g1.start();
		g1.run1();
		g1.end();
		Game2 g2=new Game2();
		g2.start();
		g2.run2();
		g2.end();
	}
}