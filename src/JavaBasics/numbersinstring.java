package JavaBasics;

public class numbersinstring {

	public static void main(String[] args) 
	{
		String str=" abc d 1234567890pqr 54897";        

		for(int i=0; i<str.length(); i++)
		{
		    if( str.charAt(i) > 47 && str.charAt(i) < 58)
		        System.out.print(str.charAt(i));
		}

	}

}
