import java.util.Scanner;


public class Tutorial16 {
	 public static void main(String args[]){ // método principal
		   
	      Scanner input = new Scanner(System.in);
	      Tuna3 tunaObject = new Tuna3();
	      System.out.println("Enter name of first gf here: ");
	      String temp = input.nextLine();
	      tunaObject.setName(temp); // llamamos al método de instancia de la clase, y le pasamos un parámetro.
	      tunaObject.saying(); // llamamos al otro método de instancia de la clase.
	   }
}

class Tuna3 { // Clase de instancia
	   private String girlName;
	   public void setName(String name){ // método setter de instancia
	      girlName=name;
	   }
	   public String getName(){ // método getter de instancia
	      return girlName;
	   }
	   public void saying(){ // método de instancia
	      System.out.printf("Your first gf was %s", getName());
	   }
}
