package JavaBasics;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args)
	{
		  //int a;
	      //float b;
	      //String s;
	 
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string");
	      String s = sc.nextLine();
	      System.out.println("You entered string " + s);
	 
	      System.out.println("Enter an integer");
	      int a = sc.nextInt();
	      System.out.println("You entered integer  " + a);
	 
	      System.out.println("Enter a float");
	      float b = sc.nextFloat();
	      System.out.println("You entered float  " + b);

	}

}
