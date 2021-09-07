package Simple_Java_Programs;

import java.util.Scanner;
class No3
{
	static public void main(String []argu)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no:");
	int i,j,count=0,no=obj.nextInt();
	for(i=1;i<=no;i++)
	{
		for(j=1;j<=i;j++)
		{
			count=count+1;
			System.out.print(" "+count);
		}
		System.out.println();
	}
	System.out.println();
	for(i=1;i<=no;i++)
	{
		for(j=i;j>=1;j--)
		System.out.print(" "+j);
		
		System.out.println();
	}
	}
}



/*
D:\java program>java No3
enter the no:
5
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1
*/