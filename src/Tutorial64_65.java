import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Tutorial64_65 {
	public static void main(String args[ ]) { // método principal
	      Box window = new Box();
	      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      window.setSize(250, 100);
	      window.setVisible(true);
	   }
}

class Box extends JFrame {
	   private JTextField msg;
	   private JCheckBox boldBox, italicBox;
	   
	   /**
	    * Constructor
	    */
	   Box() { // Constructor
	      super("Font changer");
	      setLayout(new FlowLayout()); // añadimos Gestor de Diseño al JFrame
	      
	      msg = new JTextField("This is my sentence.", 13);
	      msg.setFont(new Font("Serif", Font.PLAIN, 14));
	      add(msg); // añadimos el JTextField al JFrame
	      
	      boldBox = new JCheckBox("Set bold");
	      add(boldBox); // añadimos el JCheckBox al JFrame
	      italicBox = new JCheckBox("Set italic");
	      add(italicBox); // añadimos el JCheckBox al JFrame
	      
	      TheHandler handler = new TheHandler();
	      boldBox.addItemListener(handler); // añadimos vigilante
	      italicBox.addItemListener(handler); // añadimos vigilante
	      
	   }
	   
	   /**
	    * clase: TheHandler (dentro de clase Box)
	    * 
	    * implements ItemListener
	    * 
	    * nota - Se pone esta clase dentro de la otra clase, porque se quieren acceder a variables de instancia privadas de la clase Box. Si la pusiera
	    * como clase separada, no prodría acceder a éstas variables.
	    *
	    */
	   private class TheHandler implements ItemListener {
	      private Font font;
	      
	      /**
	       * método implementado del interface ItemListener
	       */
	      public void itemStateChanged(ItemEvent event) {
	         if(boldBox.isSelected() && italicBox.isSelected())
	            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	         else if(boldBox.isSelected())
	            font = new Font("Serif", Font.BOLD, 14);
	         else if(italicBox.isSelected())
	            font = new Font("Serif", Font.ITALIC, 14);
	         else
	            font = new Font("Serif", Font.PLAIN, 14);
	         
	         msg.setFont(font);
	      }
	   }
	   
	}


