package co.edureka.except;
class Calculator{
	void divNum(int i, int j) {
		if(j == 0) {
			//ArithmeticException aex = new ArithmeticException();
			//ArithmeticException aex = new ArithmeticException("-- cannot divide a number by 0 --");
			//throw aex;
			throw new ArithmeticException("-- cannot divide a number by 0 --");
		}
		int res = i/j;
		System.out.println("result = " + res);
	}	
}

public class ThrowTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.divNum(10,0);
		}catch(Exception ex) {
			System.out.println("message --> " + ex.getMessage());
			System.out.println(ex.toString());
		}
	}

}
