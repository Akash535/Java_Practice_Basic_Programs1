package Simple_Java_Programs;

class Fibonacci
{
	static public void main(String []argu)
	{
	int a=0,b=1,c;
	for(int i=1;i<=10;i++)
	{
		c=a+b;
		System.out.println(+a+"+"+b+"= "+c);
		a=b;
		b=c;
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