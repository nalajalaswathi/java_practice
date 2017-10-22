package OOPS;

public class StaticEx 
{
	static void add(int x,int y)
	{
		int z = x + y;
		System.out.println("additition of 2 values IS:- " + z);
	}
	static void sub(int x,int y)
	{
		int z = x - y;
		System.out.println("subtraction of 2 values IS:- " + z);
	}

	public static void main(String[] args)
	{
		//StaticEx.add(10, 20);
		//StaticEx.sub(30, 20);
		add(10,20);
		sub(50,40);
	}

}
