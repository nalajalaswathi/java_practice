package CollectionFramework1;

import java.util.LinkedList;
import java.util.List;

public class CFlinkedlist2 {

	public static void main(String[] args)
	{
		List<String> linkedlist = new LinkedList<String>();
		linkedlist.add("50");      //string type only
		linkedlist.add("50");
		linkedlist.add("9.8");    
		linkedlist.add("100");
		linkedlist.add("true");   
		linkedlist.add("50");  
		System.out.println(linkedlist);
		
		List<String> linkedlist1 = new LinkedList<String>();
		linkedlist1.add("5000");      //string type only
		linkedlist1.add("500");
		System.out.println(linkedlist1);
		
	    //linkedlist.addAll(linkedlist1);
	    //System.out.println(linkedlist);
	    
		//linkedlist.add(2,"1000");
		//System.out.println(linkedlist);

	}

}
