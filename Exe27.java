import java.util.Random;
import java.util.Scanner;

public class Exe27 {

	public static void main(String[] args) {


		Random  random = new Random();
		int numb1 = random.nextInt();
		
	
		int  numb2 = random.nextInt();
		
		
		if(numb1%2==0 && numb2%2==0)
		{
			System.out.println("Both numbers are same :"+(numb1+numb2));
		}
		else
		{
			System.out.println("Both numbers are different :"+Math.abs(numb1-numb2));
		}
		

	}

}