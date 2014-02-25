import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Tutorial85 extends JFrame{
	   private JButton button;
	   private Color color = Color.WHITE; 
	   private JPanel panel;
	   /**
	    * main -- método principal --
	    * 
	    * @param args (String)
	    */
	   public static void main(String args[ ]) { // método principal
		  Tutorial85 chooser = new Tutorial85();
	      chooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	   
	   /**
	    * Constructor
	    */
	   Tutorial85() {
	      super("imba color changer");
	      
	      panel = new JPanel(); // creamos un objeto JPanel
	      panel.setBackground(color); // le aplicamos color BLANCO de fondo
	      add(panel, BorderLayout.CENTER); // aplicamos panel al JFrame y el Gestor de Diseño BorderLayout centrado...
	      
	      button = new JButton("Choose the color"); // creamos botón
	      add(button, BorderLayout.SOUTH); // aplicamos el botón al JFrame y el Gestor de Diseño BorderLayout abajo...
	      button.addActionListener( // vigilante
	         new ActionListener() { // Clase (interface)
	            public void actionPerformed(ActionEvent event) { // método del interface
	               color = JColorChooser.showDialog(null, "Choose the color", color); // muestra una paleta de colores, donde podemos elegir el color que deseemos...
	               if(color == null)
	                  color = Color.WHITE;
	               panel.setBackground(color); // aplicamos al JPanel el color que hemos seleccionado...
	            }
	         }
	      );
	      setSize(400, 150);
	      setVisible(true);
	   }
}
