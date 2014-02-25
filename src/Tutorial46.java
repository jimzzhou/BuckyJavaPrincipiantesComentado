
public class Tutorial46 { // Clase 1
	public static void main(String[] args){ // método principal
	      Tuna444 member1 = new Tuna444("Megan", "Fox");
	      Tuna444 member2 = new Tuna444("Natalie", "Portman");
	      Tuna444 member3 = new Tuna444("Taylor", "Swift");
	}

}

class Tuna444 { // Clase 2
	   private String first; // variable de instancia (idependiente en cada objeto)
	   private String last; // variable de instancia
	   private static int members = 0; // variable de clase (común para todos los objetos)
	   
	   public Tuna444(String fn, String ln){ // Constructor
	      first = fn;
	      last = ln;
	      members++;
	      System.out.printf("Constructor for %s %s, members in the club : %d\n", first, last, members);
	   }
}