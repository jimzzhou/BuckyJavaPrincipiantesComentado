import java.util.Scanner;


public class Tutorial16 {
	 public static void main(String args[]){ // m�todo principal
		   
	      Scanner input = new Scanner(System.in);
	      Tuna3 tunaObject = new Tuna3();
	      System.out.println("Enter name of first gf here: ");
	      String temp = input.nextLine();
	      tunaObject.setName(temp); // llamamos al m�todo de instancia de la clase, y le pasamos un par�metro.
	      tunaObject.saying(); // llamamos al otro m�todo de instancia de la clase.
	   }
}

class Tuna3 { // Clase de instancia
	   private String girlName;
	   public void setName(String name){ // m�todo setter de instancia
	      girlName=name;
	   }
	   public String getName(){ // m�todo getter de instancia
	      return girlName;
	   }
	   public void saying(){ // m�todo de instancia
	      System.out.printf("Your first gf was %s", getName());
	   }
}
