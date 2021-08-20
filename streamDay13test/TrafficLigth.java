package Com.techment.day13.test;

import java.util.Scanner;

public class TrafficLigth {

	public static void main(String[] args) {
		        int color;
				Scanner scan = new Scanner(System.in);
        System.out.println(" Enter any number 1,2,3  :----");
		 color=scan.nextInt();

          int expression = 2 ;
     // switch statement to check Traffic light Signals 
	    switch (color) {
	      case 1:
	        System.out.println(" Red is for Danger...kindly STOP");
              break;
	        // matching case
	      case 2:
	        System.out.println("Green  is for GO...kindly GO");
               break;
	      case 3:
	        System.out.println("Green  is for ready...kindly READY");
               break;
	      default:
	        System.out.println("Default case ");
	    }
	  }
	}

