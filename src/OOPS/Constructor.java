package OOPS;

public class Constructor {
	Constructor(int k)
	{
		System.out.println("this is constructor and its value is:-" + k);
	}
	void add(int x,int y)
	{
		int z = x + y;
		System.out.println("additition of 2 values IS:- " + z);
	}
	void sub(int x,int y)
	{
		int z = x - y;
		System.out.println("subtraction of 2 values IS:- " + z);
	}
	

	public static void main(String[] args)
	{
		Constructor obj = new Constructor(100);
		obj.add(10,20);
		obj.sub(30, 10);

	}

}
