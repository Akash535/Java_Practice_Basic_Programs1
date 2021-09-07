package Simple_Java_Programs;

import java.util.Scanner;

class Calci
{
	static public void main(String [] argu)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value a= ");
		float a=obj.nextFloat();
		System.out.println("enter the value b= ");
		float b=obj.nextFloat();
		int z;
		do{
		System.out.println("menu : \n 1: addition\n 2:substraction\n 3:multiply\n 4:division\n 5:exit");
		System.out.println("enter the choice:");
		int ch=obj.nextInt();
		
		switch(ch){
			case 1: float add=a+b;
				System.out.println("addition: "+add);
			break;
			case 2: float sub=a-b;
				System.out.println("substractin: "+sub);
			break;
			case 3: float mul=a*b;
				System.out.println("multiply: "+mul);
			break;
			case 4: float div=a/b;
				System.out.println("division: "+div);
			break;
			case 5: z=0;
			break;
		}
			System.out.println("press 1 to continue:");
			z=obj.nextInt();
		}while(z==1);
	}
}