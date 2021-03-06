
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println(s1 == s2); //true
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4); //false
		
		System.out.println("equals ---> " + (s3.equals(s4)));
		System.out.println("contentEquals ---> " + s3.contentEquals(s4));
		System.out.println("equalsIgnoreCase ---> " + s3.equalsIgnoreCase(s4));
		
		/*
		s1.concat(" bangalore");
		System.out.println(s1);
		*/
		s1 = s1.concat(" bangalore");
		System.out.println(s1);
	}
}
