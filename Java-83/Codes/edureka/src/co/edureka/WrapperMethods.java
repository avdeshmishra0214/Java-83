package co.edureka;

public class WrapperMethods {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(26);
		
		byte b = i.byteValue();
		short s = i.shortValue();
		int n = i.intValue();
		long l = i.longValue();
		
		float f = i.floatValue();
		double d = i.doubleValue();
		
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		System.out.println(f + " | " + d);
		
		/*------- parsing methods -----*/
		String str = "25";
		b = Byte.parseByte(str);
		s = Short.parseShort(str);
		n = Integer.parseInt(str);
		l = Long.parseLong(str);
		
		f = Float.parseFloat(str);
		d = Double.parseDouble(str);
		
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		System.out.println(f + " | " + d);
		
		/*---- boxing & un-boxing ----*/
		int n1 = 27;
		Integer n2 = n1; // boxing
		int n3 = n2; //un-boxing
		System.out.println(n1 + " | " + n2 + " | " + n3);
	}

}
