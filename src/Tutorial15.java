import java.util.Scanner;


public class Tutorial15 {
	public static void main(String args[]){ // m�todo principal
		   
	      Scanner input = new Scanner(System.in);
	      Tuna2 tunaObject = new Tuna2(); // creamos objeto...
	      
	      System.out.println("Enter your name here: ");
	      String name = input.nextLine(); 
	      
	      tunaObject.simpleMessage(name); // llamamo al m�todo de instancia de la clase. Le pasamos un par�metro.

	}
}

class Tuna2 { // clase de instancia
	   public void simpleMessage(String name){ // m�todo de instancia
	      System.out.println("Hello " + name);
	   }
}
