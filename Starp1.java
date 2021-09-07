package Simple_Java_Programs;

import java.util.Scanner;
class Starp1
{
	static public void main(String []argu)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the no:");
	int i,j,k,no=obj.nextInt();
	for(i=1;i<=no;i++)
	{
		for(j=no;j>=i;j--)
			System.out.print(" ");
		for(k=1;k<=i;k++)
			System.out.print(" "+i);
		System.out.println();
	}
	}
}



/*
D:\java program>java Starp5
enter the no:
9
          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *
    * * * * * * *
   * * * * * * * *
  * * * * * * * * *
*/