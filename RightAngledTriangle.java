
import java.util.Arrays;
import java.util.Scanner;

public class Find2Largest2Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println("Enter size of array ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		
		Arrays.sort(arr);
		
		System.out.println("Two Largest Elements are "+arr[size-1]+" and "+arr[size-2]);
		System.out.println("Two Smallest Elements are "+arr[0]+" and "+arr[1]);
		
		
	}

}