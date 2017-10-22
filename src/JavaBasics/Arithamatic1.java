package JavaBasics;

public class Arithamatic1 {
	//Return Type Example
	private int add(int x,int y)
	{
		int z = x+ y;
		return z;
	}

	public static void main(String[] args)
	{
		Arithamatic1 obj = new Arithamatic1();
		int a = obj.add(10, 20);
		System.out.println("addition of two values is: "+ a);

	}

}
