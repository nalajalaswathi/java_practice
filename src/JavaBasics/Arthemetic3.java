package JavaBasics;

public class Arthemetic3 {

	public static void main(String[] args)
	{
		//exception Handling Example
	   try
	   {
		   int a = 15;
		   int b = 0;
		   double c = a/b;
		   System.out.println("division is "+ c);
	   }
	   catch(Exception e)
	   {
		   System.out.println("can not divided by zero");
	   }
	   finally
	   {
		   System.out.println("finally executed");
	   }

	}

}
