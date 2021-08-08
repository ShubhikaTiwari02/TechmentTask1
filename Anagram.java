import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String ");
		String str1 = scanner.next();
		System.out.println("Enter Second String ");
		String str2 = scanner.next();
		
		char tempArray1[] = str1.toCharArray();
		char tempArray2[] = str2.toCharArray();
		
		
		
		Arrays.sort(tempArray1);
		Arrays.sort(tempArray2);
		
	String one = new String(tempArray1);
	String two = new String(tempArray2);
		
		if(one.equals(two))
			System.out.println("Both String are Anagram");
		else
			System.out.println("Both Strings are not Anagram");
		
	}

}