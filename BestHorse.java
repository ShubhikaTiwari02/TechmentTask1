import java.util.Scanner;

public class BestHorse {
                public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter weight of 1st horse :");
	        float weight1 = sc.nextFloat();

	        System.out.print("Enter weight of 1st horse :");
	        float weight2 = sc.nextFloat();

	        System.out.print("Enter weight of 1st horse :");
	        float weight3 = sc.nextFloat();

	        if (weight1 > weight2 && weight1 > weight3  && weight2!=weight3) {
	            System.out.print("Go with first horse");
	        }

	        else if (weight2 > weight1 && weight2 > weight3 && weight1!=weight3) {
	            System.out.print("Go with second horse");
	        }

	        else if (weight3 > weight2 && weight3 > weight1  && weight1!=weight2) {
	            System.out.print("Go with third horse");
	        } else {
	            System.out.print("Entered weights are not Distinct weights");
	        }

	    }

	}
