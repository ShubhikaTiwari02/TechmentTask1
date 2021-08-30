package com.techment;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLSelect {

	public static void main(String[] args) {
		

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<Student> query = session.createQuery("select s from Student");
		List<Student> studentList = query.list();
		System.out.println(studentList);
		
		
		System.out.println("==============");
		studentList.forEach(System.out::println);
		
		
		System.out.println("===================");
		studentList.forEach(s->System.out.println(s.getStudentId() +" " + s.getName() +" " + s.getDept()));
		
		System.out.println("select only specific column");
		
//	Query<Student> query2=session.createQuery("select s.studentId,s.name from Student s");
//List<Student> students = query2.list();
		
//		for(Object s :students)
//		{
//			System.out.println(s.getStudentId() +" "+ s.getName());
//		}
		
		//students.forEach(s->System.out::println(s.getStudentId() +" " + s.getName());
		//System.out.println(students.toString());
		
		
		//
		System.out.println("only specific");
        Query query2= session.createQuery("select s.studentId,s.name from Student s");

		List<Student> l2 = query2.list();
		Iterator it = l2.iterator();

		while(it.hasNext())
		{
			Object o[] = (Object[])it.next();
            System.out.println(o[0]+ " "+o[1]);
            System.out.println("  ");

            System.out.println("----------------");
		}	
		
		
		
		
		
		
		
		session.close();
		sessionFactory.close();
		
		
	}

}
		