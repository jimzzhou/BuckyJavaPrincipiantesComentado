import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tutorial74_76 extends JFrame{
	   private JPanel mousePanel;
	   private JLabel statusBar;
	   
	   public static void main(String args[ ]) { // método principal
		  Tutorial74_76 gui = new Tutorial74_76();
	      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      gui.setSize(350, 200);
	      gui.setVisible(true);
	   }
	   /**
	    * Constructor
	    */
	   Tutorial74_76() { // Constructor
		      super("Title: mouse actions");
		      
		      mousePanel = new JPanel(); // creamos JPanel...
		      mousePanel.setBackground(Color.BLUE); // aplicamos color de fonod azul al JPanel...
		      add(mousePanel, BorderLayout.CENTER); // añadimos JPanel al JFrame (aplicandole un diseño y situandolo en su centro)
		      
		      statusBar = new JLabel("Go on - do something"); // creamos JLabel...
		      add(statusBar, BorderLayout.SOUTH); // añadimos JLabel al JFrame (aplicándole diseño y situándolo abajo)
		      
		      HandlerClass handler = new HandlerClass(); // instanciamos clase...
		      mousePanel.addMouseListener(handler); // añadimos vigilante, pasándole la clase...
		      mousePanel.addMouseMotionListener(handler); // idem...
	   }
	   /**
	    * clase: HandlerClass
	    * 
	    * @implements: MouseListener, MouseMotionListener
	    *
	    */
	   private class HandlerClass implements MouseListener, MouseMotionListener {
		      /**
		       * métodos implementados del interface MouseListener
		       */
		      public void mouseClicked(MouseEvent event) {
		         statusBar.setText(String.format("Mouse clicked at %d, %d", event.getX(), event.getY()));   
		      }
		      
		      public void mouseEntered(MouseEvent event) { // cuando entra el ratón, el fondo se pone rojo
		         mousePanel.setBackground(Color.RED);   
		      }
		      
		      public void mouseExited(MouseEvent event) { // cuando sale el ratón, el fondo se pone azul
		         mousePanel.setBackground(Color.BLUE);   
		      }
		      
		      public void mousePressed(MouseEvent event) {
		         statusBar.setText("You pressed the button");
		      }
		      
		      public void mouseReleased(MouseEvent event) {
		         statusBar.setText("You have released the button");   
		      }
		      
		      /**
		       * métodos implementados del interface MouseMotionListener
		       */
		      public void mouseDragged(MouseEvent event) {
		         statusBar.setText("You are dragging the mouse");   
		      }
		      
		      public void mouseMoved(MouseEvent event) {
		         statusBar.setText("You moved the mouse");
		      }
	   }
}
