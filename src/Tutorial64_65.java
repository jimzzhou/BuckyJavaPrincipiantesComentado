import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Tutorial64_65 {
	public static void main(String args[ ]) { // m�todo principal
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
	      setLayout(new FlowLayout()); // a�adimos Gestor de Dise�o al JFrame
	      
	      msg = new JTextField("This is my sentence.", 13);
	      msg.setFont(new Font("Serif", Font.PLAIN, 14));
	      add(msg); // a�adimos el JTextField al JFrame
	      
	      boldBox = new JCheckBox("Set bold");
	      add(boldBox); // a�adimos el JCheckBox al JFrame
	      italicBox = new JCheckBox("Set italic");
	      add(italicBox); // a�adimos el JCheckBox al JFrame
	      
	      TheHandler handler = new TheHandler();
	      boldBox.addItemListener(handler); // a�adimos vigilante
	      italicBox.addItemListener(handler); // a�adimos vigilante
	      
	   }
	   
	   /**
	    * clase: TheHandler (dentro de clase Box)
	    * 
	    * implements ItemListener
	    * 
	    * nota - Se pone esta clase dentro de la otra clase, porque se quieren acceder a variables de instancia privadas de la clase Box. Si la pusiera
	    * como clase separada, no prodr�a acceder a �stas variables.
	    *
	    */
	   private class TheHandler implements ItemListener {
	      private Font font;
	      
	      /**
	       * m�todo implementado del interface ItemListener
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


