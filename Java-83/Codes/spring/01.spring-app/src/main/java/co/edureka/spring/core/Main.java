package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		//-- initialize spring container
		//BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("No of beans configured = " + context.getBeanDefinitionCount());
		
		String[] beanNames = context.getBeanDefinitionNames();
		for(String name : beanNames) {
			System.out.println("----> " + name);
		}
		System.out.println("------------------------------------------------------");
		
		User usr1 = (User)context.getBean("user1");
		//usr1.setFirstName("******");
		System.out.println(usr1);
		System.out.println("------------------------------------------------------");
		
		User usr2 = (User)context.getBean("user1");
		System.out.println(usr2);
		System.out.println("------------------------------------------------------");
		
		User usr3 = (User)context.getBean("user1");
		System.out.println(usr3);
		System.out.println("------------------------------------------------------");		
		
		User usr4 = context.getBean("user2", User.class);
		System.out.println(usr4);
	}
}
