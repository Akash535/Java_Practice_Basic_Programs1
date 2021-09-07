
package Simple_Java_Programs;

class Prime1to100
{
	public static void main(String []argu)
	{	
		int i,j;
		for(i=1;i<=100;i++)
		{
			int temp=0;
			for(j=2;j<i-1;j++)
			{
				if(i%j==0)
					temp=temp+1;
			}
			if(temp==0)
				System.out.printf(i+" ,");			
		}
	}
} 

/*
D:\java program>java Prime1to100
 ,1 ,2 ,3 ,5 ,7 ,11 ,13 ,17 ,19 ,23 ,29 ,31 ,37 ,41 ,43 ,47 ,53 ,59 ,61 ,67 ,71 ,73 ,79 ,83 ,89 ,97
*/