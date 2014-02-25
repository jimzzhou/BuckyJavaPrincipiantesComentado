
public class Tutorial56 {
		public static void main(String[] args){ // método principal
	      
	      F1atty bucky = new F1atty();
	      F1ood fo = new F1ood();
	      F1ood po = new P1otpie(); // Polimorfismo
	      
	      bucky.digest(fo);
	      bucky.digest(po);
		}
}

/**
 * P1otpie
 * 
 * Hereda de: F1ood
 */
class P1otpie extends F1ood {
	   void eat(){ // método de instancia
	      System.out.println("this potpie is great");
	   }

}

/**
 * T1una
 * 
 * Hereda de: F1ood
 *
 */
class T1una extends F1ood{
	   void eat(){ // método de instancia
	      System.out.println("this tuna is great");
	   }
}


/**
 * F1ood -- Superclase --
 *
 */
class F1ood {
	   
	   void eat(){ // método de instancia
	      System.out.println("this food is great");
	   }

}

/**
 * F1atty
 * 
 */
class F1atty {
		   
	   public void digest(F1ood x){ // método de instancia
		  x.eat();
	   }

}