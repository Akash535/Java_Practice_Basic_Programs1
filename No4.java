package Simple_Java_Programs;

import java.util.Scanner;
class No4
{
	static public void main(String []argu)
	{
	Scanner obj=new Scanner (System.in);
	System.out.println("enter the no:");
	int i,j,no=obj.nextInt(),k;
	for(i=1;i<=no;i++)
	{
		for(j=1;j<=i;j++)
			System.out.print(" "+j);
		for(k=i-1;k>=1;k--)
			System.out.print(" "+k);
		System.out.println();
	}

	}
}