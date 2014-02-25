import java.util.Formatter;

public class Tutorial79 {
	 public static void main(String args[ ]) { // método principal
	      final Formatter f;
	      
	      try {
	         //f = new Formatter("/home/asus/5.txt");
	    	  f = new Formatter("C:\\5.txt"); // creamos un fichero
	      } catch (Exception e) {
	         System.out.println("you have an error");   
	      }
	}
}
