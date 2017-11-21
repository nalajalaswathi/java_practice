import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReversNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		int reverse = 0;
		int remainder = 0;
		while(number!=0)
		{
			remainder = number % 10;
			reverse = reverse*10 + remainder;
			number = number/10;
		}
		System.out.println("Reversed number is:-"+reverse);
	}

}
