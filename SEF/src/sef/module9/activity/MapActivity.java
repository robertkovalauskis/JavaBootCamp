package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map map = new HashMap();
			map.put("id1", "John");
			map.put("id2", "Michael");
			map.put("id3", "Peter");
			map.put("id4", "Sam");
		
			
			//2 - Call print method to print the map passed as its parameter.
		print(map);
		}
		
		static void print(Map map)
		{
			//3 - Type code to print this map
			Set keySet = map.keySet();
			
			//You can use an iterator to access keys
			System.out.println("Key\tValue");
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}
		}
	}
