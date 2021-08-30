package com.techment;

		import org.hibernate.*;
		import org.hibernate.cfg.*;
		import java.util.*;
		public class SelectUsingWhere {
		public static void main(String[] args) {

			

				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml"); 

				SessionFactory factory = cfg.buildSessionFactory();
				Session session = factory.openSession();

				Query qry = session.createQuery("select s from Student s where s.dept=?");

			qry.setParameter("x"," hr");
            List<Student>list = qry.getResultList();
          list.forEach(s->System.out.println(s.getStudentId()+"" +s.getName()+""+s.getDept()));
		
		System.out.println("---------------------------");
		// selecting single object end____________

				session.close();
				factory.close();
			}

	}


