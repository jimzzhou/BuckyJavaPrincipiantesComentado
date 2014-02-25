
public class Tutorial43 { // Clase1
	public static void main (String[] args){ // método principal
	      Potpie22 potObject = new Potpie22(4,5,6); // imprime: The constructor for this is 4/5/6
	      Tuna22 tunaObject = new Tuna22("Bucky", potObject);
	      
	      System.out.println(tunaObject); // imprime: My name is Bucky, my birthday is 4/5/6
	                                      // Si llamas al objeto te llama al toString()
	}
}

class Tuna22 { // Clase2
	   private String name;
	   private Potpie22 birthday;
	   
	   public Tuna22(String theName, Potpie22 theDate){ // Constructor
	      name = theName;
	      birthday = theDate;
	   }
	   
	   public String toString(){ // método de instancia
	      return String.format("My name is %s, my birthday is %s", name, birthday); // cuando convierte el objeto birthay a cadena, llama al método toString que contiene (al de Potpie22)
	   }
}

class Potpie22 { // Clase3
	   public int month;
	   public int day;
	   public int year;
	   
	   public Potpie22(int m, int d, int y){ // Constructor
	      month = m;
	      day = d;
	      year = y;
	      
	      System.out.printf("The constructor for this is %s\n", this); // llama a toString...
	   }
	   
	   public String toString(){ // método de instancia
	      return String.format("%d/%d/%d", month, day, year);
	   }
}
