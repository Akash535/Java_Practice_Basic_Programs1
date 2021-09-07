package Simple_Java_Programs;

/*class Leap{
	static public void main(String [] argu){
		int a=2016;
		if(a%4==0){
			if(a%100==0){
				if(a%400==0){
				System.out.println("it is leap year");	
				}
				else
				System.out.println("not leap year");
			}
			else
				System.out.println("it is leap year ");
		}
		else
			System.out.println("not leap year");
	}
}*/

class Leap
{
	public static void main(String []argu)
	{
		int year=2020;
		if((year%400==0 )|| (year%4==0 && year%100!=0))
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}
	}
}