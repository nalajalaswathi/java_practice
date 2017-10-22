package JavaBasics;

import java.util.Scanner;

public class FibanocciSeries 
{
	public static void main(String[] args)
	{
		//fibanocci sereis
		
	    int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		n = sc.nextInt();
		int first = 0;
		int second = 1;
		//System.out.println(first + " " + second);//printing 0 and 1 in the console
		int next = 0;
		for(int i=1; i<n; i++)
		{
		  next = first + second;
		  System.out.println(next);
		  first = second;
		  second = next;		 
		}
		
		
		//-------------------------------------------------------------------------
		
		//prime number
		/*
		    int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			n = sc.nextInt();
			int count = 0;
			for(int i=1; i<=n/2; i++)
			{
				if(n % i == 0)
				{
					count = count + 1;
				}
			
			}
			if(count==1)
			{
				System.out.println("numnber is prime number");
			}
			else
			{
				System.out.println("numnber is not a prime number");
			}
			*/
		
		//----------------------------------------------------------------------------
		
		//factorial program
		 /*
		    int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			n = sc.nextInt();
			int fact = 1;
			for(int i=1; i<=n; i++)
			{
				fact = fact *  i;
			}
			System.out.println("factorial of a given number is " + fact);
			*/
	}
}
