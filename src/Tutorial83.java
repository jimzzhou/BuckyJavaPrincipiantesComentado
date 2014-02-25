import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Tutorial83 extends JFrame{
	   private JButton leftButton, centerButton, rightButton; // variables de instancia...
	   private FlowLayout layout;
	   private Container container;
	   
	   /**
	    * main -- método principal --
	    * 
	    * @param args (String)
	    */
	   public static void main(String args[ ]) { // método principal
		  Tutorial83 gui = new Tutorial83();
	      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      gui.setSize(400, 150);
	      gui.setVisible(true);
	   }
	   
	   /**
	    * Constructor
	    */
	   Tutorial83() {
	      super("imba layout program");
	      layout = new FlowLayout(); // creamos Gestor de Diseño
	      setLayout(layout); // aplicamos Gestor de Diseño...
	      container = getContentPane(); // devuelve el contentPane  al Container...
	      
	      leftButton = new JButton("left"); // creamos botón
	      add(leftButton); // añadimos botón al JFrame
	      centerButton = new JButton("center"); // idem...
	      add(centerButton); // idem...
	      rightButton = new JButton("right"); // idem...
	      add(rightButton); // idem...
	      
	      HandlerClass handler = new HandlerClass();
	      leftButton.addActionListener(handler); // añadimos vigilante, pasándole la clase que se activará cuando el vigilante detecte que se pulsa sobre el botón...
	      centerButton.addActionListener(handler); // idem...
	      rightButton.addActionListener(handler); // idem...
	   }
	   
	   /**
	    * Clase: HandlerClass -- dentro de la clase Tutorial82 --
	    * 
	    * @implements: ActionListener
	    *
	    */
	   private class HandlerClass implements ActionListener { // utilizamos una clase dentro de otra clase, porque queremos acceder a las variables de instancia de la clase padre...
		  /**
		   * método implementado del interface ActionListener
		   */
	      public void actionPerformed(ActionEvent event) { 
	         if(event.getSource() == leftButton) {
	            layout.setAlignment(FlowLayout.LEFT); // aplica Gestor de Diseño existente a la izquierda
	            layout.layoutContainer(container);
	         }
	         else if(event.getSource() == centerButton) {
	            layout.setAlignment(FlowLayout.CENTER); // aplica Gestor de Diseño existente de manera centrada
	            layout.layoutContainer(container);
	         }
	         else if(event.getSource() == rightButton) {
	            layout.setAlignment(FlowLayout.RIGHT); // aplica Gestor de Diseño existente a la derecha
	            layout.layoutContainer(container);
	         }
	      }
	   }
}
