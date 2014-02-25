import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class Tutorial51 {
	public static void main(String[] args){ // método principal
	      
	      Tuna7 bucky = new Tuna7();
	      bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // configuramos el botón de cerrar de la ventana
	      bucky.setSize(275, 180); // ancho, alto...
	      bucky.setVisible(true); 
	      
	}
}

class Tuna7 extends JFrame{
	   
	   private JLabel item1; // definimos etiqueta...
	   
	   public Tuna7(){ // Constructor
	      super("The title bar"); // titulo
	      setLayout(new FlowLayout()); // Gestor de Diseño
	      
	      item1 = new JLabel("This is a sentence"); // creamos etiqueta...
	      item1.setToolTipText("This is gonna show up on hover"); // bocadillo...sobre la etiqueta...
	      add(item1); // añadimos el botón al JFrame...
	   }
}
