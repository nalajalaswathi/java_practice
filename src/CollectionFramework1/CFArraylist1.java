package CollectionFramework1;

import java.util.ArrayList;
import java.util.List;

public class CFArraylist1 {

	public static void main(String[] args) 
	{
		List arraylist = new ArrayList<Object>();
		//ArrayList<Object> arraylist = new ArrayList<Object>();
		arraylist.add(5);      //integer type
		arraylist.add(9.8);    //float type
		arraylist.add(true);   //boolean type
		arraylist.add("test");  //string type
		System.out.println(arraylist);

	}

}
