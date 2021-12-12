package co.edureka.spring;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital hosp = (Hospital) context.getBean("apollo");
		
		System.out.println("Hospital Name -> " + hosp.getHospitalName());
		
		System.out.println("Hospital Department Names with Heads-> ");
		Map<String, String> depts = hosp.getDeptWithHod();
		System.out.println(depts);
	}

}
