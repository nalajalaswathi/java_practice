package CollectionFramework1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMapInJava {

	public static void main(String[] args) 
	{
		Map<Integer,String> linkhasmap1 = new LinkedHashMap<Integer,String>();
		linkhasmap1.put(1, "test1");
		linkhasmap1.put(2, "test2");
		linkhasmap1.put(3, "test3");
		linkhasmap1.put(4, "test4");
		linkhasmap1.put(null, "test4");
		//System.out.println(linkhasmap1);
		Set<Integer> keyset = linkhasmap1.keySet();
		Iterator<Integer> itr = keyset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
