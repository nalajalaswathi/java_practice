package JavaBasics;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) 
	{
		int a;
		System.out.println("enter value for a:-");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int b;
		System.out.println("enter value for b:-");
		b = sc.nextInt();
		int c = a + b;
		System.out.println("addition of a and b is:- " + c);
	}

}
