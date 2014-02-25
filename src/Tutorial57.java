
public class Tutorial57 {
	public static void main(String[] args){ // método principal
	      
	      F2atty bucky = new F2atty();
	      F2ood fo = new F2ood(); // si declararamos F2ood como abstract, daría error...Es sólo útil para Polimorfismo y Herencia.
	      F2ood po = new P2otpie(); // si declararamos F2ood como abstract, NO daría error
	      
	      bucky.digest(fo);
	      bucky.digest(po);
	}
}

/**
 * P2otpie
 * 
 * Hereda de: F2ood
 *
 */
class P2otpie extends F2ood {
	   void eat(){ // método de instancia
	      System.out.println("this potpie is great");
	   }
}

/**
 * T2una
 * 
 * Hereda de: F2ood
 *
 */
class T2una extends F2ood{
	   void eat(){ // método de instancia
	      System.out.println("this tuna is great");
	   }
}

/**
 * F2ood
 *
 */
class F2ood {
	   
	   void eat(){ // método de instancia
	      System.out.println("this food is great");
	   }

}

/**
 * F2atty
 *
 */
class F2atty {

	   F2ood fo = new F2ood(); // si declararamos F2ood como abstract, daría error	
	   
	   public void digest(F2ood x){ // método de instancia
	      x.eat();
	   }

}

