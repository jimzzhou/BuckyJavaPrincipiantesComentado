
public class Tutorial58 {
	public static void main(String[] args){ // método principal
	      
	      F3atty bucky = new F3atty();
	      F3ood fo = new T3una(); // si declararamos F2ood como abstract, daría error...Es sólo útil para Polimorfismo y Herencia.
	      F3ood po = new P3otpie(); // si declararamos F2ood como abstract, NO daría error
	      
	      bucky.digest(fo);
	      bucky.digest(po);
	}
}

/**
 * P3otpie
 * 
 * Hereda de: F2ood
 *
 */
class P3otpie extends F3ood {
	   public void eat(){ /*
            			   * el método de instancia necesita ser public (porque va a sobreescribir (implementar) el método del padre (que es clase abstracta, 
                           * con metodo PUBLIC abstracto - el que se implementa-) */
	      System.out.println("this potpie is great");
	   }
}

/**
 * T3una
 * 
 * Hereda de: F2ood
 *
 */
class T3una extends F3ood{
	   public void eat(){ /*
	                       * el método de instancia necesita ser public (porque va a sobreescribir (implementar) el método del padre (que es clase abstracta, 
	                       * con metodo PUBLIC abstracto - el que se implementa-) */
	      System.out.println("this tuna is great");
	   }
}

/**
 * F3ood
 *
 */
abstract class F3ood { // Puede ser la clase abstracta, y tener un método normal...
	   
	   public abstract void eat(); // si es un método abstracto, la clase también tiene que ser abstracta...

}

/**
 * F3atty
 *
 */
class F3atty {

	   // F3ood fo = new F3ood(); // si declararamos F2ood como abstract, daría error	
	   
	   public void digest(F3ood x){ // método de instancia
	      x.eat();
	   }

}

