package CollectionFramework1;

import java.util.ArrayList;
import java.util.List;

public class CFarraylist3 {

	public static void main(String[] args) 
	{
		List<Object> arraylist = new ArrayList<Object>();
		arraylist.add(50);      
		arraylist.add(9.8);    
		arraylist.add(40);   
		arraylist.add("test");  
		System.out.println(arraylist);
		//System.out.println(arraylist.get(1));
		//System.out.println(arraylist.size());
		
		List<Integer> arraylist1 = new ArrayList<Integer>();
		arraylist1.add(50);       //integer type only
		arraylist1.add(90);      //integer type
		arraylist1.add(40);     //integer type
		arraylist1.add(50);    //integer type
		arraylist1.add(80);
		//System.out.println(arraylist1.size());
		
		//arraylist.retainAll(arraylist1);
		//System.out.println(arraylist);
		
		//System.out.println(arraylist.contains(40));
		
		System.out.println(arraylist.containsAll(arraylist1));

	}

}
