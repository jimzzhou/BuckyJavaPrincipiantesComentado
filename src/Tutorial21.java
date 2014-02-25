import java.util.Scanner;


public class Tutorial21 {
	
	public static void main(String args[]){ // método principal
	      Scanner input = new Scanner(System.in);
	      int total = 0; 
	      int grade;
	      int average;
	      int counter = 0;

	      while (counter < 10){ // hazlo hasta que counter = 10, counter empieza por 0...
	         grade = input.nextInt();
	         total = total + grade;
	         counter++;
	      }
	      average = total/10;
	      System.out.println("Your average is "+ average);
	      input.close();
	 }

}
