package Simple_Java_Programs;

import java.util.Scanner;
class Line
{
	static public void main(String []argu)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no:");
	int i,j,no=obj.nextInt();
	for(i=1;i<=no;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(i>=2 && j<=i-1)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println();
	}


	for(i=1;i<=no;i++)
	{
		for(j=no;j>i;j--)
		
			System.out.print(" ");
			for(int k=1;k<=i;k++)
			{
				if(i>=2 && k>1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
		
		System.out.println();
	}
}
}




/*
enter the no:
5
*
 *
  *
   *
    *
    *
   *
  *
 *
*

*/