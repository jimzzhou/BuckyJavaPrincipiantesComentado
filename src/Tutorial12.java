
public class Tutorial12 {
	public static void main(String args[]){ // método principal
	      int age;
	      age = 3;
	      
	      switch (age){ // comprueba el contenido de la variable
	      case 1: // compara ese contenido con 1
	         System.out.println("You can crawl"); // ejecuta la instucción
	         break; // sale del switch
	      case 2: // idem..
	         System.out.println("You can talk");
	         break;
	      case 3: // idem..
	         System.out.println("You can get in problem");
	         break;
	      default: // si comparando no ha encontrado ninguno que coincida hace este por defecto...
	         System.out.println("I don't know how old you are");
	         break;
	      }
	}
}
