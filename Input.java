package Simple_Java_Programs;

import java.util.Scanner;

class Input{
	static public void main(String [] argu){
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=s.next();
		System.out.println("enter your age:");
		int age=s.nextInt();
		System.out.println("enter your gender:");
		char gender=s.next().charAt(0);
		System.out.println("enter your mobile no:");
		long mobile=s.nextLong();
	}
}