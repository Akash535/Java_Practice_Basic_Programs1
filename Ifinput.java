package Simple_Java_Programs;

import java.util.Scanner;
 class Ifinput{
	static public void main(String [] argu){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the salary:");
		int sal=obj.nextInt();
		if(sal>=1000){
			int b=(sal*10)/100;
			sal=sal+b;
			System.out.println("the salary:"+sal);
		}		
	}
}

