package co.edureka.spring.core;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital apollo = (Hospital)context.getBean("apollo");
		System.out.println("Hospital Name: " + apollo.getHospitalName());
		
		System.out.println("Department Names::");
		Set<String> depts = apollo.getDeparmentNames();
		for(String dept : depts) {
			System.out.println("----> " + dept);
		}
		System.out.println("--------------------------------------------------------------");

	}
}
