
package Com.techment.day13.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class WWE {
   
  //Creating private variable here

	private String firstName;
	private String lastName;
	private long weight;

// Constructor here
	public WWE(String firstName, String lastName, long weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}


// Getters and Setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

}

//  Here i have done all Implemetations

public class WWEWrestlerImplementation {

	public static void main(String[] args) {

		ArrayList<WWE> wrestlers = new ArrayList<WWE>();

		WWE wrestler1 = new WWE("Great", "Khali", 400);
		WWE wrestler2 = new WWE("The", "Undertaker", 390);
		WWE wrestler3 = new WWE("Jhon", "Cena", 189);
		WWE wrestler4 = new WWE("Roman", "Reigns", 78);
		WWE wrestler5 = new WWE("Randy", "Orton", 267);
		WWE wrestler6 = new WWE("Kurt", "Angle", 99);

		wrestlers.add(wrestler1);
		wrestlers.add(wrestler2);
		wrestlers.add(wrestler3);
		wrestlers.add(wrestler4);
		wrestlers.add(wrestler5);
		wrestlers.add(wrestler6);

		// Counting the Number of Wrestlers

		//Numbers of Wrestlers

		long total = wrestlers.stream().count();
		System.out.println("Total wrestlers are : " + total);


		//Total weights of wrestlers above 200

		long totalWeights = wrestlers.stream().filter(i->(i.getWeight()>=200)).collect(Collectors.summarizingLong(WWE::getWeight)).getSum();
		System.out.println("Total weights of wrestlers having more than 200 : " + totalWeights);

		

// Here i am Printing all wrestlers by firstname

		
		System.out.println("\nFirst name of all wrestlers is ");
		List<WWE> wrestlersList = new ArrayList(wrestlers);
		
		WWEWrestlerImplementation obj = new WWEWrestlerImplementation();
		
		List<String> firstNameList = obj.printFirstName(wrestlersList);
		
		for(String f:firstNameList)
		{
			System.out.println(f);
		}
		
		System.out.println("\nMinimum weight among wrestlers is ");
		WWE minWeight = obj.minimumWeight(wrestlersList);
		System.out.println("Name : "+minWeight.getFirstName()+" "+minWeight.getLastName()+" weights :"+minWeight.getWeight());
	}
	
	
	
	
	 List<String> printFirstName(List<WWE> wrestlersList)
	 {
		return wrestlersList.stream().map(i->i.getFirstName()) .collect(Collectors.toList());
	 }
	
	 WWE minimumWeight(List<WWE> wrestlersList)
	 {
		 
		return wrestlersList.stream().min(Comparator.comparingLong(WWE::getWeight)).get();
		 
	 }
	
	
	

}