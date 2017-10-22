package JavaBasics;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		//with out using third variable
		x=x+y;
		y=x-y;
		x=x-y;	
		//using 3rd variable temp
		//int temp;
		//temp = x;
		//x = y;
		//y = temp;
		System.out.println("x value is:" + x);
		System.out.println("y value is:" + y);

	}

}
