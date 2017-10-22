package JavaBasics;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value between 1-7");
		int d = sc.nextInt();
		if(d == 1)
		{
			System.out.println("sunday");
		}
		else if(d == 2)
		{
			System.out.println("monday");	
		}
		else if(d == 3)
		{
			System.out.println("tuesday");	
		}
		else if(d == 4)
		{
			System.out.println("wednesday");	
		}
		else if(d == 5)
		{
			System.out.println("thusday");	
		}
		else if(d == 6)
		{
			System.out.println("friday");	
		}
		else if(d == 7)
		{
			System.out.println("saturday");	
		}
		else 
		{
			System.out.println("please enter value between 1-7 only");	
		}

	}

}
