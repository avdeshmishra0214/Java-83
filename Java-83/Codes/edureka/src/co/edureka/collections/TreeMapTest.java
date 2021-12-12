package co.edureka.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>();
		
		System.out.println(bank.put("Anil", 25000f)); //null
		System.out.println(bank.put("Anil", 11500.50f)); //2500.0
		System.out.println(bank.put("Sanjay", 35000f)); //null
		bank.put("Pankaj", 10250.5f);
		bank.put("Sachin", 45275.5f);
		bank.put("Chris", 35000f);
		
		System.out.println("No of A/C Holders = " + bank.size());
		System.out.println(bank);
	}
}
