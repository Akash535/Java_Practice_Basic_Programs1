package Simple_Java_Programs;

import java.util.Scanner;
class Armstrong
{
	static public void main(String []argu)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no:");
		int no=obj.nextInt();
		//int no=153;
		int t1=no,len=0;
		while(t1!=0)
		{
			len=len+1;
			t1=t1/10;
		}
		int t2=no;
		int rem,arm=0;
		while(t2!=0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;	
			}
			arm=arm+mul;
			t2=t2/10;
		}	
		if(arm==no)
			System.out.println(arm+"=it is Armstrong"+no);
		else
			System.out.println(arm+"=it is not Armstrong"+no);
	}
}

/*
Armstrong no is 0,1,153,370

D:\java program>java Armstrong
enter the no:
153
153it is Armstrong153

D:\java program>java Armstrong
enter the no:
121
10=it is not Armstrong121
*/