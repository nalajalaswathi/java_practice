package CollectionFramework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ItaratorsInJava {

	public static void main(String[] args)
	{
		List<Object> arraylist = new ArrayList<Object>();
		arraylist.add(50);      
		arraylist.add(9.8);    
		arraylist.add(40);   
		arraylist.add("test");  
		
		Iterator<Object> itr = arraylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(arraylist);
			
		System.out.println("-----------------------------------");
		
		List<Object> linkedlist1 = new LinkedList<Object>();
		linkedlist1.add(50);      //integer type
		linkedlist1.add(true);
		linkedlist1.add("test");
		
		ListIterator<Object> itr1 = linkedlist1.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("************************");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		
	}

}
