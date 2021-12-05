package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		Transaction tx = session.beginTransaction();
		
		/*
		//--- approach-1
		Student st = new Student(101,"Sunil Joseph", "sunil@edureka.co","1234567890");
		session.update(st);
		*/
		
		//--- approach-2
		Student st = session.get(Student.class, 105);
		if(st != null) {
			System.out.println(st);
			st.setEmail("sagar@gmail.com"); //dirty object
		}
		else
			System.out.println("**** No Matching Student found!!! ****");
		
		tx.commit();		
		session.close();
	}

}
