package CollectionFramework1;

import java.util.ArrayList;
import java.util.List;

public class CFarraylisit2 {

	public static void main(String[] args)
	{
		List<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(5);       //integer type only
		arraylist.add(9);      //integer type
		arraylist.add(4);     //integer type
		arraylist.add(50);    //integer type
		
		System.out.println(arraylist);
		
		List<Integer> arraylist1 = new ArrayList<Integer>();
		arraylist1.add(50);       //integer type only
		arraylist1.add(90);      //integer type
		arraylist1.add(40);     //integer type
		arraylist1.add(50);    //integer type
		
		System.out.println(arraylist1);
		
		//System.out.println(arraylist.addAll(arraylist1));
		//System.out.println(arraylist);
		
		//arraylist.add(2,50);
		//System.out.println(arraylist);
		
		arraylist.removeAll(arraylist1);
		System.out.println(arraylist);
		
		//arraylist.remove(2);
		//System.out.println(arraylist);
		
	}

}
