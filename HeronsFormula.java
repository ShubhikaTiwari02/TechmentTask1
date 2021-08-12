import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three sides of triangle ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int s = (a+b+c)/2;
		
		int area = s*(s-a)*(s-b)*(s-c);
		System.out.println("Area of triangle is "+Math.sqrt(area));
		
	}

}