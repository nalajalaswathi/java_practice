package JavaBasics;

import java.util.Scanner;

public class StingMetods
{

	public static void main(String[] args)
	{
        //get the length of the string
        String str = "Testing Masters";
        int n = str.length();
        System.out.println(n);

       //repace():- one string by another string
       String str1 = "Testing Masters Technologies";
       str1 = str1.replace("Testing", "QA");
       System.out.println(str1);


       //split():-splitting a main string into substrings
       String str2 = "Testing Masters Technologies";
       String[] arr = str2.split(" ");
       System.out.println(arr.length);
       for(int i=0;i<arr.length;i++)  //first for loop
       {
	      System.out.println(arr[i]);
       }
       /*second for loop
       for(string s:arr)
       {
          System.out.println(s);
       } */



        //contains():-To verify substring in main string
        String str3 = "Testing Masters Technologies";
        String str4 = "Masters";
        if(str3.contains(str4))
        {
	       System.out.print("Exists");
        }
        else
        {
	       System.out.print("Not Exists");
        }		 



        //contentEquals():-To compare to strings
        String str5 = "Sunny";
        String str6 = "Bunny";
        if(str5.contentEquals(str6))    //if(str5.equalsIgnoreCase(str6))
        {
	        System.out.println("Both are equal");
        }
        else
        {
	        System.out.println("Both are not equal");
        }





      //contentEquals():-To compare to strings--->assigning strings at run time
      /*	   Scanner sc = new Scanner(System.in);
               System.out.println("enter first string");
               String str5 = sc.next();
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
        */



        
              //tolowercase() , touppercase() :-converting a string into lowercase/uppercase
              String browser = "ie";
              browser = browser.toLowerCase();
              System.out.println(browser);
              browser = browser.toUpperCase();
              System.out.println(browser);



             //CharAt():-To read the character
             String str7 = "swapna.kumari85@gmail.com";
             int counter = 0;
             for(int i=0;i<str7.length();i++)
             {
	            char c = str7.charAt(i);
	            if(c == 'a' || c == 'A')
	            {
		             counter = counter+1;
	            }			
             }
             System.out.println("a is repeating " + counter + " times");
	}

}
