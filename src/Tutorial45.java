import java.util.EnumSet;


public class Tutorial45 {
	public static void main(String[] args){ // método principal
	      for(Tuna33 people: Tuna33.values()) // values() recoge un array de constantes de la enum...  
	         System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear()); // objeto, descripción, año
	            
	      System.out.println("\nAnd now fpr the range of constants!!!\n");
	      
	      for(Tuna33 people: EnumSet.range(Tuna33.kelsey, Tuna33.candy)) // EnumSet.range(to, for) --> da el rango entre 2 constantes...
	      System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	   }
}

enum Tuna33 {
	   bucky("nice", "22"), // es una constante. Cada elemento que tiene es utilizado en los métodos de la Enumeración...
	   kelsey("cutie", "10"), // idem
	   julia("bigmistake", "12"), // idem
	   nicole("italian", "13"), // idem
	   candy("different", "14"), // idem
	   erin("iwish", "16"); // idem
	   
	   private final String desc;
	   private final String year;
	   
	   Tuna33(String description, String birthday){
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
