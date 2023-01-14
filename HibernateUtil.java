package com.codemind.MavenHibernateProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		 SessionFactory sessionFactory = null;
		 try {
			 return new Configuration().configure().buildSessionFactory();
		 }
		 catch(Exception e) {
			 e.getStackTrace();
		 }
		 return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}
	
}
