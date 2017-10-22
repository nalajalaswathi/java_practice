package JavaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int counter=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n % i == 0)
			{
				counter = counter + 1;
			}
		}
		if(counter == 1)
		{
			System.out.println(n + "is a prime number");
		}
		else
		{
			System.out.println(n + " is not a prime number");
		}
	}

}
