
public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 97;
		marks[1] = 82;
		
		System.out.println("Size of Array = " + marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"   ");
		}
		System.out.println();
		
		boolean[] status = new boolean[7];
		for(boolean stat : status) {
			System.out.print(stat+"   ");
		}
		System.out.println();
		
		String names[] = new String[10];
		for(String name : names) {
			System.out.print(name+"   ");
		}
	}

}
