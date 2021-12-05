package co.edureka.hibernate.configs;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class HibernateUtils {	
	
	public static Session getSession() {
		//-- read details from configuration file
		Configuration config = new Configuration();
		config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml"); //XML Parsing
		
		//--create a sessionfactory
		SessionFactory sfactory = config.buildSessionFactory();
		
		//--get a Session from sessionfactory
		Session session = sfactory.openSession();
		
		return session;
	}
}
