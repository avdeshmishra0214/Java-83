package co.edureka.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> marks = Arrays.asList(96,93,87,86,75,90);
		
		iterate1(marks);
		Thread.sleep(2000);
		
		iterate2(marks);
		Thread.sleep(2000);
		
		iterate3(marks);
		Thread.sleep(2000);
		
		iterate4(marks);
		Thread.sleep(2000);
		
		iterate5(marks);
	}

	private static void iterate1(List<Integer> marks) {
		System.out.println("<<< iteration using for loop with get() - only for java.util.List");
		for(int i=0; i<marks.size(); i++) {
			Integer mark = marks.get(i);
			System.out.print(mark + "   ");
		}
		System.out.println("\n");
	}
	
	private static void iterate2(List<Integer> marks) {
		System.out.println("<<< iteration using enhanced for loop");
		for(Integer mark : marks) {
			System.out.print(mark + "   ");
		}
		System.out.println("\n");
	}
	
	private static void iterate3(List<Integer> marks) {
		System.out.println("<<< iteration using java.util.Iterator");
		
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "   ");
		}
		System.out.println("\n");
	}
	
	private static void iterate4(List<Integer> marks) {
		System.out.println("<<< iteration using java.util.ListIterator - only for java.util.List");
		ListIterator<Integer> it = marks.listIterator();
		
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "   ");
		}	
		System.out.println();
		
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n + "   ");
		}			
		System.out.println("\n");
	}
	
	private static void iterate5(List<Integer> marks) {
		System.out.println("<<< iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+ "   ");
		}
		System.out.println("\n");
	}
}
