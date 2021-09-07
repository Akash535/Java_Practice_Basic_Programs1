/* constructor :-
	-like a mothod/function.
	-intialization of instance veriables dynamically.
	-like a mothod but a same name as that of class name.
	-no need to call constructor it will implicitly get invoked / call once create object.

	-returntype methodName(arg list ){-----}
	-constructor doesnt have return type not even void.
ex-
	class Employee
		-----Employee()........default constructor ........without arguments.
		 	{
			          ----------
			}
Static Method :-
	-scope resoluction op---java8
	-class name,creating object.
	-::
	-interface ....abstraction
	-SAM-single abstract method .....function interface
	-lambda ex....lambda method.....java 8
	-static method refernce ....how to call static method using :: 
*/

package Basic_Java_Programs;

class Employee{
	//Instance variables.......runtime memory.......once we create object.......heap
	int eid;// 0
	String name;//null
	float salary;//0.0
	
	//constructor
	Employee(){
		System.out.println(" Default Constructor");
	}
	/*Employee(int i,String n,float s)  //parametrized constructor ......Local variables
	{
		System.out.println("\n Parametrized  Constructor");
		eid=i;// 21
		name=n;//Akash
		salary=s;//53000
	}*/
	Employee(int eid,String name,float salary)  //parametrized constructor ......Local variables
	{
		System.out.println("\n Parametrized  Constructor");
		this.eid=eid;// 2	// this keyword ---use to resolve naming conflict between local & instance variables name .alwaye rafer to instance variables.
		this.name=name;//Shingade
		this.salary=salary;//21000
	}
	void show(){
		System.out.println("ID="+eid);
		System.out.println("NAME="+name);
		System.out.println("Salary="+salary);
	}
}
public class Constructer{
	public static void main(String argu[]){
		Employee e=new Employee();
		e.show(); //method call
		Employee e1=new Employee(21,"Akash",53000);
		e1.show();
		Employee e2=new Employee(2,"Shingade",21000);
		e2.show();
	}
}

/*
D:\java program>java Constructer
 Default Constructor
ID=0
NAME=null
Salary=0.0

 Parametrized  Constructor
ID=21
NAME=Akash
Salary=53000.0

 Parametrized  Constructor
ID=2
NAME=Shingade
Salary=21000.0
*/

