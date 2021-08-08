import java.util.Scanner;

public class TrafficCongestion {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter today's date ");
		int date = scanner.nextInt();
		
		System.out.println("Enter car registration no ");
		int reg = scanner.nextInt();
		
		if(date%2 ==0 && reg%2 != 0)
		{
			System.out.println("Cars with Even registration numbers are permitted today");
		}
		
		else if(date%3 ==0 && reg%2 == 0)
		{
			System.out.println("Cars with Odd registration numbers are permitted today");
		}
		else
		{
			System.out.println("Registration succesfull");
		}
			
		
		
	}
}