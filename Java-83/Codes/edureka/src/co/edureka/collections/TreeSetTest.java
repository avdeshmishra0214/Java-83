package co.edureka.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();

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
		
		names.add(null); //java.lang.NullPointerException
	}

}
