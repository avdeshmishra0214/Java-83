package co.edureka.except;
class Logic{
	public void myMethod() throws InterruptedException{
		
	}
}

public class ThrowsTest {
 public static void main(String[] args) throws Exception{
	 Logic log = new Logic();
		try {
			log.myMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 
	 log.myMethod();
 }
}
