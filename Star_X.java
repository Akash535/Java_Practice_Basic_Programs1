package Basic_Java_Programs;

import java.util.Scanner;
class Star_X{
	public static void main(String[]argu){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no=");
		int no=s.nextInt(),i,j,k;
		for(i=0;i<no;i++){
			for(j=0;j<no;j++){
				if(i==j || i+j==no-1)
				System.out.print("*");
				else
				System.out.print(" ");
			}System.out.println();
		}
	}
}