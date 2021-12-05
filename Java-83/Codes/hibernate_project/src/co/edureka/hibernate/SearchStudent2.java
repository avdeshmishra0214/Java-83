package co.edureka.hibernate;

import org.hibernate.Session;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class SearchStudent2 {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		/*
		Student st = new Student();		
		System.out.println(st);		
		st = session.get(Student.class, 101);
		*/
		
		Student st = session.get(Student.class, 1026);
		if(st != null)
			System.out.println(st);
		else
			System.out.println("**** No Matching Student found!!! ****");
		
		session.close();
	}

}
