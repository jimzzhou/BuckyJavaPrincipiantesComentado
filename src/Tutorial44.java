
public class Tutorial44 {
	 public static void main(String[] args){ // m�todo principal
	      for(Tunala people: Tunala.values()) // values() recoge un array de constantes de la enum...   
	         System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear()); // constante, descripci�n, a�o
	 }
}

enum Tunala {
	   bucky("nice", "22"), // es una constante. Cada elemento que tiene es utilizado en los m�todos de la Enumeraci�n...
	   kelsey("cutie", "10"), // idem
	   julia("bigmistake", "12"); // idem
	   
	   private final String desc;
	   private final String year;
	   
	   Tunala(String description, String birthday){ // Constructor
	      desc = description;
	      year = birthday;
	   }
	   
	   public String getDesc(){
	      return desc;
	   }
	   
	   public String getYear(){
	      return year;
	   }
}

