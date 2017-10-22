package JavaBasics;

public class Arithematic
{
	//Encapsulation Example:-hiding the data
	private int z;
	private void add(int x,int y)  //Method Definition
	{
		z = x + y;
		System.out.println("addition of two values is: "+ z);
	}
	private void sub(int x,int y)    //Method Definition
	{
		z = x - y;
		System.out.println("subtraction of two values is: "+ z);
	}

	public static void main(String[] args) 
	{
		Arithematic obj = new Arithematic(); //Method Calling
		obj.add(10, 20);
		obj.sub(50, 30);
  
	}

}
