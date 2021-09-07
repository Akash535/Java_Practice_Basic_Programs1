//package com.poly;//method have same name but diff argument.
package Basic_Java_Programs;

class Shape{
	float res;
	void area(float r){//---func/method prototype or singature.
		res=3.14f*r*r;
		System.out.println("area of circle="+res);
	}
	void area(float h,float b){
		res=(0.5f)*b*h;
		System.out.println("area of triangle="+res);
	}
	void area(int s){
		res=s*s;
		System.out.println("area of square="+res);
	}
}

public class Overloading{ 
	public static void main(String arg[] ){
		Shape s=new Shape();
		s.area(3);// 3rd definition well get invoked
		s.area(4f);//------float --4.0
		s.area(2.3f,4f);
	}
}