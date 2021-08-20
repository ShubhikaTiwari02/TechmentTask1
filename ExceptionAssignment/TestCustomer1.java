package techment.ExceptionAssignment;


import java.util.*;


class InvalidInputException extends Exception
{
	String msg;

	public InvalidInputException(String msg) {
		super(msg);
		this.msg = msg;
	}
}



class Customer
{
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	
}




public class TestCustomer1 {
	
	public static void validations(Customer customer) throws InvalidInputException
	{
		
		System.out.println("===========================================");
		char ch = customer.getCustNo().charAt(0);
		System.out.println(" char at "+ch);
		String nameValue = customer.getCustName();
		System.out.println("nameValue"+nameValue);
		String category = customer.getCategory();
		System.out.println("catergory "+category);
		
		if(ch!='c' || ch!='C')
		{
			System.out.println("chh "+ch);
			throw new  InvalidInputException("Invalid input for customer id it must start either c or C"); 
		}
		else
			if (nameValue.length()<4) {
			throw new  InvalidInputException("Invalid input for customer name must be atleast 4 charcaters");
		}
		else 
			if(category!="Gold"||category !="Platinum"|| category !="Silver" ) {
			throw new  InvalidInputException("Invalid category");
		}
		else 
		{
			System.out.println("Customer id: "+customer.getCustNo()+" Customer name: "+customer.getCustName()+" Catergory: "+customer.getCategory());
		}
		
	}

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Cba","shubhika","gold");
		Customer customer2 = new Customer("b","shivi","Diamond");
		Customer customer3 = new Customer("C","disha","Silver");
		Customer customer4 = new Customer("A","rahul","Silver");
		
		try {
		validations(customer1);
		validations(customer2);
		validations(customer3);
		validations(customer4);
		}catch(InvalidInputException e)
		{
			System.out.println("Exception: "+e);
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
	}

}
