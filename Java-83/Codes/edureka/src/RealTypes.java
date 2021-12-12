
public class RealTypes {

	public static void main(String[] args) {
		//float sal = 2500.50; //Type mismatch: cannot convert from double to float
		//float sal = (float)2500.50;
		//float sal = 2500.50f;
		float sal = 2500.50F;
		System.out.println("My Salary = " + sal);
		
		double data = 2500.515487452;
		System.out.println(data);
		
		System.out.println(10/3); //3
		System.out.println((10.0/3)); //3.3333333333333335
		System.out.println(10.0f/3); //3.3333333
		
		float rate = (float)7500.856741;
		System.out.println(rate);
		System.out.printf("%.2f", rate);
	}
}
