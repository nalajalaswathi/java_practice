package JavaBasics;

import java.util.Scanner;

public class ArrayExample
{
	public static void main(String[] args) 
	{
		//assigning values to the array
		/*int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		System.out.println(a[0]);
		System.out.println(a[1]);  */
		
		//assigning array values at runtime
	/*	int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values for array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("display array values");
		//first for loop
		 for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]); 
		} 
	*/
		  /*
		//2nd for loop
		for(int val: a)
		{
			System.out.println(val);
		}
		*/
		 
		 
		 //Read values from the sting array
		 String[] cities = {"Hyd","Chennai","Delhi","Pune"};
		 //first for loop
	/*	 for(int i=0;i<cities.length;i++)
		 {
			 System.out.println(cities[i]);
		 }
    */
		 //second for loop
		 for(String city:cities)
		 {
			 System.out.println(city);
		 }
		 
	} 

}
