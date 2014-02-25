
public class Tutorial55 { // Clase 1
	public static void main(String[] args){ // método principal
	      
	      Food_b bucky[]=new Food_b[2];
	      bucky[0]=new Potpie_b();
	      bucky[1]=new Tuna_b();
	      
	      for(int x=0;x<2;++x){ // desde 0 hasta1
	         bucky[x].eat(); // this potpie is great
	                         // this tuna is great
	      }
	}
}

/**
 * Hereda: Food_b
 * 
 * @author Pablo
 *
 */
class Potpie_b extends Food_b { // Clase 2
	   void eat(){
	      System.out.println("this potpie is great");
	   }

}


/**
 * Hereda: Food_b
 * 
 * @author Pablo
 *
 */
class Tuna_b extends Food_b{ // Clase 3
	   void eat(){
	      System.out.println("this tuna is great");
	   }
}

/**
 * Superclase
 * 
 * @author Pablo
 *
 */
class Food_b { // Clase 4
	   
	   void eat(){
	      System.out.println("this food is great");
	   }

}
