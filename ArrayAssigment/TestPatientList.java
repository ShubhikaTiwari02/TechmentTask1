package com.techment.CollectionAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


class Patient {
	private int patientId;
	private String name;
	private int age;
	
	//Constructor  define here
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	static void parentAge() {
		
	}
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

class NameSorting implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		return (o1.getName().compareTo(o2.getName()));
		
	}
	
}


class AgeSorting implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()>o2.getAge())
			return 1;
		else 
			return -1;
	}
	
}



public class TestPatientList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Patient> patient = new ArrayList<Patient>();
		
		
		Patient p1 = new Patient(1,"shubhika",37);
		Patient p2 = new Patient(2,"shilvee",23);
		Patient p3 = new Patient(3,"rahul",35);
		
		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
	System.out.println("Name after Sorting : ---");
		Collections.sort(patient,new NameSorting());
		for(Patient p:patient)
		{
			System.out.println(p);
		}
		
		
		System.out.println("Age Sorting here :----  ");
		Collections.sort(patient,new AgeSorting());
		for(Patient p:patient)
		{
			System.out.println(p);
		}
		
		public static void main(String[] args) {

		TreeSet<Patient> ts = new TreeSet<Patient>(patient);
		


		
		
		
		
		
		}
	}

}

