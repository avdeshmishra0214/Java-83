
public class StringMethods {
	public static void main(String[] args) {
		String str = "edureka limited";
		System.out.println("Size of String = " + str.length());
		
		System.out.println("charAt(0) ---> " + str.charAt(0));
		//System.out.println("charAt(20) ---> " + str.charAt(20)); // java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf(e) ---> " + str.indexOf("e")); //0
		System.out.println("indexOf(e,2) ---> "+ str.indexOf("e", 2)); //4
		System.out.println("lastIndexOf(e) ---> " + str.lastIndexOf("e")); //13
		System.out.println("indexOf(java) ---> " + str.indexOf("Java")); //-1
		System.out.println(str.indexOf("limited")); //8
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str.replace('e', '*'));
		System.out.println(str);
	}
}
