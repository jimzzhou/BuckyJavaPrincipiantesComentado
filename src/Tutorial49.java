
public class Tutorial49 { // Clase 1
	public static void main(String[] args){ // método principal
	      Tuna6 tunaObject = new Tuna6();
	      Potpiel potObject = new Potpiel();
	      
	      tunaObject.eat(); // "I am the new mothod of Tuna6"
	      potObject.eat(); // "I am the eat method"
	      
	}
}

/**
 * Clase: Tuna6.
 * Hereda de: Food. (subclase)
 * 
 * @author Pablo
 *
 */
class Tuna6 extends Food { // Clase 2
	public void eat(){
		System.out.println("I am the new method of Tuna6");      
	}
}

/**
 * Clase: Potpie2. (subclase)
 * Hereda de: Food.
 * 
 * @author Pablo
 *
 */
class Potpiel extends Food{ // Clase 3

}

/**
 * Clase: Food. (Superclae)
 * 
 * @author Pablo
 *
 */
class Food { // Clase 4
	public void eat(){ // método de instancia...
		System.out.println("I am the eat methods");      
	}
}
