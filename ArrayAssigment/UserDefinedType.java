package com.techment.day7collection;

import java.util.ArrayList;


public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp = new Employee(1,"Pankaj","CEO");
Employee emp1 = new Employee(2,"AAAA","CTO");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp);
		employees.add(new Employee(3,"sdfd","hr"));
		
		for(Employee e : employees)
		{
			//System.out.println(e.id+" "+e.name);
			if(e.getId()>2)
				e.setDept("Manager");
			
			System.out.println(e.getDept()+" "+e.getId()+" "+e.getName());
			
		}
		
	}

}
