package techment.ExceptionAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class AgeCalculator1
{
	int year;
	
	
	public int  calculateAge(){
		
		
		return year;
	}
	

}


public class TestAgeCalculator1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		
		String sDate1="20/10/1995";
		 SimpleDateFormat formatter = new SimpleDateFormat("dd//yyyy");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date)); 
		
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1+"\t"+date1);
	}

}