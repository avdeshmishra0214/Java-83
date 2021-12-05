package co.edureka.hibernate;

import org.hibernate.Session;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		session.beginTransaction();
		
		Student st = session.get(Student.class, 109);
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else
			System.out.println("**** No Matching Student found!!! ****");
		
		session.getTransaction().commit();
		
		session.close();		
	}
}
