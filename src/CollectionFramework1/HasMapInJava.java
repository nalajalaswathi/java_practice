package CollectionFramework1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMapInJava {

	

	public static void main(String[] args) 
	{
		Map<Integer,String> hasmap1 = new HashMap<Integer,String>();
		hasmap1.put(1, "test1");
		hasmap1.put(2, "test2");
		hasmap1.put(1, "test3");
		hasmap1.put(2, "test4");
		hasmap1.put(null, "test4");
		System.out.println(hasmap1);
		
		//System.out.println(hasmap1.get(1));
		/*
		Set<Integer> keyset = hasmap1.keySet();
		Iterator<Integer> itr = keyset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		Set<Entry<Integer, String>> entry = hasmap1.entrySet();
		Iterator<Entry<Integer, String>> itr = entry.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getKey());
		}
		
	}

}
