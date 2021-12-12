package co.edureka;

import com.w3schools.www.xml.TempConvertLocator;
import com.w3schools.www.xml.TempConvertSoap;

public class Main {

	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator();
		TempConvertSoap ref = locator.getTempConvertSoap();
		
		String cel = "102";
		String fah = ref.celsiusToFahrenheit(cel);
		
		System.out.println(cel+"C = " + fah + "F");
	}
}