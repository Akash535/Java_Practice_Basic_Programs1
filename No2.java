package Simple_Java_Programs;

import java.util.Scanner;
class No2
{
	static public void main(String[] argu)
	{
	Scanner obj=new Scanner (System.in);
	System.out.println("enter the no:");
	int i,j,k,no=obj.nextInt();
	for(i=no;i>=1;i--)
	{
		for(j=1;j<=i;j++)
			System.out.print(" ");
		for(k=no;k>=i;k--)
			System.out.print(""+i);
		System.out.println("");
	}
	System.out.println();


	for(i=no;i>=1;i--)
	{
		for(j=no;j>=i;j--)
			System.out.print(" ");
		for(k=1;k<=i;k++)
			System.out.print(""+i);
		System.out.println("");
	}
	System.out.println();
	}
}



/*
D:\java program>java No2
enter the no:
5
        5
      44
     333
   2222
 1 1 1 1 1

55555
 4444
    333
     22
        1
 

*/