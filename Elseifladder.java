package Simple_Java_Programs;

import java.util.Scanner;
class Elseifladder{
	public static void main(String []argu){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the marks:");
		int marks=obj.nextInt();
		if(100>marks && marks>80)
			System.out.println("1st class"); 
		else if(80>marks && marks>65)
			System.out.println("2nd class"); 
		else if(65>marks && marks>40)
			System.out.println("3rd class"); 
		else if(40>marks)
			System.out.println("fail"); 	
	}
}