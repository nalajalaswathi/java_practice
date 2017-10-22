package JavaBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		int num;
		int fact = 1;
		System.out.println("enter number to calcute its factorial");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of a number is:- " + fact);
	}

}
