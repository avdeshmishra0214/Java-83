package co.edureka.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Float> bank = new HashMap<String, Float>();
	
		System.out.println(bank.put("Anil", 25000f)); //null
		System.out.println(bank.put("Anil", 11500.50f)); //2500.0
		System.out.println(bank.put("Sanjay", 35000f)); //null
		bank.put("Pankaj", 10250.5f);
		bank.put("Sachin", 45275.5f);
		bank.put("Chris", 35000f);
		
		System.out.println("No of A/C Holders = " + bank.size());
		System.out.println(bank);
		System.out.println("---------------------------------------------------");
		
		System.out.print("enter a/c holder name: ");
		String name = new Scanner(System.in).next();
		
		//float bal = bank.get("Anil");
		float bal = bank.get(name);
		System.out.println("A/C Balance of \""+name+"\" = " + bal);
		bal = bal + 1150.25f;
		bank.put(name, bal);		
		System.out.println(bank);
		System.out.println("---------------------------------------------------");
		
		System.out.print("A/C Holders  ---->   ");
		Set<String> names = bank.keySet();
		for(String key : names) {
			System.out.print(key + " || ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String key = entry.getKey();
			Float val = entry.getValue();
			//System.out.println(key + " ---> " + val);
			//String formattedOutput = String.format("%10s ----> %.2f", key, val);
			String formattedOutput = String.format("%-10s ----> %.2f", key, val);
			System.out.println(formattedOutput);
			
			Thread.sleep(2000);
		}
	}
}
