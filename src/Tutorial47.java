
public class Tutorial47 { // Clase 1
	public static void main(String[] args){ // método principal
	      Tuna4444 member1 = new Tuna4444("Megan", "Fox");
	      Tuna4444 member2 = new Tuna4444("Natalie", "Portman");
	      Tuna4444 member3 = new Tuna4444("Taylor", "Swift");
	      
	      
	      System.out.println();
	      System.out.println(Tuna4444.getMembers()); // es un método de clase (Static)...Sintaxis: Clase.metodo();
	      System.out.println();
	      System.out.println(member2.getFirst()); // es un método de instancia...
	      System.out.println(member2.getLast()); // idem...
	      System.out.println(member2.getMembers()); // es un método de clase (Static)...Sintaxis: objeto.metodo();
	      
	      
	}
}

class Tuna4444 { // Clase 2
	   private String first; // variable de instancia
	   private String last; // variable de instancia
	   private static int members = 0; // variable de clase
	   
	   public Tuna4444(String fn, String ln){ // Constructor
	      first = fn;
	      last = ln;
	      members++;
	      System.out.printf("Constructor for %s %s, members in the club : %d\n", first, last, members);
	   }
	   /**
	    * getter
	    * 
	    * @return first (String)
	    */
	   public String getFirst(){ // método de instancia
	      return first;
	   }
	   /**
	    * getter
	    * 
	    * @return last (String)
	    */
	   public String getLast(){ // método de instancia
	      return last;
	   }
	   /**
	    * getter (static)
	    * 
	    * @return
	    */
	   public static int getMembers(){ // método de clase
	      return members;
	   }
}
