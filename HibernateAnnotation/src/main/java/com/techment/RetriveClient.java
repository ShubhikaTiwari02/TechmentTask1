package com.techment;

import javax.security.auth.callback.ConfirmationCallback;
import javax.security.auth.login.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RetriveClient {

	public static void main(String[] args) {

	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	Transaction tx= session.beginTransaction();
	Student student= (Student)session.load(Student.class,new Integer(4));
	
	System.out.print("id"+student.getStudentId()+"Name"+student.getName());
	tx.commit();
}
	
}