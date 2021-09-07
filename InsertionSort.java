package Basic_Java_Programs;

class InsertionSort
{
	static public void main(String []argu)
	{
	int [] a={15,62,84,32,69,18,62,95,74,84,30};
	int i,j,temp;
	for(i=0;i<a.length;i++)
	{
		temp=a[i];
		j=i;
		while(j>0 && a[j-1]>temp)
		{
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
	}
	for(i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}
	}
}



/*
D:\java program>java InsertionSort
 15 18 30 32 62 62 69 74 84 84 95
*/