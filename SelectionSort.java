package Basic_Java_Programs;

class SelectionSort
{
	public static void main(String []args)
	{
	int [] a={51,62,14,74,32,92,35,69};
	int i,j,temp=0,min;
	for(i=0;i<a.length;i++)
	{
		min=i;
		for(j=i+1;j<a.length;j++)
		{
			if(a[min]>a[j])
			{
				min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	for(i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}
	}
}


/*
D:\java program>java SelectionSort
 14 32 35 51 62 69 74 92
*/