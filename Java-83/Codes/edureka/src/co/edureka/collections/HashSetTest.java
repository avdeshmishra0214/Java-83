package co.edureka.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();

		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		System.out.println(names.add("Sunil")); //true
		names.add("Praveen");
		names.add("Sanju");
		names.add("Pankaj");
		names.add("Charles");
		names.add("Rahul");
		
		System.out.println("No of Participants = " + names.size());
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("---> " + name);
		}
		
		names.add(null);
		System.out.println(names);
	}

}
