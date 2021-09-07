package Simple_Java_Programs;

import java.util.Scanner;
class No1
{
	static public void  main(String []argu)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no:");
	int i,j,no=obj.nextInt();
	System.out.println();
	for(i=1;i<=no;i++)
	{
		for(j=1;j<=i;j++)
			System.out.print(""+i);
		System.out.println();
	}
	System.out.println();
	for(i=no;i>=1;i--)
	{
		for(j=1;j<=i;j++)
			System.out.print(+i);
		System.out.println();
	}
	}
}


/*
D:\java program>java No1
enter the no:
7

1
22
333
4444
55555
666666
7777777

7777777
666666
55555
4444
333
22
1
*/