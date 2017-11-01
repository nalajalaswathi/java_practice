package CollectionFramework1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class enumInVector1
{

	public static void main(String[] args)
	{
		Vector<Object> obj1 = new Vector<Object>();
		obj1.add(50);      
		obj1.add(9.8);    
		obj1.add(40);   
		obj1.add("test");  
		
		 Enumeration<Object> enu = obj1.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}

}
