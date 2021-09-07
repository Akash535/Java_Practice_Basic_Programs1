package Simple_Java_Programs;

import java.util.Scanner;
class Reverse
{
	public static void main(String []argu)
	{
	Scanner obj=new Scanner (System.in);
	/*System.out.print("enter the no:");
	int no=obj.nextInt();
	int rev=0,rem;
	while(no !=0)
	{
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	System.out.println("reverse no:"+rev);
	*/


	
	
	System.out.print("enter the name:");
	String s=obj.next();
	int len=s.length();
	String rev="";
	for(int i=len-1;i>=0;i--){
		rev=rev+s.charAt(i);
	}
	System.out.println("reverse no:"+rev);
	}
}


/*
D:\java program>java Reverse
enter the name:AKASH
reverse no:HSAKA
*/