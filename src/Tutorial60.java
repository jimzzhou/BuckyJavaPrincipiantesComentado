
public class Tutorial60 {
	public static void main(String[] args){ // método principal
		   
	      AnimalList ALO = new AnimalList();
	      Dog2 d = new Dog2();
	      Fish2 f = new Fish2();
	      ALO.add(d);
	      ALO.add(f);
	      
	}
}

/**
 * Fish2
 * 
 * Hereda de: Animal
 *
 */
class Fish2 extends Animal2{

}

/**
 * Dog2
 * 
 * Hereda de: Animal
 *
 */
class Dog2 extends Animal2{

}

/**
 * Animal2
 *
 */
class Animal2 {
   
}

/**
 * AnimalList
 *
 */
class AnimalList {
   
   private Animal2[] thelist = new Animal2[5];  // crea un objeto de array de clase Animal2, de 5 elementos
   private int i = 0;
   /*
    * Acepta todo tipo de animales...
    */
   public void add(Animal2 a){ // método de instancia
      if(i<thelist.length){ // si el contador i es menor que 5
         thelist[i] = a;
         System.out.println("Animal added ad index " +i);
         i++;
      }
   }
}
