import java.util.Scanner;

public class LetterATime {

	public static void main(String[] args) {

    System.out.println("Enter Your Message");
    Scanner scanner = new Scanner(System.in);
    
    
    String msg = scanner.nextLine();
    
    
    System.out.println("Total Characters in msg are :"+msg.length());
    System.out.println("The First character is "+msg.charAt(0)+" at 1st position");
    System.out.println("The Last character is "+msg.charAt(msg.length()-1)+" at "+ (msg.length()-1) +" position");

    System.out.println("Your message is :"+msg);
    int count=0;
     for(int i=0;i<msg.length();i++)
     {
    	if(msg.charAt(i)=='a')
    		count++;
     }
System.out.println("Total a Present are :"+count);
	}

}