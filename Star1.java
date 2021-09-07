package Simple_Java_Programs;

import java.util.Scanner;
class Star1
{
	static public void main(String []argu)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no:");
	int no=obj.nextInt();
	int i,j;
	for(i=1;i<=no;i++)
	{
		for(j=no;j>=i;j--)
			System.out.print(" *  ");
		System.out.println("");
	}	

	System.out.println("\n");
	for(i=1;i<=no;i++)
	{
		for(j=1;j<=i;j++)
			System.out.print(" *  ");
		System.out.println("");
	}	
	}
}



/*
D:\java program>java Star1
enter the no:
5
 *   *   *   *   *
 *   *   *   *
 *   *   *
 *   *
 *


 *
 *   *
 *   *   *
 *   *   *   *
 *   *   *   *   *
*/