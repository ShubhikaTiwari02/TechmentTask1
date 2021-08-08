
import java.util.Scanner;

public class FascinatingNumber {


		public static void main(String[] args) {
			
	  
			System.out.println("Enter number to check fascinating ");
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			int arr[] = new int[10];
			
			if(n>99 && n<1000)
			{
				String str ="";
				
				for(int i =1;i<=3;i++)
				{
					str+=Integer.toString(n*i);
					
				}
				System.out.println(str);
				
				for(int i=0;i<str.length();i++)
				{
					char a = str.charAt(i);
					int b = Character.getNumericValue(a);
					if(arr[b]==0)
					{
						arr[b]=1;
					}
					else {
						++arr[b];
					}
				}
				
				boolean check = true;
				for(int i=0;i<arr.length;i++)
				{
//					System.out.println(arr[i]);
				    if(arr[i]!=1 && arr[i]!=0)
				    	check = false;
				}
				if(check)
					System.out.println("Fascinating number");
				else
					System.out.println("Not Fascinating number");
				
				
			}
			
			else {
				System.out.println("Entered number is not three digit");
			}
		}

	}
			
		
