package co.edureka;
import static java.lang.Math.*;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(E);
		System.out.println(PI);
		
		System.out.println(sin(0));
		System.out.println(cos(0));
		
		System.out.println(sqrt(25));
		System.out.println(pow(5,3));
		
		System.out.println(min(10, 20));
		System.out.println(max(10, 20));
		
		System.out.println(floor(10.6)); //10.0
		System.out.println(ceil(10.6)); //11.0
		
		double val = random(); // a double value between 0 - 1
		System.out.println(val);
		
		int otp = (int)(val * 10000);
		if(otp<100)
			otp *= 100;
		else if(otp<1000)
			otp *= 10;
		
		System.out.println("OTP ---> " + otp);
		
		System.out.println(round(10.44657));
	}

}
