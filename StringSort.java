package Basic_Java_Programs;

class StringSort
{
	static public void main(String []argu)
	{
	String[] a={"deepak","amit","rahul","sachin","chetan","akash"};
	int i,j;
	String temp;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length-1-i;j++)
		{
			if(a[j].compareTo(a[j+1])>0)
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}
	}
}