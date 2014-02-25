import java.util.Scanner;


public class Tutorial82 {
	public static void main(String[] args){ // método principal
		
		Scanner x = new Scanner(System.in);
		
		
		try { // hacer las intrucciones
			System.out.println("Please, enter a number: ");
			int a = x.nextInt();
			System.out.println("Enter other number: ");
			int b = x.nextInt();
			
			int c = a/b;
			
			System.out.println("The result is: "+c);
			
		} catch (Exception e) { // si hay un error, hacer esto:
			System.out.println("You cant do that");
		}
		
	}
}
