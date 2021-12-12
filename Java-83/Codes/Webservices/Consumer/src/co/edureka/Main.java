package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class Main {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums ref = locator.getNums();
		
		int fno = 12;
		int sno = 23;
		int sum = ref.addNum(fno, sno);
		System.out.println(fno + " + " + sno + " = " + sum);
		
		System.out.println("Difference = " + ref.subNum(10.5f, 12.7f));
	}
}