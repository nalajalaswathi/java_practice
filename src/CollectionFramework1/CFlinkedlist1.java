package CollectionFramework1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CFlinkedlist1 {

	public static void main(String[] args)
	{
		List linkedlist = new LinkedList<>();
		linkedlist.add(50);      //integer type
		linkedlist.add(50);
		linkedlist.add(9.8);    //float type
		linkedlist.add(100);
		linkedlist.add(true);   //boolean type
		linkedlist.add(50);  
		System.out.println(linkedlist);
		System.out.println(linkedlist.size());
		
		List<Object> linkedlist1 = new LinkedList<Object>();
		linkedlist1.add(50);      //integer type
		linkedlist1.add(true);
		linkedlist1.add("test");
		//System.out.println(linkedlist1);
		System.out.println(linkedlist1.size());
		
		linkedlist1.clear();
		System.out.println(linkedlist1);
		System.out.println(linkedlist1.isEmpty());
		
		

	}

}
