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
	   
	   public static void main(String args[ ]) { // m�todo principal
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
		      add(mousePanel, BorderLayout.CENTER); // a�adimos JPanel al JFrame (aplicandole un dise�o y situandolo en su centro)
		      
		      statusBar = new JLabel("Go on - do something"); // creamos JLabel...
		      add(statusBar, BorderLayout.SOUTH); // a�adimos JLabel al JFrame (aplic�ndole dise�o y situ�ndolo abajo)
		      
		      HandlerClass handler = new HandlerClass(); // instanciamos clase...
		      mousePanel.addMouseListener(handler); // a�adimos vigilante, pas�ndole la clase...
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
		       * m�todos implementados del interface MouseListener
		       */
		      public void mouseClicked(MouseEvent event) {
		         statusBar.setText(String.format("Mouse clicked at %d, %d", event.getX(), event.getY()));   
		      }
		      
		      public void mouseEntered(MouseEvent event) { // cuando entra el rat�n, el fondo se pone rojo
		         mousePanel.setBackground(Color.RED);   
		      }
		      
		      public void mouseExited(MouseEvent event) { // cuando sale el rat�n, el fondo se pone azul
		         mousePanel.setBackground(Color.BLUE);   
		      }
		      
		      public void mousePressed(MouseEvent event) {
		         statusBar.setText("You pressed the button");
		      }
		      
		      public void mouseReleased(MouseEvent event) {
		         statusBar.setText("You have released the button");   
		      }
		      
		      /**
		       * m�todos implementados del interface MouseMotionListener
		       */
		      public void mouseDragged(MouseEvent event) {
		         statusBar.setText("You are dragging the mouse");   
		      }
		      
		      public void mouseMoved(MouseEvent event) {
		         statusBar.setText("You moved the mouse");
		      }
	   }
}
