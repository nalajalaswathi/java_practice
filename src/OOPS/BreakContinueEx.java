package OOPS;

import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String[] args)
	{
		int fact = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("enter number");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		System.out.println("enter 'Y' to continue and 'N' to exit");
		String userIP = sc.next();
		if(userIP.equalsIgnoreCase("y"))
		{
			continue;
		}
		else
		{
			break;
		}
		}
		System.out.println("execution completed...");
	}

}
