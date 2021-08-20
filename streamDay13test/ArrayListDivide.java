package Com.techment.day13.test;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size = scanner.nextInt();

		ArrayList<Integer> original = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter data");
			int data = scanner.nextInt();

			original.add(data);
		}

		
		ArrayList<Integer> firstArray = new ArrayList<Integer>(original.subList(0, (size) / 2));
		ArrayList<Integer> secondArray = new ArrayList<Integer>(original.subList((size) / 2,size));

		int max1 = firstArray.stream().max(Integer::compare).get();
		int max2 = secondArray.stream().max(Integer::compare).get();
		System.out.println(max1+" "+max2);

	}
}