import java.util.Formatter;

public class Tutorial80 { // Clase 1
	public static void main(String args[ ]) { // m�todo principal
	      Create f = new Create();
	      f.openFile();
	      f.recordFile();
	      f.closeFile();
	}
}

class Create { // Clase 2
	   private Formatter f; // variable de instancia
	   
	   /**
	    * openFile -- m�todo de instancia --
	    */
	   void openFile() { 
	      try {  // instrucciones a hacer...
	         f = new Formatter("C:\\U1.txt"); // creamos un fichero
	      } catch(Exception e) { // en caso de error de esas intrucciones...
	         System.out.println("You have an error");   
	      }
	   }
	   
	   /**
	    * recordFile -- m�todo de instancia --
	    */
	   void recordFile() { // graba en fichero
	      f.format("%s %s %s", "Mr", "Somebody", "20");   
	   }
	   
	   /**
	    * closeFiile -- m�todo de instancia --
	    */
	   void closeFile() { // cierra fichero
	      f.close();   
	   }
}