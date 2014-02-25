
public class Tutorial59 {
	 public static void main(String[] args){ // método principal
	      
	      DogList DLO = new DogList();
	      Dog d = new Dog();
	      Dog b = new Dog();
	      Dog c = new Dog();
	      Dog e = new Dog();
	      Dog f = new Dog();
	      Dog g = new Dog();
	      DLO.add(d); // Dog added at index 0
	      DLO.add(b); // Dog added at index 1
	      DLO.add(c); // Dog added at index 2
	      DLO.add(e); // Dog added at index 3
	      DLO.add(f); // Dog added at index 4
	      DLO.add(g); // no sale
	 }
}

/**
 * Fish
 * 
 * Hereda de: Animal
 *
 */
class Fish extends Animal{

}

/**
 * Dog
 * 
 * Hereda de: Animal
 *
 */
class Dog extends Animal{

}

/**
 * Animal
 *
 */
class Animal {
   
}

/**
 * DogList
 *
 */
class DogList {
   private Dog[] thelist = new Dog[5]; // Crea un objeto de array de clase Dog, de 5 elementos
   private int i=0;
   /*
    * El problema con este método es que solo acepta Dog...Si quisieramos que aceptase tambien Fish, tendriamos 
    * que hacerlo como en el siguiente tutorial (Tutorial60)
    */
   public void add(Dog d){ // método de instancia
      if(i<thelist.length){ // si el contador i es menor que 5
         thelist[i]=d;
         System.out.println("Dog added at index "+i);
         i++;
      }
      
   }
}
