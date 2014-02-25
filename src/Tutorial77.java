import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Tutorial77 extends JFrame{
	   private JLabel statusBar;
	   private String details = "Go on - do something!";
	   
	   public static void main(String args[ ]) { // método principal
		  Tutorial77 gui = new Tutorial77();
	      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      gui.setSize(350, 200);
	      gui.setVisible(true);
	   }
	   /**
	    * Constructor
	    */
	   Tutorial77() { // Constructor
		      super("imba listener");
		      
		      statusBar = new JLabel(details); // creamos etiqueta...
		      add(statusBar, BorderLayout.SOUTH); // añadimos JLabel al JFrame, utilizando Gestor de Diseño (te lo situa abajo)
		      addMouseListener(new MouseHandler()); // añadimos vigilante
	   }
		   
	   /**
	    * MouseHandler (dentro de otra clase)
	    * 
	    * Hereda de; MouseAdapter 
	    *
	    */
	   private class MouseHandler extends MouseAdapter {
		      public void mouseClicked(MouseEvent event) {
		         details = String.format("You clicked %d times ", event.getClickCount()); // devuelve el número de veces que pulsas el ratón...
		         
		         // detecta el botón del ratón...
		         if(event.isMetaDown())
		            statusBar.setText(details + "with right mouse button.");
		         else if(event.isAltDown())
		            statusBar.setText(details + "with middle mouse button.");
		         else
		            statusBar.setText(details += "with left mouse button.");
		      }
	  }
}
