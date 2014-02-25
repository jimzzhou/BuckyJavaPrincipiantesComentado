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
	    * main -- m�todo principal --
	    * 
	    * @param args (String)
	    */
	   public static void main(String args[ ]) { // m�todo principal
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
	      add(panel, BorderLayout.CENTER); // aplicamos panel al JFrame y el Gestor de Dise�o BorderLayout centrado...
	      
	      button = new JButton("Choose the color"); // creamos bot�n
	      add(button, BorderLayout.SOUTH); // aplicamos el bot�n al JFrame y el Gestor de Dise�o BorderLayout abajo...
	      button.addActionListener( // vigilante
	         new ActionListener() { // Clase (interface)
	            public void actionPerformed(ActionEvent event) { // m�todo del interface
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
