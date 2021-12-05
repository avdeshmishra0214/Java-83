package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class HQLTest {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studName='Sachin'";
		String hql = "from co.edureka.hibernate.entity.Student where email like '%@gmail.com'";
		Query<Student> q = session.createQuery(hql, Student.class);
		*/
		
		/*
		//-- positional parameters
		String hql = "from co.edureka.hibernate.entity.Student where studId between ?0 and ?1";
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(0, 101);
		q.setParameter(1, 105);
		*/
		
		//-- named parameters
		String hql = "from co.edureka.hibernate.entity.Student where studId between :minsid and :maxsid";
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 103);
		q.setParameter("maxsid", 200);
		
		List<Student> students = q.getResultList();
		
		for(Student st : students) {
			System.out.println(st);
		}
		System.out.println("----------------------------------------------------------");
		
		//-- performing DML (updation) using HQL
		session.beginTransaction();
		
		hql = "update co.edureka.hibernate.entity.Student stud set stud.studName='Sachin Tendulkar', "
				+ "stud.email='sachin@bcci.com' where stud.studId=104 ";
		Query query = session.createQuery(hql);
		int rowsAffected =query.executeUpdate();
		System.out.println("Student Updated ---> " + rowsAffected);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
