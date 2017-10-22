package OOPS;

public class ContinueEx {

	public static void main(String[] args) {
		
		//display odd numbers using continue statement
		for(int i=1;i<=50;i++) 
		{
			if(i % 2 ==0)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}

}
