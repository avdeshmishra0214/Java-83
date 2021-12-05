package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Car;
import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-car-beans.xml");
		
		User usr1 = (User)context.getBean("usr");
		System.out.println(usr1.getUserName()+" owns an "+ usr1.getCar().getModel()+" car, which costs Rs."
												+ usr1.getCar().getCost());
		System.out.println("--------------------------------------------------------------");

	}
}
