package Com.techment.day13.test;

import java.util.Scanner;

class Person{
	private int id;
	private String name;
	private int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}

class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    
class InvalidNameException  extends Exception  
{  
    public InvalidNameException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

public class AgeValidate {

	public static void main(String[] args) throws InvalidNameException, InvalidAgeException {
		// TODO Auto-generated method stub

		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id ");
			int id = scanner.nextInt();
			
			System.out.println("Enter name ");
			
			String name = scanner.nextLine();
			name+=scanner.nextLine();
			
			
			if(name.length()<=3)
				throw new InvalidNameException("Name should be more than 3 chars ");
			
			System.out.println("Enter age ");
			int age = scanner.nextInt();
			
			if(age==0 || age<15)
				throw new InvalidAgeException("Age should be more than 15");
			
			Person person = new Person(id,name,age);
			
			System.out.println("Name is "+person.getName());
			System.out.println("Age is "+person.getAge());
			
			
		}catch(InvalidAgeException e) {
			   System.out.println(e.getMessage());
		}catch(InvalidNameException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}