package co.edureka.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("Is the list empty = " + names.isEmpty());
		System.out.println("No of Participants = " + names.size());
		System.out.println(names + " | Size = " + names.size());		
		
		names.add("Sunil");
		names.add("Praveen");
		names.add("Sunil");
		names.add("Pankaj");
		names.add("Charles");
		names.add("Chris");
		names.add("Mark");
		names.add("Sunil");
		names.add("Naveen");
		
		System.out.println(names + " | Size = " + names.size());
		
		names.add(1, "edureka");
		System.out.println(names + " | Size = " + names.size());
		
		names.set(1, "EDUREKA");
		System.out.println(names + " | Size = " + names.size());
		
		System.out.println("Is \"Sunil\" in participants List = " + names.contains("Sunil"));
		
		System.out.println("Person in index 1 = " + names.get(1));
		
		//System.out.println("Person in index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("Index of \"Sunil\" = " + names.indexOf("Sunil"));
		
		System.out.println("Last Index of \"Sunil\" = " + names.lastIndexOf("Sunil"));
		
		System.out.println("Index of \"sunil\" = " + names.indexOf("sunil"));
		
		System.out.println("remove \"Sunil\" = " + names.remove("Sunil")); //boolean
		
		System.out.println("Remove person in index 0 = " + names.remove(0)); //Object
		
		System.out.println(names + " | Size = " + names.size());
		
		List<String> subList = Arrays.asList("Sunil");
		names.removeAll(subList);
		
		System.out.println(names + " | Size = " + names.size());		
	}	
}
