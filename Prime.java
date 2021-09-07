package Simple_Java_Programs;

import java.util.Scanner;
class Prime{
	static public void main(String [] argu){
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the no");
		int p=obj.nextInt();
		int temp=0;
		System.out.println("the no is divisible by:");
		for(int i=2;i<=p-1;i++){
			if(p%i==0){
				System.out.print(i+" ,");
				temp=temp+1;
				}
			
		}
		System.out.println(" 1 & "+p);
		if(temp>0)
			System.out.println("it is not prime no");
		else 
			System.out.println("it is prime no");
	}

}


/*
D:\java program>java Prime
enter the no
9
the no is divisible by:
  3  1 & 9
it is not prime no

D:\java program>java Prime
enter the no
7
the no is divisible by:
  1 & 7
it is prime no
*/