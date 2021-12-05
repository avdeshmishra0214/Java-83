package co.edureka.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Batch;
import co.edureka.hibernate.entity.Faculty;

public class RelationshipsTest {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Faculty faculty = new Faculty(101, "Sunil Joseph");
		
		Batch batch1 = new Batch(1, "Java 30th Oct 2021", faculty);
		Batch batch2 = new Batch(2, "Java 18th Dec 2021", faculty);
		Batch batch3 = new Batch(3, "Spring 15th Nov 2021", faculty);
		Batch batch4 = new Batch(4, "Java 29th Jan 2022", faculty);
		
		Set<Batch> batches = new HashSet<>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		batches.add(batch4);
		
		faculty.setBatches(batches);
		
		session.save(faculty);
		
		tx.commit();
		session.close();
	}
}
