package Basic_Java_Programs;

class Array1
{
	static public void main(String []argu)
	{
	int [][][] a={{{1,2,3,5,4,6,7},{10,20}},{{50,60,70,80},{8,9,21,34,65,78}}};
	int i,j,k;
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
			for(k=0;k<a[i][j].length;k++){
			System.out.print(a[i][j][k]+" ");
		}
		System.out.println();	
		}
	}


	System.out.println();	
	int [] b={10,22,33};
	for(int m:b){
		System.out.print(m+" ");
	}


	System.out.println();
	int [] c={10,22,33,43,65,41};
	int n=0;
	while(n<c.length)
	{
		System.out.print(c[n]+" ");
		n++;
	}


	System.out.println();
	int [] d={10,22,33,43,65,41};
	int o=0;
	do
	{
		System.out.print(d[o]+" ");
		o++;
	}while(o<d.length);
	}
}


/*
D:\java program>java Array1
1 2 3 5 4 6 7
10 20
50 60 70 80
8 9 21 34 65 78

10 22 33
10 22 33 43 65 41
10 22 33 43 65 41
*/