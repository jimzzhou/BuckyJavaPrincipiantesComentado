
public class Tutorial17 {
	public static void main(String args[]){ // m�todo principal
	      Tuna4 tuna_Object = new Tuna4("Kisley"); // creamos objeto. Llama a constructor pasandole par�metro
	      Tuna4 tuna_Object2 = new Tuna4("Nicole"); // creamos objeto. Idem arriba.
	      tuna_Object.saying();
	      tuna_Object2.saying();
	   }
}

class Tuna4 { // Clase de instancia
	   private String girlName;

	   public Tuna4(String name){ // Constructor
	      girlName=name;
	   }

	   public String getName(){ // m�todo getter de instancia 
	      return girlName;
	   }
	   public void saying(){ // m�todo de instancia
	      System.out.printf("\nYour first gf was %s", getName());
	   }
}
