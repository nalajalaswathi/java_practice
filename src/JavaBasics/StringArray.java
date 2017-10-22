package JavaBasics;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) 
	{
		String[] cities = {"hyd","pune","delhi","mumbai","banglore"};
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
		
		//getting the input from the user at run time
		String[] cities1 = new String[5];
		System.out.println("enter cities names");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<cities1.length;i++)
		{
			cities1[i] = sc.nextLine();
		}
		for(int i=0;i<cities1.length;i++)
		{
			System.out.println(cities1[i]);
		}
		
	

	}

}
