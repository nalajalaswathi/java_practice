package JavaBasics;

public class WhileLoop1 {

	public static void main(String[] args) {
		int i = 1;
		
		//display even numbers from 1 to 10
		while(i<=10)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			i = i + 1;
		}
		
		//display odd numbers from 1 to 10
		/*while(i<=10)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
			i = i + 1;
		} */

	}

}
