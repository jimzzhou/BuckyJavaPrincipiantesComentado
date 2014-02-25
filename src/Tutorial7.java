import java.util.Scanner;

public class Tutorial7 {
	public static void main(String args[]){ // método principal
		  double fnum, snum, answer;
		  Scanner bucky = new Scanner(System.in);
	      
	      
	      System.out.println("Enter first num: ");
	      fnum = bucky.nextDouble(); // devuelve double
	      System.out.println("Enter second num: ");
	      snum = bucky.nextDouble();
	      answer = fnum + snum;
	      System.out.println(answer);
	}
}
