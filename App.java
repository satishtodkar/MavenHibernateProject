package com.codemind.MavenHibernateProject;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class App 
{
    public static void main( String[] args )
    {
    	Users user = new Users();
    	
    	user.setUserName("Satish");
    	user.setPassword("@satish");
    	user.setCreateDate(new Date());
    	user.setCreateUser("Jai");
    	
    	Transaction tx = null;
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	try {
    		tx = session.beginTransaction();
    		
    		session.save(user);
    		
    		tx.commit();
        System.out.println( "Saved Successfully." );
    }catch (HibernateException e) {
    	if(tx!=null) {
    		tx.rollback();
    	}
    	e.printStackTrace();
    }finally {
    	session.close();
    }
}

}
