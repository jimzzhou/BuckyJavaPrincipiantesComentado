import java.util.Scanner;


public class Tutorial15 {
	public static void main(String args[]){ // método principal
		   
	      Scanner input = new Scanner(System.in);
	      Tuna2 tunaObject = new Tuna2(); // creamos objeto...
	      
	      System.out.println("Enter your name here: ");
	      String name = input.nextLine(); 
	      
	      tunaObject.simpleMessage(name); // llamamo al método de instancia de la clase. Le pasamos un parámetro.

	}
}

class Tuna2 { // clase de instancia
	   public void simpleMessage(String name){ // método de instancia
	      System.out.println("Hello " + name);
	   }
}
