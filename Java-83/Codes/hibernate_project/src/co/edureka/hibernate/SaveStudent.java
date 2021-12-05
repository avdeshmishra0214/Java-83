package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setStudId(101);
		st.setStudName("Sunil Joseph");
		st.setEmail("sunil@hotmail.com");
		st.setMobile("9848586878");
		
		session.save(st);
		
		System.out.println("----------------------------------------------------------");
		
		tx.commit();
		
		session.close();
	}
}
