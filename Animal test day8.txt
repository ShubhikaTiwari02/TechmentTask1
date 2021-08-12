public class Animal {

	void eat()
		{System.out.println("eating...");}
	}

	class Dog extends Animal{  
	void bark(){System.out.println("barking...");}  
	}  
	
	class Horese extends Animal{  
		void neigh(){System.out.println("neigh...");}  
		}
	class Cat extends Animal{  
	void meow()
	{System.out.println("meowing...");}

	}  
	class TestInheritance{  
	public static void main(String args[]){  
	Cat c=new Cat();  
	c.meow();  
	c.eat();
	c.bark();
	c.neigh();
	
	}
	
	}
/// childe progerm EXe 2

import java.util.Scanner;
public class AgeCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age[];
		age = new int[5];
		System.out.println("Enter ages of people: ");
		for(int i=0; i<age.length; i++)
		{
			age[i]=scanner.nextInt();
		}
		int child=0, adult=0, seniorCitizen=0;
		for(int j=0; j<age.length; j++)
		{
			if(age[j]<18)
				child++;
			else if(age[j]>18 && age[j]<54)
				adult++;
		    else
			    seniorCitizen++;
		}
		System.out.println("children: "+child);
		System.out.println("adult: "+adult);
		System.out.println("senior citizen: "+seniorCitizen);
	}
}


// Exe 3 first name and last name :-----
package contechmentbasicException;

public class Employee extends RuntimeException{
    private String firstName;
    private String lastName;
    
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public void Display() {
		
	System.out.println(" enter first name" + firstName);
	System.out.println(" enter first name" + lastName);


	}

	public static void main(String[] args) {
  
Employee e =new Employee(" shubhika "," Tiwari");
Employee e1 =new Employee(" shubhi ", " shrma");
e.Display();
e1.Display();


	}

}


///Exe 4 Saving account :---
import java.util.Scanner;

class Employee extends RuntimeException {
	private String firstName;
	private String lastName;

	// Constructor
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void validation(String firstName, String lastName) throws NameException {
		if (firstName.length() < 3 || lastName.length() < 3) {
			throw new NameException("Name should be more than 3 chars ");

		} else if (firstName == null || lastName == null)
			throw new NullPointerException("Should not null or empty");

	}

}

class NameException extends Exception {
	public NameException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
}

public class EmployeeMain {

	public static void main(String[] args) throws NameException {

		try {

			Scanner scanner = new Scanner(System.in);

			// Taking input from user , number of persons
			System.out.println("Enter First name :");
			String firstName = scanner.next();

			System.out.println("Enter Last name :");
			String lastName = scanner.next();

			Employee emp1 = new Employee(firstName, lastName);
			emp1.validation(firstName, lastName);

		} catch (NameException e) {
			System.out.println(e.getMessage());
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
}
}



















