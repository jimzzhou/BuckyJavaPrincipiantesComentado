
public class Tutorial58 {
	public static void main(String[] args){ // m�todo principal
	      
	      F3atty bucky = new F3atty();
	      F3ood fo = new T3una(); // si declararamos F2ood como abstract, dar�a error...Es s�lo �til para Polimorfismo y Herencia.
	      F3ood po = new P3otpie(); // si declararamos F2ood como abstract, NO dar�a error
	      
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
            			   * el m�todo de instancia necesita ser public (porque va a sobreescribir (implementar) el m�todo del padre (que es clase abstracta, 
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
	                       * el m�todo de instancia necesita ser public (porque va a sobreescribir (implementar) el m�todo del padre (que es clase abstracta, 
	                       * con metodo PUBLIC abstracto - el que se implementa-) */
	      System.out.println("this tuna is great");
	   }
}

/**
 * F3ood
 *
 */
abstract class F3ood { // Puede ser la clase abstracta, y tener un m�todo normal...
	   
	   public abstract void eat(); // si es un m�todo abstracto, la clase tambi�n tiene que ser abstracta...

}

/**
 * F3atty
 *
 */
class F3atty {

	   // F3ood fo = new F3ood(); // si declararamos F2ood como abstract, dar�a error	
	   
	   public void digest(F3ood x){ // m�todo de instancia
	      x.eat();
	   }

}

