package Simple_Java_Programs;

import java.util.Scanner;
class Factorial
{
	static public void main(String [] argu)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no:");
	int no=obj.nextInt();
	int fact=1;
	for(int i=1;i<=no;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial is="+fact);
	}
}