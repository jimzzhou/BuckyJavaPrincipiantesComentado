import java.io.File;

public class Tutorial78 {
	public static void main(String args[ ]) { // método principal
	      //File f = new File("/home/asus/5.jpg");
		  File f = new File("c:\\5.jpg");
	      if(f.exists())
	         System.out.println(f.getName() + " exists!");
	      else
	         System.out.println("There is no such file.");
	 }
}
