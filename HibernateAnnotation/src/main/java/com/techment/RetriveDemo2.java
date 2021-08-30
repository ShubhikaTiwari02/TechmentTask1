package com.techment;

import java.util.List;

import javax.security.auth.login.Configuration;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// class cast exception 
public class RetriveDemo2 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<studentDTO> query = session.createQuery("select s.studentId , s.name from student");		
	     List <studentDTO> st =query.list();
		
//	     for(studentDTO s: st) {
//	
//			//Student st1 =(Student)st1;
//			//Object o[] = (Object[])it.next();
//            System.out.println(o[0]+ " "+o[1]);
//           System.out.println(s.getStudentId()+""+s.getName());
//			
//		}

	    System.out.println(((studentDTO) st).getStudentId()+""+st.get(1));

		session.close();
		sessionFactory.close();
	}

}
