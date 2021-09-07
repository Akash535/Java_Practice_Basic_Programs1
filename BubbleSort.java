package Basic_Java_Programs;

class BubbleSort
{	static public void main(String []argu)
	{
	
	int[] a={21,22,3,54,54,50,92,10,62,24,30,75};
	int i,j,temp;
	for(i=0;i<a.length;i++)
	{
		int flag=0;
		for(j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0)
		{
			break;
		}	
	}
	for(i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}
	}
}


/*
D:\java program>java BubbleSort
 3 10 21 22 24 30 50 54 54 62 75 92
*/