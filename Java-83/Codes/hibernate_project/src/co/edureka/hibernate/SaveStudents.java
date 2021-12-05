package co.edureka.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class SaveStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Session session = HibernateUtils.getSession();

		Transaction tx = session.beginTransaction();

		String req = "Y";
		while (req.equalsIgnoreCase("Y")) {
			Student st = generateStudent();
			session.save(st);
			
			System.out.print("do you want to save more students[Y/N]: ");
			req = sc.next();
		}
		System.out.println("----------------------------------------------------------");

		tx.commit();
		
		sc.close();
		session.close();
	}

	private static Student generateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("enter student email: ");
		String email = sc.nextLine();
		
		System.out.print("enter student mobile: ");
		String mobile = sc.nextLine();
		
		Student stud = new Student(name, email, mobile);
		return stud;
	}

}
