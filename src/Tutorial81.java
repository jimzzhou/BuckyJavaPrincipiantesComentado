import java.util.Scanner;
import java.io.File;

public class Tutorial81 { // Clase 1
	public static void main(String args[ ]) { // método principal
	      Engine f = new Engine();
	      f.openFile();
	      f.printFile();
	      f.closeFile();
	}
}

class Engine { // Clase 2
	   private Scanner f; // podemos utilizar Scanner para leer una entrada de teclado, pero también (como es el caso) para leer de un fichero...
	   private String name, surname, age;
	   
	   /**
	    * openFile -- método de instancia --
	    */
	   void openFile() { // abre el fichero
	      try { // instrucciones a hacer...
	         f = new Scanner(new File("C:\\U1.txt"));
	      } catch(Exception e) { // en caso de error de esas intrucciones...
	         System.out.println("File doesn't exists");   
	      }
	   }
	   
	   /**
	    * printFile -- método de instancia --
	    */
	   void printFile() { // saca por pantalla el contenido del fichero
	      while(f.hasNext()) { // mientras tenga algo el fichero...(mientras no sea el fin del fichero EOF)
	         name = f.next();
	         surname = f.next();
	         age = f.next();
	         
	         System.out.printf("%s %s %s\n", name, surname, age);
	      }
	   }
	   
	   /**
	    * closeFile -- método de instancia --
	    */
	   void closeFile() { // cierra el fichero
	      f.close();   
	   }
	}