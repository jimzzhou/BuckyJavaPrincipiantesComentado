
public class Tutorial61 {
	public static void main(String[] args){ // método principal
	      
	      A5nimal[] thelist = new A5nimal[2]; // array de: clase A5nimal, de 2 elementos...
	      D5og d = new D5og();
	      F5ish f = new F5ish();
	      
	      thelist[0]=d;
	      thelist[1]=f;
	      
	      for(A5nimal x: thelist){ // recorre todo el array
	         x.noise(); // Ruff
	      }             // Glurp Slurp
	   }
}

/**
 * D5og
 * 
 * Hereda de: A5nimal
 * 
 */
class D5og extends A5nimal {
	   
	   public void noise(){ // método de instancia
	      System.out.println("Ruff");
	   }
}

/**
 * F5ish
 * 
 * Hereda de: A5nimal
 *
 */
class F5ish extends A5nimal{
	   
	   public void noise(){ // método de instancia
	      System.out.println("Glurp Slurp");
	   }
}

/**
 * A5nimal -- Superclase --
 * 
 * @author Pablo
 *
 */
class A5nimal {
	   
	   public void noise(){ // método de instancia
	      System.out.println("Animal don´t make noise");
	   }
}
