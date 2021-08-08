import java.util.Scanner;

public class GlassHouse {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
         System.out.print("Enter two digit number : ");
        int num = sc.nextInt();
	
	if(num>9 && num<99)
	{


	
	
	int sum =0;
	while(num>0)
	{
	 int remainder = num%10;
	 sum+=remainder;
	 num = num/10;  
 
	}

	System.out.print("Your Opening Gate is :"+sum);	

	}

    else {
	System.out.print("Wrong input");
	}


	}

}
