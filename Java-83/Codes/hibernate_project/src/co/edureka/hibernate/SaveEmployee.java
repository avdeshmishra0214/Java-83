package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		//emp.setEmpNo(101);
		emp.setEmpName("Sunil Joseph");
		emp.setEmpSal(25000.50f);
		
		session.save(emp);
		
		System.out.println("----------------------------------------------------------");
		
		tx.commit();
		
		session.close();
	}

}
