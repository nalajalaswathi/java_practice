package JavaBasics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value between 1-7");
		int d = sc.nextInt();
		switch(d)
		{
		case 1:
		{
			System.out.println("Sunday");
			break;
		}
		case 2:
		{
			System.out.println("Monday");
			break;
		}
		case 3:
		{
			System.out.println("tuesday");
			break;
		}
		case 4:
		{
			System.out.println("Wednesday");
			break;
		}
		case 5:
		{
			System.out.println("Thurday");
			break;
		}
		case 6:
		{
			System.out.println("Friday");
			break;
		}
		case 7:
		{
			System.out.println("Saturday");
			break;
		}
		default:
		{
			System.out.println("Please enter value between 1-7 only");
			break;
		}
		}

	}

}
