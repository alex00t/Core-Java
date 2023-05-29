package com.java.Collection.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Student {
	
	public static void main (String[]args)
	{
		HashMap<Integer, String> name = new HashMap<>();
		name.put(1, "Tipu");
		name.put(2, "ibrahim");
		
Iterator<Integer>it=name.keySet().iterator();
System.out.println("its element");
while (it.hasNext()) {
int key=it.next();
System.out.println("key :"+key);
System.out.println("value :"+name.get(key));
}
	}		
		
	}
	
