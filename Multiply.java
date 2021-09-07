package Simple_Java_Programs;

import java.util.Scanner;
class Multiply
{
	static public void main(String [] argu)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no you want to print table");
		int no=obj.nextInt();
		for(int i=1;i<=10;i++)
		{	
			System.out.println(no+"*"+i+"="+no*i);	
		}
	}
}


/*
D:\java program>java Multiply
enter the no you want to print table
5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
*/