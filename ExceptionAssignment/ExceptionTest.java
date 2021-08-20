package techment.ExceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
		public static boolean isNumeric(String str) {
			try {
				Integer.parseInt(str);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		public static void main(String[] args) {

			try {
				if (args.length==0) {
	                  throw new ArrayIndexOutOfBoundsException("Input Missing");
				}

				else if (isNumeric(args[0]) && isNumeric(args[1])) {
					int number1 = Integer.parseInt(args[0]);
					int number2 = Integer.parseInt(args[1]);
					
					if(number2==0)
						throw new IllegalArgumentException("Division by 0 not possible");
					
					
				} else {
					throw new IllegalArgumentException("Only integers are allowed");
				}

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}

		}

	
}