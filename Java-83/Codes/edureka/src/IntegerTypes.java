
public class IntegerTypes {

	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		//byte b = 127;
		byte b = (byte)129; //typecasting  129-256
		System.out.println(b);
		
		
		//long pop = 2147483647;
		long pop = 2147483648L;
		System.out.println("World Population = " + pop);
		
		int n = (int)12L;
		System.out.println(n);
	}

}
