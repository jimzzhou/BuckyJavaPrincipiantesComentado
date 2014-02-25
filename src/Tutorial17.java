
public class Tutorial17 {
	public static void main(String args[]){ // método principal
	      Tuna4 tuna_Object = new Tuna4("Kisley"); // creamos objeto. Llama a constructor pasandole parámetro
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

	   public String getName(){ // método getter de instancia 
	      return girlName;
	   }
	   public void saying(){ // método de instancia
	      System.out.printf("\nYour first gf was %s", getName());
	   }
}
