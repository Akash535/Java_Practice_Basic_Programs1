package Simple_Java_Programs;

class FibonacciR
{
	static int a=0,b=1,c;
	static public void main(String []argu)
	{
		FibonacciR obj=new FibonacciR ();
		obj.print(10);
	}
	void print(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.println(a+"+"+b+"="+c);
			a=b;b=c;
			print(i-1);
		}
	}
}
/*
D:\java program>java Fibonacci
0+1= 1
1+1= 2
1+2= 3
2+3= 5
3+5= 8
5+8= 13
8+13= 21
13+21= 34
21+34= 55
34+55= 89
*/