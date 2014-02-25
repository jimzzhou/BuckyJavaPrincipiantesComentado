
public class Tutorial42 { // Clase 1
	public static void main (String[] args){ // método principal
	      Potpie21 potObject = new Potpie21(4,5,6);
	      
	}
}
class Potpie21 { // Clase 2
	   public int month;
	   public int day;
	   public int year;
	   
	   public Potpie21(int m, int d, int y){ // Constructor
	      month = m;
	      day = d;
	      year = y;
	      
	      System.out.printf("The constructor for this is %s\n", this); // this se refiere al objeto.
	                                                                   // Cuando metes ese objeto en una String, se convierte en un String
	                                                                   // y llama al método toString que le devuelve el String...
	   }
	   
	   public String toString(){ // método de instancia
	      return String.format("%d/%d/%d", month, day, year);
	   }
}

