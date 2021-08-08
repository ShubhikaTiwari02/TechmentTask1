import java.util.Scanner;

public class WhoAreGoingForBattle {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter 1st num: ");
			int num1 = sc.nextInt();
			System.out.print("Enter 2nd num: ");
			int num2 = sc.nextInt();

			for(int i = num1;i<=num2;i++)
				System.out.println("Soldier "+i);
			
		}
		finally {
			sc.close();
		}
		
		
	}

}