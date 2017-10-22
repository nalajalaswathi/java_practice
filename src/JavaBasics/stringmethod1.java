package JavaBasics;

import java.util.Scanner;

public class stringmethod1 
{

	public static void main(String[] args) 
	{
		//contentEquals():-To compare to strings--->assigning strings at run time
	      	       Scanner sc = new Scanner(System.in);
	               System.out.println("enter first string");
	               String str5 = sc.next();
	               //Scanner sc1 = new Scanner(System.in);
	               System.out.println("enter second string");
	               String str6 = sc.next();
	               if(str5.contentEquals(str6))   
	               {
	                 System.out.println("Both are equal");
	               }
	               else
	               {
		             System.out.println("Both are not equal");
	               }
	}

}
